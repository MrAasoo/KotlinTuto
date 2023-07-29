package fundamental


/**
 * Created by Himanshu Srivastava on 29,July,2023
 * Project KotlinTuto
 */
fun main(args: Array<String>) {
    //immutable collection
    //i.e. Need to be add elements at the time of deceleration after that you can not make any changes in map array
    var age = mapOf<String, Int>("aasoo" to 23, "saurabh" to 22)
    println("------------------mapOf<key,value>()---------------")
    println("Age of Aasoo : " + age["aasoo"])
    println("Age of Saurabh : " + age.get("saurabh"))
    println("Size of map : " + age.size)

    //mutable collection
    var mutableAge = mutableMapOf<String, Int>("aasoo" to 23, "saurabh" to 22)
    mutableAge.put("akash", 20)

    println("------------------mutableMapOf<key,value>---------------")
    println("------------------put<key,value>---------------")
    println("Age of Aasoo : " + mutableAge["aasoo"])
    println("Age of Saurabh : " + mutableAge.get("saurabh"))
    println("Age of Akash : " + mutableAge.get("akash"))
    println("Size of map : " + mutableAge.size)
}