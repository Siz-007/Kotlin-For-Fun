//Day1 - Syntax
//Single line comment
/* multi-line
comments */

fun main() {
    println("Hello World!")
    variables()
    dataTypes()
    stringManipulation()
    ifElse()
    whenFunc()
}

//Variables
fun variables() {
    var name = "Dexter Morgan" //variable
    name = "Name is Changed"
    val yob = 1990 //constant
    println("$name,$yob")
}

//data types
fun dataTypes() {
    val intData = 5
    val doubleData = 3.1415
    val charData = 'S'
    val booleanData = true
    val stringData = "String"
    println(intData)
    println(doubleData)
    println(charData)
    println(booleanData)
    println(stringData)
}

//operators are similar to all the other programming languages

//String Manipulation

fun stringManipulation() {
    val message1 = "Hello, this is me learning kotlin just for fun."
    val message2 = "Hello, this is me learning kotlin just for fun."
    println(message1[0])
    println(message1.length)
    println(message1.uppercase())
    println(message1.lowercase())
    println(message1.compareTo(message2)) //equal if output is 0.
    println(message1.indexOf("Hello"))
    println(message1.plus(message2))
    println("$message1 and $message2 are same.")
}

//if...else
fun ifElse() {
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time>10 && time<20) {
        println("Good Day.")
    } else {
        println("Good evening.")
    }
}

//when (Similar to Switch statement)
fun whenFunc() {
    val day = 2
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}