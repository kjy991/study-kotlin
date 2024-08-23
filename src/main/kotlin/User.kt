package org.example

class UserExample constructor(_userName: String) {
    val userName: String

    init {
        this.userName = _userName
    }
}

data class User(
    val userName: String = "test",
    val level: Int = 1
){

}

fun main(args: Array<String>) {
    println(User("John Doe",1).level)
    println(User(userName = "yeop", level = 3).level)
    println(User())
}