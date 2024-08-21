fun main() {
    var estado = true
    while (estado){
        println("Selecciona alguna de las siguientes opciones: ")

        println("""
        |1. Suma
        |2. Resta
        |3. Raíz
        |4. Cuadrado
        |5. Saludo
        |6. División
        |7. Multiplicación
        |8. Salir
    """.trimMargin())

        println("Digite una opción: ")
        var opcion = readLine()?.toInt()

        if (opcion == 1){
            suma()
            //opcion =
        } else if (opcion == 2){
            resta()
        } else if (opcion == 3){
            println("la raíz es: ${raiz()}")
        } else if (opcion == 4){
            println("El cuadrado es: ${cuadrado()}")
        } else if (opcion == 5){
            println(saludo())
        } else if (opcion == 6){
            division(12.0,6.0)
        } else if (opcion == 7){
            multiplicacion(12.0, 6.0)
        } else if (opcion == 8){
            estado == false
            println("Saliendo del programa...")
            break
        } else if (opcion != 8){
            println("Opción no valida, intenta de nuevo.")
        }
        estado == false
    }
}

val n1= 12
val n2= 6

//Sin parametros y sin retorno
fun suma () {
    var sum = n1+n2
    println("La suma es: $sum")
}
fun resta () {
    var rest = n1-n2
    println("La resta es: $rest")
}

//Sin parametros y con retorno
fun raiz():Double{
    return Math.sqrt(n1.toDouble())
}
fun cuadrado ():Double {
    return Math.pow(n1.toDouble(),2.0)
}
fun saludo ():String{
    return "!Hola! ¿Como estás?"
}

//Con parametros y sin retorno
fun division (n1:Double, n2:Double){
    var div = n1/n2
    println("La division es: ${div}")
}

//Con parametros y con retorno
fun multiplicacion (n1:Double, n2:Double) {

    var mult = n1 * n2
    println("La multiplicacion es: ${mult}")
}

