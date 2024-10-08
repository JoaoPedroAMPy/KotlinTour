fun main(){

var customers = 10

// Some customers leave the queue
customers = 8

customers = customers + 3 // Example of addition: 11
customers += 7            // Example of addition: 18
customers -= 3            // Example of subtraction: 15
customers *= 2            // Example of multiplication: 30
customers /= 3            // Example of division: 10

println(customers) // 10

// Variable declared without initialization
val d: Int
// Variable initialized
d = 3

// Variable explicitly typed and initialized
val e: String = "hello"

// Variables can be read because they have been initialized
println(d) // 3
println(e) // hello

}

/* 

// Variable declared without initialization
val d: Int

// Triggers an error
println(d)
// Variable 'd' must be initialized]

*/