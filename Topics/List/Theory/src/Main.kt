// You can experiment here, it won’t be checked
import java.util.Scanner
fun main(args: Array<String>) {

    var stopSequence = 0
    var maxNumber = 0
    do {
        var numbers = readln().toInt()
        if (numbers > maxNumber) {
            maxNumber = numbers
        }
    }
    while (numbers != stopSequence)
    println(maxNumber)

}