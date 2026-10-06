// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: requires 3 arguments")
        exitProcess(1)
    }
    
    val startTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val increment = args[2].toDouble()
    
    var currentTemp = startTemp
    
    // BASIC VERSION
    // while (currentTemp <= maxTemp) {
    //     val fahrenheit = currentTemp * 9 / 5 + 32

    //     println("%8.1f %8.1f".format(currentTemp, fahrenheit))
        
    //     currentTemp += increment
    // }

    // MORDANT VERSION
    val terminal = Terminal()

    var currentTemp = startTemp

    terminal.println(
        table {
            header {
                row("Celsius", "Fahrenheit")
            }

            body {

                while (currentTemp <= maxTemp) {

                    val fahrenheit =
                        currentTemp * 9 / 5 + 32

                    row(
                        "%.1f".format(currentTemp),
                        "%.1f".format(fahrenheit)
                    )

                    currentTemp += increment
                }
            }
        }
    )
    
}

