package controlflow

fun main(args: Array<String>) {
    print("Enter your age : ")
    var a: Int = readLine()!!.toInt()

    if (a > 50) {
        println("You are a senior.")
    } else if (a > 30) {
        println("You are a grown.")
    } else if (a > 19) {
        println("You are an adult.")
    } else if (a > 13) {
        println("You are a teenager")
    } else {
        println("You are a child")
    }
}