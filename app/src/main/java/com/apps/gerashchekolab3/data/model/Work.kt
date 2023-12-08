package com.apps.gerashchekolab3.data.model

import com.google.gson.annotations.SerializedName


data class Work (

  @SerializedName("occupation" ) var occupation : String? = null,
  @SerializedName("base"       ) var base       : String? = null

)