package com.tegarpenemuan.minichallenge2.data

import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.minichallenge2.model.CategoryTokpedModel

object DummyTokped {
    val CATEGORY_TOKPEDS: List<CategoryTokpedModel> = listOf(
        CategoryTokpedModel(
            avatar = R.drawable.official,
            desc = "Official Store",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.masker,
            desc = "Lihat Semua",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.calender,
            desc = "Kebutuhan Harian",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.play,
            desc = "HP & Tablet",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.pedulilindungi,
            desc = "Lihat Semua",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.send,
            desc = "Keuangan",
        ),
    )
}