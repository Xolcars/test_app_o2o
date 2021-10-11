package com.example.o2o_test_app.models.view

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchBeerBean(
    val id: Int,
    val name: String,
    val tagline: String,
    val firstBrewed: String,
    val imageUrl: String?
): Parcelable