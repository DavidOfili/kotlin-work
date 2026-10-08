import kotlin.io.path.*

fun main () {
    val exhortation = Path("data/testfile.txt")

    // exhortation.useLines {
    //   for (line in it) {
    //     println(line)
    //   }
    // }   

    exhortation.forEachLine {
        println(it)
    } 
}