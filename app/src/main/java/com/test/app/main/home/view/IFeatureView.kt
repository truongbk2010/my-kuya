package com.test.app.main.home.view

import com.test.app.main.home.model.BaseModel

interface IFeatureView{
    fun onSuccess(type: Int, data: List<BaseModel>)

    fun onError(errorCode: Int, message: String?)
}