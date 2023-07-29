package fundamental


/**
 * Created by Himanshu Srivastava on 27,July,2023
 * Project KotlinTuto
 */

fun main(args: Array<String>) {
    var age = arrayOf(10, 20, 30, 40)
    println("First element : " + age[0])
    println("Second element : " + age.get(1))
    println("Third element : " + age.get(2))
    println("Fourth element : " + age[3])
    println("Size of age array : " + age.size)

    println("---------------STRING ARRAY-----------------------")

    var language = arrayOf("Java", "Kotlin", "Python", "PHP")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : " + language.get(2))
    println("Fourth element : " + language[3])

    language.set(3, "php")
    println("----------------SET----------------------")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : " + language.get(2))
    println("Fourth element : " + language[3])

    //language.set(4, "Ruby")
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    language.reverse()
    println("--------------REVERSE------------------------")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : " + language.get(2))
    println("Fourth element : " + language[3])
}