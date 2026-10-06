// Practice file

fun main() {
    print("Enter a number: ")
    var number = readln().toInt()

    if (number in 18..27) {
        println("You're $number years old. You're eligible!")
    }   
    
    else if (number < 18) {
        var underage = (18 - number)
        if (underage == 1) {
            println("You're $number years old. Come back in $underage year.")
        }
        else {
            println("You're $number years old. Come back in $underage years.")
        }
    }

    else {
        println("You're $number years old. You're not eligible!")
    }

}