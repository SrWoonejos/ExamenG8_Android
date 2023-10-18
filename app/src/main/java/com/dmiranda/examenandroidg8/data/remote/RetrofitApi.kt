package com.dmiranda.examenandroidg8.data.remote

import android.provider.ContactsContract
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {
    @GET("assets")
    suspend fun getData(): Response<ContactsContract.Contacts.Data>
}