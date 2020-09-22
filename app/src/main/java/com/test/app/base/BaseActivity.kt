package com.test.app.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener {

    abstract fun setLayoutId(): Int

    abstract fun initView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initView()
    }

    fun setOnClickListener(vararg ids: View) {
        for (view in ids) view.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
    }

}