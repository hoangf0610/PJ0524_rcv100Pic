package com.example.pj0524_rcv100pic

import kotlin.random.Random

class PicItem(
    val image: String,
    number: Int = Random.nextInt(0, 51) // khởi tạo giá trị number
) {

//    khởi tạo biến number và odd
    var number: String = number.toString()
    var odd: Boolean = true

    fun incrementNumber():String {
//      chuyển đổi number String -> Int
        val currentNumber = number.toIntOrNull() ?: 0 // default là 0, nếu chuyển đổi thất bại
        number = (currentNumber + 1).toString()
        return number
    }

    fun checkOdd() {
//        check number odd
        val currentNumber = number.toIntOrNull() ?: 0
        odd = currentNumber % 2 != 0
    }



}