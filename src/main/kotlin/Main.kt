fun main() {
    fourWords("Prince", "Grace", "Rachel", "Jack")
    grammar()
    calculation()
   println(names("Henriete", "Florance", "Milcah", "Rebecca"))


}
//1. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun fourWords(name1: String, name2: String, name3: String, name4:String){
    var word= arrayOf(name1,name2, name3, name4)
    println(word.contentToString())
}
//2. Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun grammar(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities.map { it.capitalize() })
    println(cities.map { it.capitalize()} .sorted())
}
//3. Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order

fun calculation(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var calculate = numbers[1] + numbers [4]
    println(calculate)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(element1:String, element2:String, element3:String, element4:String): String{
    var name = arrayOf(element1, element2, element3,element4)
    return (name.contentToString())
}