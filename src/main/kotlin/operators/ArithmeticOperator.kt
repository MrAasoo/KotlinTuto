package operators


/**
 * Created by Himanshu Srivastava on 30,July,2023
 * Project KotlinTuto
 */
fun main(args: Array<String>) {

    var num1: Double = 8.4
    var num2: Double = 8.2

    var result: Double = 0.0

    println("Number 1 = " + num1)
    println("Number 2 = " + num2)

    result = num1 + num2
    println("Number 1 + Number 2 = " + result)

    result = num1 - num2
    println("Number 1 - Number 2 = " + result)

    result = num1 * num2
    println("Number 1 * Number 2 = " + result)

    result = num1 / num2
    println("Number 1 / Number 2 = " + result)

    result = num1 % num2
    println("Number 1 % Number 2 = " + result)
}