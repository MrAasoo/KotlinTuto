package fundamental


/**
 * Created by Himanshu Srivastava on 29,July,2023
 * Project KotlinTuto
 */

fun main(args: Array<String>) {
    var mixArray = arrayListOf<Any>("Kotlin", 1, 2, 3, 2, 'A', false, "Kotlin")
    println("----------arrayListOf<Any>-----------------")
    println("First element : " + mixArray[0])
    println("Second element : " + mixArray[1])
    println("Third element : " + mixArray[2])
    println("Fourth element : " + mixArray[3])
    println("Fifth element : " + mixArray[4])
    println("Sixth element : " + mixArray[5])
    println("Seventh element : " + mixArray[6])
    println("Eight element : " + mixArray[7])
    println("ArrayList size : ${mixArray.size}")
    println("Last element : ${mixArray.last()}")

    var mixSet = setOf<Any>("Kotlin", 1, 2, 3, 2.0, 'A', false, "Kotlin")
    println("----------setOf<Any>-----------------")
    println("SetList size : ${mixSet.size}")
    println("Last element : " + mixSet.last())
}