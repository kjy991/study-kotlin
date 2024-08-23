package org.example

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("button is clicked")
        internalPrint()
    }

    private fun internalPrint() {
        println("Button is internalPrint")
    }
}

fun main(args: Array<String>) {
    Button().click()
    println("")
    internalPrint()

}


private fun internalPrint() {
    println("Button is internalPrint")
}