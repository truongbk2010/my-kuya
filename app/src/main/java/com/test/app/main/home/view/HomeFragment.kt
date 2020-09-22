package com.test.app.main.home.view

import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.maps.model.LatLng
import com.test.app.R
import com.test.app.base.BaseFragment
import com.test.app.main.home.adapter.HomeAdapter
import com.test.app.main.home.adapter.NewsAdapter
import com.test.app.main.home.invoker.FeatureInvoker
import com.test.app.main.home.model.BaseModel
import com.test.app.main.home.presenter.DataType
import com.test.app.main.home.presenter.FeaturePresenter
import com.test.app.main.home.presenter.IFeaturePresenter
import com.test.app.map.MapsActivity
import com.test.app.util.checkItemsAre
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.layout_featured_container.*
import kotlinx.android.synthetic.main.layout_whatsnew_container.*

class HomeFragment : BaseFragment(), View.OnClickListener, IFeatureView {

    private lateinit var homeAdapter: HomeAdapter
    private lateinit var featuredAdapter: HomeAdapter
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var presenter: IFeaturePresenter

    private val REQUEST_CODE_LOCATION = 100
    private var latLng: LatLng? = null
    private var address: String = ""

    override fun setLayoutId(): Int = R.layout.fragment_home

    override fun initView() {
        presenter = FeaturePresenter(this, FeatureInvoker())

        featuredAdapter = HomeAdapter()
        homeAdapter = HomeAdapter()
        newsAdapter = NewsAdapter()

        //Init UI
        setOnClickListener(txt_address, btn_expand)
        recycler_all_item.layoutManager = GridLayoutManager(context, 3)
        recycler_all_item.adapter = homeAdapter

        recycler_featured.layoutManager = GridLayoutManager(context, 3)
        recycler_featured.adapter = featuredAdapter

        recycler_whatsnew.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recycler_whatsnew.adapter = newsAdapter

        //Init data
        presenter.fetchAllData()
    }


    override fun onSuccess(type: Int, data: List<BaseModel>) {
        when (type) {
            DataType.FEATURE -> {
                featuredAdapter.data = data.checkItemsAre()
                featuredAdapter.notifyDataSetChanged()
            }

            DataType.ITEMS -> {
                homeAdapter.data = data.checkItemsAre()
                homeAdapter.notifyDataSetChanged()
            }

            DataType.NEWS -> {
                newsAdapter.data = data.checkItemsAre()
                newsAdapter.notifyDataSetChanged()
            }

        }
    }

    override fun onError(errorCode: Int, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.txt_address -> {
                navigateToMap()
            }

            R.id.btn_expand -> {
                btn_expand.isSelected = !btn_expand.isSelected
                homeAdapter.setExpand(btn_expand.isSelected)
            }
        }
    }


    private fun navigateToMap() {
        val intent = Intent(
            context,
            MapsActivity::class.java
        )
        if (address.isNotBlank()) {
            intent.putExtra("address", address)
        }
        latLng?.let {
            intent.putExtra("latLng", latLng)
        }
        startActivityForResult(
            intent
            , REQUEST_CODE_LOCATION
        )
    }

    private fun updateLocation(address: String, latLng: LatLng?) {
        this.latLng = latLng
        if (address.isNotBlank()) {
            this.address = address
            txt_address.text = address
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_LOCATION && resultCode == Activity.RESULT_OK) {
            data?.let { intent ->
                val address = intent.getStringExtra("address") ?: ""
                val latLng = intent.getParcelableExtra("latLng") as? LatLng
                updateLocation(address, latLng)
            }
        }
    }

}