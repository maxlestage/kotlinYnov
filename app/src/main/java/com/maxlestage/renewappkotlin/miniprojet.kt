package com.maxlestage.renewappkotlin

fun main() {
    var html =  RequestUtils.sendGet("https://www.google.fr")
    println("html=$html")
}