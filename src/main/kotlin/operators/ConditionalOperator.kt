package operators

fun main(args: Array<String>) {
    var a: Int = 5
    var b: Int = 7
    var c: Int = 10
    var result: Boolean

    println("a : $a, b : $b, c : $c")
    //conditional AND (&&)
    result = (a > b) && (b > c)
    println("(a > b) && (b > c) : " + result)

    //conditional AND (||)
    result = (a > b) || (b > c)
    println("(a > b) || (b > c) : " + result)

    //conditional AND (&&)
    result = (a < b) && (b > c)
    println("(a < b) && (b > c) : " + result)

    //conditional AND (||)
    result = (a < b) || (b > c)
    println("(a < b) || (b > c) : " + result)
}