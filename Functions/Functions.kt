fun hello() {
    println("Hello, world!")
}

fun main1() {
    hello()
    // Hello, world!
}

fun sum1(x: Int, y: Int): Int {
    return x + y
}

fun main2() {
    println(sum1(1, 2))
    // 3
}

fun printMessageWithPrefix1(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main3() {
    // Usa argumentos nomeados com ordem de parâmetros trocada
    printMessageWithPrefix1(prefix = "Log", message = "Hello")
    // [Log] Hello
}

fun printMessageWithPrefix2(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main4() {
    // Função chamada com ambos os parâmetros
    printMessageWithPrefix2("Hello", "Log")
    // [Log] Hello
    
    // Função chamada apenas com o parâmetro message
    printMessageWithPrefix2("Hello")        
    // [Info] Hello
    
    printMessageWithPrefix2(prefix = "Log", message = "Hello")
    // [Log] Hello
}

fun printMessage1(message: String) {
    println(message)
    // `return Unit` ou `return` é opcional
}

fun main5() {
    printMessage1("Hello")
    // Hello
}

fun sum2(x: Int, y: Int): Int {
    return x + y
}

fun main6() {
    println(sum2(1, 2))
    // 3
}

fun sum3(x: Int, y: Int) = x + y

fun main7() {
    println(sum3(1, 2))
    // 3
}

// Uma lista de nomes de usuários registrados
val registeredUsernames1 = mutableListOf("john_doe", "jane_smith")

// Uma lista de e-mails registrados
val registeredEmails1 = mutableListOf("john@example.com", "jane@example.com")

fun registerUser1(username: String, email: String): String {
    // Retorno antecipado se o nome de usuário já estiver em uso
    if (username in registeredUsernames1) {
        return "Nome de usuário já existe. Escolha um nome diferente."
    }

    // Retorno antecipado se o e-mail já estiver registrado
    if (email in registeredEmails1) {
        return "E-mail já registrado. Use um e-mail diferente."
    }

    // Prossegue com o registro se o nome de usuário e o e-mail não estiverem em uso
    registeredUsernames1.add(username)
    registeredEmails1.add(email)

    return "Usuário registrado com sucesso: $username"
}

fun main8() {
    println(registerUser1("john_doe", "newjohn@example.com"))
    // Nome de usuário já existe. Escolha um nome diferente.
    println(registerUser1("new_user", "newuser@example.com"))
    // Usuário registrado com sucesso: new_user
}

fun uppercaseString1(text: String): String {
    return text.uppercase()
}

fun main9() {
    println(uppercaseString1("hello"))
    // HELLO
}

fun main10() {
    val upperCaseString1 = { text: String -> text.uppercase() }
    println(upperCaseString1("hello"))
    // HELLO
}

val numbers1 = listOf(1, -2, 3, -4, 5, -6)

val positives1 = numbers1.filter { x -> x > 0 }

val isNegative1 = { x: Int -> x < 0 }
val negatives1 = numbers1.filter(isNegative1)

fun main11() {
    println(positives1)
    // [1, 3, 5]
    println(negatives1)
    // [-2, -4, -6]
}

val numbers2 = listOf(1, -2, 3, -4, 5, -6)
val doubled1 = numbers2.map { x -> x * 2 }

val isTripled1 = { x: Int -> x * 3 }
val tripled1 = numbers2.map(isTripled1)

fun main12() {
    println(doubled1)
    // [2, -4, 6, -8, 10, -12]
    println(tripled1)
    // [3, -6, 9, -12, 15, -18]
}

val upperCaseString2: (String) -> String = { text -> text.uppercase() }

fun main13() {
    println(upperCaseString2("hello"))
    // HELLO
}

fun toSeconds1(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main14() {
    val timesInMinutes1 = listOf(2, 10, 15, 1)
    val min2sec1 = toSeconds1("minute")
    val totalTimeInSeconds1 = timesInMinutes1.map(min2sec1).sum()
    println("O tempo total é $totalTimeInSeconds1 segundos")
    // O tempo total é 1680 segundos
}

fun main15() {
    println({ text: String -> text.uppercase() }("hello"))
    // HELLO
}

// O valor inicial é zero. 
// A operação soma o valor inicial com cada item da lista cumulativamente.
fun main16() {
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // 6
}
