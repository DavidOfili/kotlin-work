// Task 2.3

fun main() {
    val myAge = 29u
    val universAge = 13_800_000_000L
    val status = 'M'
    val name = "Sarah"
    val height = 1.78f
    val root2 = Math.sqrt(2.0)
    // val pi: Float = 3.14159 || Exercise 2.3

    println(myAge::class)
    println(universAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)
}


// Exercise 2.3

// 3.14159 is a Double literal by default, so assigning it to a Float causes a compiler error, not a warning.

// Remove : Float: Kotlin infers Double.
// Append f: val pi: Float = 3.14159f
// Change Float to Double: the default literal type matches.
// A semicolon is optional in Kotlin and would not fix the type mismatch, so Diane’s suggestion doesn’t help.

