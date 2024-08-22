package org.example

import org.example.Color.*
import java.time.LocalDateTime
import java.util.*
import kotlin.time.Duration

enum class Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE, WHITE
}

enum class Color2(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 255, 255), ;

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(getKoreanColor(RED))

    println(printObject("hello world"))
    println(printObject("안녕하세요"))
    println(printObject(LocalDateTime.now()))
    println(printObject(java.time.Duration.ofNanos(3456)))
}

fun getKoreanColor(color: Color): String =
    when (color) {
        RED, ORANGE -> "빨강 혹은 오렌지"
//        RED -> "빨강"
//        ORANGE -> "오렌지"
        YELLOW -> "노랑"
        GREEN -> "초록"
        BLUE -> "파랑"
        WHITE -> "화이트"
    }


fun mix(c1: Color, c2: Color): String =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }

fun trueOrFalse(b: Boolean) = when (b) {
    true -> "true"
    false -> "false"
}

fun trueOrFalse2() = when (isBeautiful()) {
    true -> "true"
    false -> "false"
}

fun isBeautiful(): Boolean {
    return true
}

fun printObject(obj: Any): Any {
    return when (obj) {
        is String -> obj.uppercase()
        is LocalDateTime -> obj.toLocalDate()
        else -> println("unknown type")
    }
}

