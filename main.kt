import java.util.Scanner

fun main() {

    val myObj = Scanner(System.`in`)

    val nome = "Cleiton"
    val idade = 20
    val sexo = 'M'
    val peso = 70.5
    val ativo = true
    
    var val1: Int
    var val2: Int
    var adicao: Int
    var subtracao: Int
    var multiplicacao: Int
    var divisao: Int
    var modulo: Int

    var idadeTernario: Int
    var idadeTer: String

    var idadeIF: Int

    var dia: Int

    var a = 0

    var b = 0

    // var c = 0
    var m: Int
    var n: Int

    val PI = 3.14159265

    // Comentário de uma linha


    /*
     * Comentário
     * de varias linhas
     */

    // ESCREVER NA TELA
    println("#### ESCREVER NA TELA ####")
    println("Olá Mundo")
    println("")

    
    // VARIÁVEIS
    println("### VARIÁVEIS E TIPOS BÁSICOS ###")
    println("Nome: $nome")
    println("Idade: $idade")
    println("Sexo: $sexo")
    println("Peso: $peso")
    println("Ativo: $ativo")
    println("")

    // CONSTANTE
    println("### CONSTANTE ###")
    println("PI: $PI")
    println("")


    // OPERACOES
    println("#### OPERACOES ####")
    print("Informe o valor 1: ")
    val1 = myObj.nextInt()

    print("Informe o valor 2: ")
    val2 = myObj.nextInt()

    adicao = val1 + val2 // Pode usar: (+, -, *, /, %)
    subtracao = val1 - val2
    multiplicacao = val1 * val2
    divisao = val1 / val2
    modulo = val1 % val2
    println("Soma: $adicao")
    println("Subtracao: $subtracao")
    println("Multiplicacao: $multiplicacao")
    println("Divisao: $divisao")
    println("Modulo: $modulo")
    println("")


    // TERNARIO
    println("### TERNARIO ###")
    print("Digite um número: ")
    idadeTernario = myObj.nextInt()
    idadeTer = if (idadeTernario >= 18) "Maior de idade" else "Menor de idade"
    println(idadeTer)
    println("")


    
    // IF ELSE IF ELSE
    println("### IF ELSE IF ELSE ###")
    print("Informe a idade: ")
    idadeIF = myObj.nextInt()
    if (idadeIF < 12) {
        println("CRIANCA")
    } else if (idadeIF >= 12 && idadeIF < 18) {
        println("ADOLESCENTE")
    } else {
        println("ADULTO")
    }
    println("")


    // CASE
    println("### CASE ###")
    print("Informe um numero 1 - 7 para semana: ")
    dia = myObj.nextInt()

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sabado")
        else -> println("Valor nao existente")
    }
    println("")

    // REPEAT
    println("### REPEAT ###")
    println("Não tem REPEAT")
    println("")

    // DO WHILE
    println("### DO WHILE ###")
    do {
        println(a)
        a = a + 1
    } while (a < 10)
    println("")

    // WHILE
    println("### WHILE ###")
    while (b < 10) {
        println(b)
        b = b + 1
    }
    println("")

                           
    // FOR
    println("### FOR ###")
    for (c in 0..10) {
        println(c)
    }
    println("")

       // ARRAY
    println("### ARRAY ###")
    val numbers = listOf(10, 20, 30, 40)

    for (number in numbers) {
        println(number)
    }
   println("")

    // MATRIZ
    println("### MATRIZ ###")
    val matriz = Array(3) { IntArray(3) { 0 } } // Declaração de uma matriz 3x3 de inteiros

    // Inicialização da matriz
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            matriz[i][j] = i * 3 + j + 1
        }
    }

    // Acesso aos elementos da matriz
    println("Elementos da matriz:")
    for (i in 0 until 3) {
        val row = StringBuilder()
        for (j in 0 until 3) {
            row.append(matriz[i][j]).append(" ")
        }
        println(row.toString())
    }
    println("")

    // FUNCAO
    println("### FUNCAO ###")
    print("Digite o valor 1: ")
    m = myObj.nextInt()

    print("Digite o valor 2: ")
    n = myObj.nextInt()

    val resultado = soma(m, n)
    println("A soma de $m e $n é igual a $resultado")

    println("")

    // PROCEDURE
    println("### PROCEDURE ###")
    println("Não tem PROCEDURE")
    println("")

    // PONTEIRO
  println("### PONTEIRO ###\n");
  println("Não tem PONTEIRO \n");
  println(" Não é necessário liberar memória manualmente, como em C ou C++. A variável será automaticamente coletada pelo coletor de lixo quando não estiver mais em uso. \n");
  println("");
     
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
