// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    // write your code here
    val rangeNumberLeft1 = readln().toInt()
    val rangeNUmberMax1 = readln().toInt()
    val rangeNumberLeft2 = readln().toInt()
    val rangeNUmberMax2 = readln().toInt()
    val number = readln().toInt()

    val output = (number in rangeNumberLeft1..rangeNUmberMax1 || number in rangeNumberLeft2..rangeNUmberMax2)
    println(output)
}
