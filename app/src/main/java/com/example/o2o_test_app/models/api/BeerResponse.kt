package com.example.o2o_test_app.models.api

import android.os.Parcelable
import com.example.o2o_test_app.models.view.BeerBean
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class BeerResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("tagline") val tagline: String,
    @SerializedName("first_brewed") val firstBrewed: String,
    @SerializedName("description") val description: String?,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("abv") val abv: String?,
    @SerializedName("food_pairing") val foodPairing: Array<String?>
): Parcelable {
    fun toViewModel(): BeerBean {
        return BeerBean(
            id = id,
            name = name,
            tagline = tagline,
            firstBrewed = firstBrewed,
            imageUrl = imageUrl,
            description = description,
            abv = abv,
            foodPairing = foodPairing.toList()
        )
    }
}