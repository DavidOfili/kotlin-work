// Task 3.2: numeric conversion example

import kotlin.system.exitProcess

// fun main(args: Array<String>) {
//     if (args.size != 1) {
//         println("Error: integer required on command line")
//         exitProcess(1)
//     }

//     val number = args[0].toInt()
//     println(number * number)
// }

//Concatenates the input args rather than sum them
// fun main(args: Array<String>) {
//     val sum = args[0] + args[1]
//     println(sum)
// } 

// With toInt() appnded, the input args are summed
// fun main(args: Array<String>) {
//     val sum = args[0].toInt() + args[1].toInt()
//     println(sum) 
// }

// fun main() {
//     print("Enter your name: ")
//     val name = readln()
//     print("Enter your age: ")
//     val age = readln().toInt()
//     print("Enter account balance:")
//     val accountBalance = readln().toFloat()

//     println("Hello $name, you are $age years old.")
//     println("Your name contains ${name.length} characters")
//     println("Is it a short name? ${name.length < 5}")
//     println("Uppercase name is ${name.uppercase()}")
//     println("Your account balance = %.2f".format(accountBalance))
// }

// fun main() {
//     val size = 100
//     println("Size = $size")
//     // System.out.printf("Size = %d", size)
// }

fun main() {
    val word = "hello"
    //println("{word.uppercase()}")
    println("${word.uppercase()}")
}