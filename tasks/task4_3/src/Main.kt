// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: requires three scores")
        exitProcess(1)
    }

    val assignment1Score = args[0].toInt()
    val assignment2Score = args[1].toInt()
    val assignment3Score = args[2].toInt()

    if (assignment1Score !in 0..100 || assignment2Score !in 0..100 || assignment3Score !in 0..100) {
        println("Error: scores must be between 0 and 100")
        exitProcess(1)
    }
    else {
        val averageScore = (assignment1Score + assignment2Score + assignment3Score) / 3.0

        val grade = when (averageScore.roundToInt()) {
            in 70..100 -> "Distinction"
            in 40..69  -> "Pass"
            else       -> "Fail"
        }

        println("Your grade is: $grade")
    }
}

