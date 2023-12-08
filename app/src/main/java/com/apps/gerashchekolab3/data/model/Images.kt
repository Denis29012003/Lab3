package com.apps.gerashchekolab3.data.model

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("xs" ) var xs : String? = null,
  @SerializedName("sm" ) var sm : String? = null,
  @SerializedName("md" ) var md : String? = null,
  @SerializedName("lg" ) var lg : String? = null

)