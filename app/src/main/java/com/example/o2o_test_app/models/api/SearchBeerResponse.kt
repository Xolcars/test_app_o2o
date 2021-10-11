package com.example.o2o_test_app.models.api

import android.os.Parcelable
import com.example.o2o_test_app.models.view.SearchBeerBean
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchBeerResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("tagline") val tagline: String,
    @SerializedName("first_brewed") val firstBrewed: String,
    @SerializedName("image_url") val imageUrl: String?,
): Parcelable {
    fun toViewModel(): SearchBeerBean {
        return SearchBeerBean(
            id = id,
            name = name,
            tagline = tagline,
            firstBrewed = firstBrewed,
            imageUrl = imageUrl
        )
    }
}