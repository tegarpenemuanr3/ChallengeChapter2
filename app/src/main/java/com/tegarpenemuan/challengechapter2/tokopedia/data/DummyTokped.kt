package com.tegarpenemuan.minichallenge2.data

import com.tegarpenemuan.challengechapter2.R
import com.tegarpenemuan.minichallenge2.model.CategoryTokpedModel

object DummyTokped {
    val CATEGORY_TOKPEDS: List<CategoryTokpedModel> = listOf(
        CategoryTokpedModel(
            avatar = R.drawable.ic_officialstore,
            desc = "Official Store",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.ic_lihatsemua,
            desc = "Lihat Semua",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.ic_kebutuhanharian,
            desc = "Kebutuhan Harian",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.ic_hp,
            desc = "HP & Tablet",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.ic_topup,
            desc = "Top-Up & Tagihan",
        ),
        CategoryTokpedModel(
            avatar = R.drawable.ic_keuangan,
            desc = "Keuangan",
        ),
    )
}