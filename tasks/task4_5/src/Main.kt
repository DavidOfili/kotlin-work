// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) { 
    if (args.isEmpty()) {
        println("Error: requires a valid number")
        exitProcess(1)
    }

    val limit = args[0].toIntOrNull()

    if (limit == null) {
        println("Enter a valid number")
        exitProcess(1)
    }

    if (limit !in 3..50) {
        println("Enter a valid number greater than 2 but not more than 50")
        exitProcess(1)
    }
    
    else {
        var sum = 0

        for (oddNumbers in 1..limit step 2) {
            sum += oddNumbers
        }

        println("Sum = $sum")
    }
}
