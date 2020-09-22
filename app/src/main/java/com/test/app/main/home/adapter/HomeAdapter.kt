package com.test.app.main.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.app.R
import com.test.app.main.home.model.Feature
import kotlinx.android.synthetic.main.item_feature.view.*

class HomeAdapter() : RecyclerView.Adapter<HomeAdapter.DataViewHolder>() {

    var onClickListener: ((position: Int, feature: Feature) -> Unit)? = null
    var data: List<Feature> = listOf()
    var isExpanded = false

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(feature: Feature) {
            itemView.apply {
                image.setImageResource(feature.image)
                title.text = feature.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_feature, parent,
                false
            )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClickListener?.invoke(position, item)
        }
    }

    override fun getItemCount(): Int {
        if (data.size > 9 && !isExpanded) {
            return 9
        } else {
            return data.size
        }
    }

    fun setExpand(value: Boolean){
        this.isExpanded = value
        notifyDataSetChanged()
    }
}