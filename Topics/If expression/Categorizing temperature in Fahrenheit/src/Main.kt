import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // input temperature in Fahrenheit
    val temperature: Int = scan.nextLine().trim().toInt()

    // your code goes here
    if (temperature > 85) {
        println("High temperature")
    } else if (temperature < 50) {
        println("Low temperature")
    } else {
        println("Normal temperature")
    }

}