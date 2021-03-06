package com.example.vaccineslotfinder

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CowinApi {

    companion object {
        const val BASE_URL = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/"
    }

    @Headers("authority: scrapeme.live",
        "dnt:1",
        "upgrade-insecure-requests:1",
        "user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36",
        "accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        "sec-fetch-site: none",
        "sec-fetch-mode: navigate",
        "sec-fetch-user: ?1",
        "sec-fetch-dest: document",
        "Accept-Language: en-US")
    @GET("findByPin")
    fun searchPhotos(
        @Query("pincode") pincode: String,
        @Query("date") date: String,
        //@Query("per_page") perPage: Int
    ): Call<CowinResponse>
}