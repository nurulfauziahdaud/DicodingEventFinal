package com.nfd.dicodingevent.data.remote.retrofit

import com.nfd.dicodingevent.data.remote.response.EventsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("events")
    suspend fun getEvents(
        @Query("active") active: Int = 1,
        @Query("limit") limit: Int = 40,
        @Query("q") query: String? = null
    ): EventsResponse
}