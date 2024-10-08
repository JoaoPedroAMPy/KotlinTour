fun main(){
// Read-only list
val readOnlyShapesList = listOf("triangle", "square", "circle")
println(readOnlyShapesList)
// [triangle, square, circle]

// Mutable list with explicit type declaration
val shapesMutableList: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapesMutableList)
// [triangle, square, circle]

val shapesCopy: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLockedList: List<String> = shapesCopy

val readOnlyShapes2 = listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes2[0]}")
// The first item in the list is: triangle

val readOnlyShapes3 = listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes3.first()}")
// The first item in the list is: triangle

val readOnlyShapes4 = listOf("triangle", "square", "circle")
println("This list has ${readOnlyShapes4.count()} items")
// This list has 3 items

val readOnlyShapes5 = listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes5)
// true

val shapesMutableList2: MutableList<String> = mutableListOf("triangle", "square", "circle")
// Add "pentagon" to the list

}