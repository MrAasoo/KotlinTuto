package controlflow

fun main(args: Array<String>) {
    /*
        print("Enter your age : ")
        var a: Int = readLine()!!.toInt()

        if (a > 30) {
            if (a > 60) {
                println("You are a senior.")
            } else {
                println("You are a grown.")
            }
        } else if (a > 19) {
            println("You are an adult.")
        } else if (a > 13) {
            println("You are a teenager")
        } else {
            println("You are a child")
        }
    */

    println("Enter three age to find oldest-")
    print("First person : ")
    var x: Int = readLine()!!.toInt()
    print("Second person : ")
    var y: Int = readLine()!!.toInt()
    print("Third person : ")
    var z: Int = readLine()!!.toInt()



    if (x == z && x == y)
        println("All person is same aged")
    else if (x >= y && x >= z) {
        if (x > y && x > z)
            println("First person is oldest")
        else if (x == y)
            println("First and Third person is oldest")
        else
            println("First and Second person is oldest")
    } else if (y >= z) {
        if (y > z)
            println("Second person is oldest")
        else
            println("Second and Third person is oldest")
    } else
        println("Third person is oldest")


}