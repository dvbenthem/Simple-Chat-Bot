// write your code here
fun getLastDigit(number: Int): Int = Math.abs(number % 10)
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
