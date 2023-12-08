package com.apps.gerashchekolab3.data.retrofit

object Common {
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient().create(RetrofitServices::class.java)
}