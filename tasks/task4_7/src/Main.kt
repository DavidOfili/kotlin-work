// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Error: supply a filename with the correct path")
        return
    }

    val filePath = Path(args[0])

    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0

    filePath.forEachLine {

        lineNumber++

        if (it.length > longestLength) {
            longestLength = it.length
            longestLineNumber = lineNumber
        }
    }

    println("Line ${longestLineNumber} is the longest (length = ${longestLength})")
}