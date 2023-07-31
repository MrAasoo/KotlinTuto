package operators


/**
 * Created by Himanshu Srivastava on 30,July,2023
 * Project KotlinTuto
 */

fun main(args: Array<String>) {
    var x: Int = 27
    var y: Int = 23
    var z: Int = x + y

    println("X = " + x)
    println("Y = " + y)
    println("Z = X + Y = " + z)

    z += x // z = z + x
    println("Z += X = " + z)

    z -= x // z = z - x
    println("Z -= X = " + z)

    z *= x // z = z * x
    println("Z *= X = " + z)

    z /= x // z = z / x
    println("Z /= X = " + z)

    z %= x // z = z % x
    println("Z %= X = " + z)
}