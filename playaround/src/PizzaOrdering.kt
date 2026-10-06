// Task 4.2: use of if and ranges

fun main() {
    val a = "BBQ Pizza"
    val b = "Chicken and Bacon Pizza"
    val c = "Meat Feast Pizza"
    val d = "Pepperoni Pizza"

    println("Use letters A-D to pick a pizza from the menu.")
    println("Use letter E to view the menu")

    var orderPlaced = false

    while (!orderPlaced) {
        println("Enter your choice: ")
        val choice = readln().lowercase()

        if (choice.length != 1) {
            println("Invalid choice. Please select a letter from A-E.")
        }
        else if (choice[0] !in 'a'..'e') {
            println("Invalid choice. Please select a letter from A-E.")
        }
        else if (choice == "e") {
            println("Menu: \nA: $a\nB: $b\nC: $c\nD: $d")
        }
        else if (choice == "a") {
            println("A: $a selected. Order accepted!")
            orderPlaced = true
        }
        else if (choice == "b") {
            println("B: $b selected. Order accepted!")
            orderPlaced = true
        }
        else if (choice == "c") {
            println("C: $c selected. Order accepted!")
            orderPlaced = true
        }
        else {
            println("D: $d selected. Order accepted!")
            orderPlaced = true
        }
    }

}
