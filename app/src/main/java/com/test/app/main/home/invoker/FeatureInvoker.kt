package com.test.app.main.home.invoker

import com.test.app.main.home.model.Feature
import com.test.app.main.home.model.News

class FeatureInvoker() : IFeatureInvoker {

    override fun getAllItems(): List<Feature> {
        return MockDataService.mockAllItems()
    }

    override fun getFeatureItems(): List<Feature> {
        return MockDataService.mockFeatureItems()
    }

    override fun getNews(): List<News> {
        return MockDataService.mockNewsItems()
    }

}

