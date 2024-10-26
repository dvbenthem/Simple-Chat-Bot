fun solution(numbers: List<Int>) {
    // put your code here
	// val list = listOf(1,2,3,4,5,6)
    
    val filteredList = numbers.filter{it % 2 == 0}
    println(filteredList.joinToString(" "))
}
