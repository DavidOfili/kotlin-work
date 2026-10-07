fun main () {
    print("Enter a number from 1-7: ")
    val day = readln().toInt()
    
    // OPTION 1
    // Performs actions

    // when (day) {
    //     1, 3, 5 -> println("Take a walk")
    //     2, 4    -> println("Go to the gym")
    //     6, 7    -> println("Rest")
    //     else    -> println("Enter a number from 1 to 7")
    // }


    //OPTION 2
    // Returns a value
    
    val activity = when (day) {
        1, 3, 5 -> "Take a walk"
        2, 4    -> "Go to the gym"
        6, 7    -> "Rest"
        else    -> "Enter a number from 1 to 7"
    }
    
    println(activity)
}