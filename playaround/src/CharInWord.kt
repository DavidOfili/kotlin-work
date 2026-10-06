fun main () {
    print("Enter a character: ")
    var char = readln()

    if (char in "zebra") {
        println("$char is a letter of the word. Keep guess until you spell the word!")
    }
    else {
        println("$char is not in the word. Keep guessing!")
    }
}