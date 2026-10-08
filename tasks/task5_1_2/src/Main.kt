// Task 5.1.2: main program
// fun main() {

//     rollDie(4)
//     rollDie(6)
//     rollDie(20)
//     rollDie(7)
// }

fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Usage: provide the number of die sides")
        return
    }

    val sides = args[0].toInt()

    rollDie(sides)
}