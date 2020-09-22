package com.test.app.util

inline fun <reified T : Any> List<*>.checkItemsAre() =
    if (all { it is T })
        this as List<T>
    else arrayListOf()