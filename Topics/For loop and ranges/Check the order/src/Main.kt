import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val totalNumbers = scanner.nextInt()
    var temp_variable = 0
    var string = ""
    for (i in 1..totalNumbers) {
        var numbers = scanner.nextInt()
        if (numbers > temp_variable) {
            temp_variable = numbers
            string = "YES"
        } else {
            string = "NO"
        }
    }
    println(string)
}