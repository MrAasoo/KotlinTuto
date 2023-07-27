package basic


/**
 * Created by Himanshu Srivastava on 27,July,2023
 * Project KotlinTuto
 */
fun main(args: Array<String>) {

    /*
    * toByte()
    * toShort()
    * toInt()
    * toLong()
    * toFloat()
    * toDouble()
    */

    // Double>Float>Long>Int>Short>Byte

    var a:Byte = 127
    var b:Int = a.toInt()
    var c:Double = b.toDouble()

    println(a)
    println(b)
    println(c)

    var x:Double = 144.44
    var y:Int = x.toInt()
    var z:Byte = y.toByte()

    println(x)
    println(y)
    println(z)

}