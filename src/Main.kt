fun main() {
    // Ejercicio 1: Días de la semana
    val numero = 2
    print("Ejercicio 1: ")
    when (numero) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        else -> println("Día inválido")
    }
    println()

    // Ejercicio 2: Calificación
    val calificacion = 7
    print("Ejercicio 2: ")
    when (calificacion) {
        10 -> println("Excelente")
        9 -> println("Muy bien")
        8 -> println("Bien")
        else -> println("Reprobado")
    }
    println()

    // Ejercicio 3: Semáforo
    val semaforo = "azul"
    print("Ejercicio 3: ")
    when (semaforo) {
        "rojo" -> println("Alto")
        "amarillo" -> println("Precaución")
        "verde" -> println("Avanza")
        else -> println("Color inválido")
    }
    println()

    // Ejercicio 4: Tipo de usuario
    val usuario = "hola"
    print("Ejercicio 4: ")
    when (usuario) {
        "admin" -> println("Acceso total")
        "user" -> println("Acceso limitado")
        "invitado" -> println("Solo lectura")
        else -> println("Rol desconocido")
    }
    println()

    // Ejercicio 5: Contar del 1 al 5
    println("Ejercicio 5:")
    for (i in 1..5) {
        println(i)
    }
    println()

    // Ejercicio 6: Repetir mensaje
    println("Ejercicio 6:")
    for (i in 1..3) {
        println("Hola Kotlin")
    }
    println()

    // Ejercicio 7: Recorrer arreglo
    println("Ejercicio 7:")
    val nombres = arrayOf("Ana", "Luis", "Carlos")
    for (nombre in nombres) {
        println(nombre)
    }
    println()

    // Ejercicio 8: Usar until
    println("Ejercicio 8:")
    val numeros = arrayOf(10, 20, 30)
    for (i in 0 until numeros.size) {
        println("Índice $i")
    }
}