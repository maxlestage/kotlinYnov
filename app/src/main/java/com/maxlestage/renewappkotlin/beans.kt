package com.maxlestage.renewappkotlin

import java.util.*

fun main() {
    val s1 = StudentBean("toto")
    s1.note++
    println(s1)
}

class PlaneBean(name: String) {
    var id = name.hashCode()
        private set

    var name = name
        set(value) {
            field = value
            id = field.hashCode()
        }

}

class UserBean(val name: String, var note: Int = 0) {
    val id = name.hashCode()
}

class PrintRandomIntBean(val max: Int) {
    private val random = Random()

    init {
        println(random.nextInt(max))
        println(random.nextInt(max))
        println(random.nextInt(max))
    }

    constructor() : this(100) {
        println(random.nextInt(max))
    }
}

data class StudentBean(val name: String) {
    var note = 0
}

