package com.test.app.main.home.invoker

import com.test.app.main.home.model.Feature
import com.test.app.main.home.model.News

interface IFeatureInvoker{
    fun getAllItems(): List<Feature>

    fun getFeatureItems(): List<Feature>

    fun getNews(): List<News>
}