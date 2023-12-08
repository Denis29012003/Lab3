package com.apps.gerashchekolab3.ui.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.apps.gerashchekolab3.data.model.SuperheroInstance
import com.apps.gerashchekolab3.data.retrofit.Common
import com.apps.gerashchekolab3.data.retrofit.RetrofitServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecycleViewModel(val context: Context) : ViewModel() {
    private var mService: RetrofitServices = Common.retrofitService
    val projectsLiveData: MutableLiveData<List<SuperheroInstance>> = MutableLiveData()
    init {
        mService.getMovieList(

            ).enqueue(object : Callback<List<SuperheroInstance>> {
            override fun onFailure(call: Call<List<SuperheroInstance>>, t: Throwable) {
                showToast()
            }

            override fun onResponse(
                call: Call<List<SuperheroInstance>>,
                response: Response<List<SuperheroInstance>>
            ) {
                projectsLiveData.value=response.body()
            }
        })

    }
    private fun showToast(){
        Toast.makeText(context, "Network error", Toast.LENGTH_SHORT).show()
    }
}