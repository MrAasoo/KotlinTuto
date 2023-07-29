package basic


/**
 * Created by Himanshu Srivastava on 29,July,2023
 * Project KotlinTuto
 */

fun main(args: Array<String>) {

    println("-------------arrayListOf<String>()--------------")
    var language = arrayListOf<String>("Kotlin", "Java", "Python")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : ${language[2]}")
    println("ArrayList size : ${language.size}")

    println("-------------add(element)--------------")
    language.add("Php")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : ${language[2]}")
    println("Fourth element : ${language[3]}")
    println("ArrayList size : ${language.size}")

    println("-------------add(index, element)--------------")
    language.add(3,"Ruby")
    println("First element : " + language[0])
    println("Second element : " + language.get(1))
    println("Third element : ${language[2]}")
    println("Fourth element : ${language[3]}")
    println("Fifth element : ${language[4]}")
    println("ArrayList size : ${language.size}")


    println("-------------ArrayList<Int>--------------")
    println("-------------add(element)--------------")
    var age = ArrayList<Int>()

    age.add(10) //index 0
    age.add(15) //index 1
    age.add(20) //index 2
    println("First element : " + age[0])
    println("Second element : " + age.get(1))
    println("Third element : ${age[2]}")
    println("ArrayList size : ${age.size}")

    println("-------------add(index, element)--------------")
    age.add(3, 25) //index 3
    println("First element : " + age[0])
    println("Second element : " + age.get(1))
    println("Third element : ${age[2]}")
    println("Fourth element : ${age[3]}")
    println("ArrayList size : ${age.size}")

    println("-------------remove(element)--------------")
    age.remove(20)
    println("First element : " + age[0])
    println("Second element : " + age.get(1))
    println("Third element : ${age[2]}")
    println("ArrayList size : ${age.size}")

    println("-------------removeAt(index)--------------")
    age.removeAt(1)
    println("First element : " + age[0])
    println("Second element : " + age.get(1))
    println("ArrayList size : ${age.size}")


    println("------------- ArrayList<Any>()--------------")
    var mixArray = ArrayList<Any>()

    mixArray.add(10) //index 0
    mixArray.add("Himanshu") //index 1
    mixArray.add(true) //index 2
    mixArray.add(4.5) //index 3
    println("First element : " + mixArray[0])
    println("Second element : " + mixArray[1])
    println("Third element : ${mixArray[2]}")
    println("Fourth element : ${mixArray[3]}")
    println("ArrayList size : ${mixArray.size}")
}