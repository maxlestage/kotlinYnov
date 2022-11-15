package com.maxlestage.renewappkotlin

import okhttp3.OkHttpClient
import okhttp3.Request

object RequestUtils {
    val client = OkHttpClient()

    fun sendGet(url: String): String {
        println("url : $url")
        val request = Request.Builder().url(url).build()
        return client.newCall(request).execute().use {
            if (!it.isSuccessful) {
                throw Exception("Réponse du serveur incorrect :${it.code}")
            }
            it.body.string()
        }
    }

}