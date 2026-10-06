// Task 4.2: use of if and ranges

fun main() {
    val a = "BBQ Pizza"
    val b = "Chicken and Bacon Pizza"
    val c = "Meat Feast Pizza"
    val d = "Pepperoni Pizza"

    println("Use letters A-D to pick a pizza from the menu.")
    println("\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\n")

    val choice = readln().lowercase()

    if (choice.length != 1) {
        println("\nInvalid choice.")
    }
    else if (choice[0] !in 'a'..'e') {
        println("\nInvalid choice.")
    }
    else {
        println("\nOrder accepted!")
    }
}