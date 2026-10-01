// Task 3.1: command line arguments

import kotlin.system.exitProcess

// fun main(args: Array<String>) {
//     println("First CLI argument is: ${args[0]}")
//     println("Second CLI argument is: ${args[1]}")
// }

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: requires two arguments")
        exitProcess(1)
    }

    println("First CLI argument is: ${args[0]}")
    println("Second CLI argument is: ${args[1]}")
}
