package com.test.app.main.home.invoker

import com.test.app.R
import com.test.app.main.home.model.Feature
import com.test.app.main.home.model.News

object MockDataService{

    const val TYPE_CLEANING = "TYPE_CLEANING"
    const val TYPE_EVENT_ASSISTANT = "TYPE_EVENT_ASSISTANT"
    const val TYPE_OFFICE_ASSISTANT = "TYPE_OFFICE_ASSISTANT"
    const val TYPE_COFFEE_DELIVERY = "TYPE_COFFEE_DELIVERY"
    const val TYPE_FOOD_DELIVERY = "TYPE_FOOD_DELIVERY"
    const val TYPE_SHOPPING = "SHOPPING"
    const val TYPE_GROCERY_DELIVERY = "GROCERY_DELIVERY"
    const val TYPE_MESSENGER = "MESSENGER"
    const val TYPE_BILLS_PAYMENT = "BILLS_PAYMENT"
    const val TYPE_PERSONAL_ASSISTANT = "PERSONAL_ASSISTANT"
    const val TYPE_ASSISTANT_ON_BIKE = "ASSISTANT_ON_BIKE"
    const val TYPE_QUEUEING_UP = "QUEUEING_UP"
    const val TYPE_PET_SITTING = "PET_SITTING"
    const val TYPE_FLYERING = "FLYERING"
    const val TYPE_DISH_WASHING = "DISH_WASHING"
    const val TYPE_CASH_ON_DELIVERY = "CASH_ON_DELIVERY"
    const val TYPE_MASSAGE = "MASSAGE"
    const val TYPE_DEEP_CLEANING = "DEEP_CLEANING"
    const val TYPE_CAR_WASH_AND_WAX = "CAR_WASH_AND_WAX"
    const val TYPE_MANICURE_PEDICURE = "MANICURE_PEDICURE"
    
    fun mockNewsItems(): ArrayList<News> {
        val list: ArrayList<News> = ArrayList()
        list.add(News(R.drawable.ic_whatsnew_1, "How to use the App", "Getting access to on-demand..."))
        list.add(News(R.drawable.ic_whatsnew_2, "List Your Service on My App", "Do You Offer Manpower..."))
        return list
    }

    fun mockFeatureItems(): ArrayList<Feature> {
        val list: ArrayList<Feature> = ArrayList()
        var data = MainFeature.CLEANING.getFeature()
        list.add(data)
        data = MainFeature.SHOPPING.getFeature()
        list.add(data)
        data = MainFeature.MASSAGE.getFeature()
        list.add(data)
        return list
    }

    fun mockAllItems(): ArrayList<Feature> {
        val list: ArrayList<Feature> = ArrayList()
        var data = MainFeature.CLEANING.getFeature()
        list.add(data)
        data = MainFeature.EVENT_ASSISTANT.getFeature()
        list.add(data)
        data = MainFeature.OFFICE_ASSISTANT.getFeature()
        list.add(data)
        data = MainFeature.COFFEE_DELIVERY.getFeature()
        list.add(data)
        data = MainFeature.FOOD_DELIVERY.getFeature()
        list.add(data)
        data = MainFeature.SHOPPING.getFeature()
        list.add(data)
        data = MainFeature.GROCERY_DELIVERY.getFeature()
        list.add(data)
        data = MainFeature.MESSENGER.getFeature()
        list.add(data)
        data = MainFeature.BILLS_PAYMENT.getFeature()
        list.add(data)
        data = MainFeature.PERSONAL_ASSISTANT.getFeature()
        list.add(data)
        data = MainFeature.ASSISTANT_ON_BIKE.getFeature()
        list.add(data)
        data = MainFeature.QUEUEING_UP.getFeature()
        list.add(data)
        data = MainFeature.PET_SITTING.getFeature()
        list.add(data)
        data = MainFeature.FLYERING.getFeature()
        list.add(data)
        data = MainFeature.DISH_WASHING.getFeature()
        list.add(data)
        data = MainFeature.CASH_ON_DELIVERY.getFeature()
        list.add(data)
        data = MainFeature.MASSAGE.getFeature()
        list.add(data)
        data = MainFeature.DEEP_CLEANING.getFeature()
        list.add(data)
        data = MainFeature.CAR_WASH_AND_WAX.getFeature()
        list.add(data)
        data = MainFeature.MANICURE_PEDICURE.getFeature()
        list.add(data)
        return list
    }

    enum class MainFeature(private val feature: Feature) {
        CLEANING(Feature(R.drawable.icon_1, "Cleaning",  TYPE_CLEANING)),
        EVENT_ASSISTANT(
            Feature(
                R.drawable.icon_2,
                "Event Assistant",
                 TYPE_EVENT_ASSISTANT
            )
        ),
        OFFICE_ASSISTANT(
            Feature(
                R.drawable.icon_3,
                "Office Assistant",
                 TYPE_OFFICE_ASSISTANT
            )
        ),
        COFFEE_DELIVERY(
            Feature(
                R.drawable.icon_4,
                "Coffee Delivery",
                 TYPE_COFFEE_DELIVERY
            )
        ),
        FOOD_DELIVERY(Feature(R.drawable.icon_5, "Food Delivery",  TYPE_FOOD_DELIVERY)),
        SHOPPING(Feature(R.drawable.icon_6, "Shopping",  TYPE_SHOPPING)),
        GROCERY_DELIVERY(
            Feature(
                R.drawable.icon_7,
                "Grocery Delivery",
                 TYPE_GROCERY_DELIVERY
            )
        ),
        MESSENGER(Feature(R.drawable.icon_8, "Messenger",  TYPE_MESSENGER)),
        BILLS_PAYMENT(Feature(R.drawable.icon_9, "Bills Payment",  TYPE_BILLS_PAYMENT)),
        PERSONAL_ASSISTANT(
            Feature(
                R.drawable.icon_10,
                "Personal Assistant",
                 TYPE_PERSONAL_ASSISTANT
            )
        ),
        ASSISTANT_ON_BIKE(
            Feature(
                R.drawable.icon_11,
                "Assistant on Bike",
                 TYPE_ASSISTANT_ON_BIKE
            )
        ),
        QUEUEING_UP(Feature(R.drawable.icon_12, "Queueing Up",  TYPE_QUEUEING_UP)),
        PET_SITTING(Feature(R.drawable.icon_13, "Pet Setting",  TYPE_PET_SITTING)),
        FLYERING(Feature(R.drawable.icon_14, "Flyering",  TYPE_FLYERING)),
        DISH_WASHING(Feature(R.drawable.icon_15, "Dish Washing",  TYPE_DISH_WASHING)),
        CASH_ON_DELIVERY(
            Feature(
                R.drawable.icon_16,
                "Cash on Delivery",
                 TYPE_CASH_ON_DELIVERY
            )
        ),
        MASSAGE(Feature(R.drawable.icon_17, "Massage",  TYPE_MASSAGE)),
        DEEP_CLEANING(
            Feature(
                R.drawable.icon_18,
                "Deep Cleaning",
                 TYPE_DEEP_CLEANING
            )
        ),
        CAR_WASH_AND_WAX(
            Feature(
                R.drawable.icon_19,
                "Car Wash and Wax",
                 TYPE_CAR_WASH_AND_WAX
            )
        ),
        MANICURE_PEDICURE(
            Feature(
                R.drawable.icon_20,
                "Manicure & Pedicure",
                 TYPE_MANICURE_PEDICURE
            )
        );

        fun getFeature(): Feature {
            return feature
        }
    }
}