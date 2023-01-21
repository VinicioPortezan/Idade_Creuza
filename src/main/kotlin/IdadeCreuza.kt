fun main() {
    println("Em que ano nós estamos?")
    val anoAtual = readln().toInt()
    println("Em que ano eu nasci?")
    val anoNascimento = readln().toInt()
    val idade = calculoIdade(anoAtual, anoNascimento)
    println("Eu tenho $idade anos!")
}
fun calculoIdade(anoAtual: Int, anoNascimento: Int): Int {
    return anoAtual-anoNascimento

}

