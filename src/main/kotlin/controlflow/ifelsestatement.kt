package controlflow

fun main(args: Array<String>) {
    print("Enter a number : ")
    var a: Int = readLine()!!.toInt()


    if (a % 2 == 0) {
        println("Number is EVEN")
    } else {
        println("Number is ODD")
    }
}