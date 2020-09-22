package com.test.app.main.home.presenter

import com.test.app.main.home.invoker.IFeatureInvoker
import com.test.app.main.home.view.IFeatureView

class FeaturePresenter(val view: IFeatureView, val invoker: IFeatureInvoker) : IFeaturePresenter {

    override fun fetchAllData() {
        fetchFeatureList()
        fetchItemList()
        fetchNewsList()
    }

    private fun fetchFeatureList() {
        //Exception never call
        try {
            val data = invoker.getFeatureItems()
            view.onSuccess(DataType.FEATURE, data)
        } catch (e: Exception) {
            view.onError(ErrorCode.FEATURE_ERROR, e.message)
        }
    }

    private fun fetchItemList() {
        //Exception never call
        try {
            val data = invoker.getAllItems()
            view.onSuccess(DataType.ITEMS, data)
        } catch (e: Exception) {
            view.onError(ErrorCode.ITEMS_ERROR, e.message)
        }
    }

    private fun fetchNewsList() {
        //Exception never call
        try {
            val data = invoker.getNews()
            view.onSuccess(DataType.NEWS, data)
        } catch (e: Exception) {
            view.onError(ErrorCode.NEWS_ERROR, e.message)
        }
    }

    override fun onDestroy() {
        //TODO: Release resource
    }


}

