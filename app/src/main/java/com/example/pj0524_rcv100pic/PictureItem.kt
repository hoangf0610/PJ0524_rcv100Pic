package com.example.pj0524_rcv100pic

import java.io.Serializable
import kotlin.random.Random

class PictureItem(
    val image: String,
    var number: Int = Random.nextInt(0, 51), // khởi tạo giá trị number
    var odd : Boolean = number % 2 != 0
) : Serializable {

    fun incrementNumber():Int {
        number += 1
        odd = number % 2 != 0
        return number
    }
}