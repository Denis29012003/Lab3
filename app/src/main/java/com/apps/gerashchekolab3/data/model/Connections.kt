package com.apps.gerashchekolab3.data.model

import com.google.gson.annotations.SerializedName


data class Connections (

  @SerializedName("groupAffiliation" ) var groupAffiliation : String? = null,
  @SerializedName("relatives"        ) var relatives        : String? = null

)