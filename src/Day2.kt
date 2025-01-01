import kotlin.jvm.functions.FunctionN

fun main() {
    whileFunc()
    doWhile()
    breakAndContinueFunc()
    arrayOperations()
    rangeFunc()
    myFunction("Harry", 18)
    println(divideBy10(20))
    println(add(20, 10))
    println(shortAdd(20, 10))
}

//while loop
fun whileFunc() {
    var i = 0
    while (i<5) {
        println(i)
        i++
    }
}

//do while
fun doWhile() {
    var i = 0
    do {
        println(i)
        i++
    } while (i<5)
}

//break and continue

fun breakAndContinueFunc() {
    var i = 0
    while (i<10) {
        if(i==4) {
            //break
            i++
            continue
        }
        println(i)
        i++
    }
}

//arrays
fun arrayOperations() {
    val cars = arrayOf("Ferrari", "Mercedes", "Mclaren", "Red Bull")
    println(cars[0])
    cars[3] = "Ford"
    println(cars[3])
    println(cars.size) //size
    //check if an element exists
    if ("Ferrari" in cars) {
        println("It exists")
    } else {
        println("It doesn't exist")
    }
    //loop through an array
    for (car in cars) {
        println(car)
    }
}

//ranges
fun rangeFunc() {
    for (num in 1..10) {
        println(num)
    }
}

//function parameters
fun myFunction(name: String, age: Int) {
    println("$name is $age")
}

//function with return values
fun divideBy10(x: Int): Int {
    return (x/10)
}

//add function
fun add(x: Int, y:Int): Int {
    return (x+y)
}

// shorter return value function
fun shortAdd(x: Int, y: Int) = x+y