package operators


/**
 * Created by Himanshu Srivastava on 30,July,2023
 * Project KotlinTuto
 */
fun main(args: Array<String>) {
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("number = " + number)
    println("+number = " + +number)
    println("-number = " + -number)
    println("++number = " + ++number)
    println("--number = " + --number)
    println("isCheck = " + isCheck)
    println("!isCheck = " + !isCheck)

    println("-------------------------------")
    var a: Int = 5
    println("a = " + a)
    println("Prefix - ++a = " + ++a)
    println("a = " + a)
    println("Suffix - a++ = " + a++)
    println("a = " + a)
}