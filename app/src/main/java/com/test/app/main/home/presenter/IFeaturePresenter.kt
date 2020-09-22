package com.test.app.main.home.presenter

import com.test.app.main.home.model.BaseModel

interface IFeaturePresenter{

    fun fetchAllData()

    fun onDestroy()

}

object DataType{
    const val FEATURE = 0
    const val ITEMS = 1
    const val NEWS = 2
}

object ErrorCode{
    const val FEATURE_ERROR = 0
    const val ITEMS_ERROR = 1
    const val NEWS_ERROR = 2
}