package operators

fun main(args: Array<String>) {
    /*
    *   Category            Operator                Priority
    *   ************************************************************
    *   Unary               ++, --, +, -, !         First(Highest)
    *   Multiplicative      *, /, %                 Second
    *   Additive            +,  -                   Third
    *   Relation            <, <=, >=, >            Fourth
    *   Equality            ==, !=                  Fifth
    *   Conditional AND     &&                      Sixth
    *   Conditional OR      ||                      Seventh
    *   Assignment          =, +=, -=, *=, /=, %=   Lowest
    * */

    var a: Int = 5
    var b: Int = 7
    var c: Int = 10

    println("a : $a, b : $b, c : $c")

    var result: Int = a + b * c
    println("a + b * c = " + result)
    result = (a + b) * c
    println("(a + b) * c = " + result)
    result = ++a + b++ - c
    println("++a + b++ - c = " + result)
}