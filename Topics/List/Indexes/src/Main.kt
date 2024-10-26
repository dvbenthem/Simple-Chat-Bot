fun solution(products: List<String>, product: String) {
    // put your code here
 
    var listProduct = emptyList<Int>()
    
    for ((index, item) in products.withIndex()){

        if (item.contains(product)){

            listProduct += index
        }
     
    }
    println(listProduct.joinToString(" "))
}
