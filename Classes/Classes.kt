// Definição da classe Contact com uma função para imprimir o id
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun contactOperations() {
    // Cria uma instância de Contact e realiza algumas operações
    val contact = Contact(1, "thalles@gmail.com")
    
    // Imprime o email atual
    println(contact.email)            // thalles@gmail.com
    
    // Atualiza o email e imprime novamente
    contact.email = "joao@gmail.com"
    println(contact.email)            // joao@gmail.com
    
    // Chama a função printId() para imprimir o id
    contact.printId()                 // 1
}

// Definição da classe User como um data class para facilitar a comparação e cópia
data class User(val name: String, val id: Int)

fun userOperations() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Usa o toString() automaticamente para facilitar a leitura
    println(user)  // User(name=Alex, id=1)

    // Comparações entre instâncias de User
    println("user == secondUser: ${user == secondUser}")  // true
    println("user == thirdUser: ${user == thirdUser}")    // false

    // Criação de cópias
    println(user.copy())        // User(name=Alex, id=1)
    println(user.copy("Max"))   // User(name=Max, id=1)
    println(user.copy(id = 3))  // User(name=Alex, id=3)
}

fun main() {
    // Chama as funções para realizar as operações
    contactOperations()
    userOperations()
}
