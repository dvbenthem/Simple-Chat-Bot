import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val sequenceLength = scanner.nextInt()

    var count = 0

    repeat(sequenceLength) { number ->
        val sequence = scanner.nextInt()
        if (sequence > 0) {
           count++


        }

    }
    println(count)

}

