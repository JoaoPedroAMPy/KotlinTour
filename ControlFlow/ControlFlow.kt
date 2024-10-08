fun main() {
    // Exemplo 1
    val dValue: Int
    val checkValue = true

    if (checkValue) {
        dValue = 1
    } else {
        dValue = 2
    }
    println(dValue) // 1

    // Exemplo 2
    val firstNumber = 1
    val secondNumber = 2
    println(if (firstNumber > secondNumber) firstNumber else secondNumber) // 2

    // Exemplo 3
    val obj1 = "Hello"
    when (obj1) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    } // Greeting

    // Exemplo 4
    val obj2 = "Hello"
    val result = when (obj2) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result) // Greeting

    // Exemplo 5
    val trafficLightState = "Red"
    val trafficAction1 = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction1) // Stop

    // Exemplo 6
    val trafficLight = "Red"
    val trafficAction2 = when (trafficLight) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction2) // Stop

    // Exemplo 7 - Laço for com range
    for (number in 1..5) {
        print(number)
    } // 12345
    println()

    // Exemplo 8 - Iterando sobre uma lista
    val cakeList = listOf("carrot", "cheese", "chocolate")
    for (cake in cakeList) {
        println("Yummy, it's a $cake cake!")
    } // Yummy, it's a carrot cake! ...

    // Exemplo 9 - Laço while
    var cakesEatenCount = 0
    while (cakesEatenCount < 3) {
        println("Eat a cake")
        cakesEatenCount++
    } // Eat a cake ...

    // Exemplo 10 - Laço do-while
    var cakesEatenTotal = 0
    var cakesBakedTotal = 0
    while (cakesEatenTotal < 3) {
        println("Eat a cake")
        cakesEatenTotal++
    }

    do {
        println("Bake a cake")
        cakesBakedTotal++
    } while (cakesBakedTotal < cakesEatenTotal)
    // Eat a cake ... Bake a cake ...
}
