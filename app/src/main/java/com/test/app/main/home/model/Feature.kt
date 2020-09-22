package com.test.app.main.home.model

import com.test.app.R

data class Feature(
    val image: Int = R.drawable.icon_1,
    val title: String = "Cleaning",
    val data: String = ""
): BaseModel()

data class News(
    val image: Int = R.drawable.icon_1,
    val title: String = "",
    val description: String = ""
): BaseModel()

open class BaseModel()