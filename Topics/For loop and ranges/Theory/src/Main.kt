// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
//    for (i in 1..3) {
//        for (j in 1..i) {
//            print(j)
//        }
//    }

        // put your code here
        val number1 = readln().toLong()
        val number2 = readln().toLong()
        var sum = 1L

        for (i in number1 until number2) {

             sum *= i


//            println(i)
        }
    println(sum)
}
