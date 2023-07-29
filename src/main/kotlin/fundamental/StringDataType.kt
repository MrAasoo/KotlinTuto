package fundamental


/**
 * Created by Himanshu Srivastava on 27,July,2023
 * Project KotlinTuto
 */

fun main(args: Array<String>) {

    var a: String = "Hello"
    var b: String = "Kotlin Language"
    println(a)
    println(a + b)
    println(a + " " + b)
    println(a + " " + b.plus("!"))

    var c: Int = 25
    println("Print other datatype method 1 : " + c)
    println("Print other datatype method 2 : $c")

    var length: Int = b.length
    println("Length b : $length")

    println(a.lowercase())
    println(b.uppercase())
}