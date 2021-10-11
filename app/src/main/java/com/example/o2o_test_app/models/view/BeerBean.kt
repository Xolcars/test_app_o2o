package com.example.o2o_test_app.models.view

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class BeerBean(
   val id: Int,
   val name: String,
   val tagline: String,
   val firstBrewed: String,
   val description: String?,
   val imageUrl: String?,
   val abv: String?,
   val foodPairing: List<String?>
): Parcelable