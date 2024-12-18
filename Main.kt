fun main() {
    print("> ")
    val calc = readln().toDouble()

    print("> ")
    val op = readln()[0]

    print("> ")
    val calc1 = readln().toDouble()


    val r = when (op){
        '+' -> calc + calc1
        '-' -> calc - calc1
        '*' -> calc * calc1
        '/' -> calc / calc1
        else -> 0
    }

    println("Resultado: $r")
}