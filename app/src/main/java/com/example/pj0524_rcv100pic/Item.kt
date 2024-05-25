package com.example.pj0524_rcv100pic

class Item(
    val image: String,
    var number: String,
    var odd:Boolean,
) {



//    fun numberItem() {
//        val currentNumber = number.toIntOrNull() ?: 0 // default là 0, nếu chuyển đổi thất bại
//        number = Random.nextInt(0, 50).toString()
//    }

    fun incrementNumber() {
//      chuyển đổi number String -> Int
        val currentNumber = number.toIntOrNull() ?: 0 // default là 0, nếu chuyển đổi thất bại
        number = (currentNumber + 1).toString()
    }

    fun checkOdd() {
        val currentNumber = number.toIntOrNull() ?: 0
        odd = currentNumber % 2 != 0
    }
}