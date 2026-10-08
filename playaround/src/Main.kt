fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Enter two words in 'Program arguments' field")
        return
    }

	println(anagrams(args[0], args[1]))
}