package ru.netology

import kotlin.math.max

fun main() {
    val amount = 456578
    val minCommission = 35.0
    val commission = (max(minCommission, amount*0.0075)).toInt()
    println("Комиссия составит $commission руб.")
    println("Комиссия составит $commission руб.")

}