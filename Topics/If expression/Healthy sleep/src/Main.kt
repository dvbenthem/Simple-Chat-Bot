fun main() {    
    // write your code here
    val A = readln().toInt()  //should sleep
    val B = readln().toInt()  //over sleep
    val H = readln().toInt()  //actual sleep


// A   6
// B   10
// H   8
//     normal


//  A  7
//  B  9
//  H  10
//     Excess

    if (H >= A && H <= B) {
        println("Normal")
    } else if (H > B) {
        println("Excess")
    } else{
        println("Deficiency")
    }
}
