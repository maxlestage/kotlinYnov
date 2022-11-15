package com.maxlestage.renewappkotlin

/* -------------------------------- */
//
/* -------------------------------- */



fun main() {
    println(min(3,4,5))
    boulangerie(nbBag = 5)
    pair(5)
}

fun boulangerie(nbCroi: Int=0, nbSand: Int=0, nbBag : Int=0) = nbCroi * PRIX_CROISSANT +nbSand *   PRIX_SANDWITCH + nbBag * PRIX_BAG


fun min(a:Int, b:Int, c:Int) = if(a <= b && a <= c) a else if(b <= a && b <= c) b else c
fun pair(c:Int) = c%2 ==0
fun myPrint(texte:String) = println("##$texte##")




