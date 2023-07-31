package userinput

fun main(args: Array<String>) {
    print("Name : ")
    var name: String? = readLine()
    print("Age : ")
    var age: Int = readln()!!.toInt()

    println("Your name is $name and age is $age")

}