package com.tegarpenemuan.minichallenge2.data

import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.minichallenge2.model.CategoryGojekModel

object DummyGojek {
    val CATEGORY_GOJEKS: List<CategoryGojekModel> = listOf(
        CategoryGojekModel(
            avatar = R.drawable.go_ride,
            desc = "GoRide",
        ),
        CategoryGojekModel(
            avatar = R.drawable.go_car,
            desc = "GoCar",
        ),
        CategoryGojekModel(
            avatar = R.drawable.go_food,
            desc = "GoFood",
        ),
        CategoryGojekModel(
            avatar = R.drawable.go_send,
            desc = "GoSend",
        ),
        CategoryGojekModel(
            avatar = R.drawable.go_mart,
            desc = "GoMart",
        ),
        CategoryGojekModel(
            avatar = R.drawable.go_pulsa,
            desc = "GoPulsa",
        ),
        CategoryGojekModel(
            avatar = R.drawable.pedulilindungi,
            desc = "Check In",
        ),
        CategoryGojekModel(
            avatar = R.drawable.more,
            desc = "Lainnya",
        ),
    )
}