// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendBytes
import kotlin.io.path.appendText
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText
import kotlin.io.path.writeLines

// fun main() {
//     val path = Path("test.txt")
//     val text = path.readText()
//     println("File Context: $text")
// }

fun main() {
	val path = Path("example.bin")

	path.writeBytes(byteArrayOf(1, 2))
	path.appendBytes(byteArrayOf(3))

	val bytes = path.readBytes()
	println(bytes.contentToString())
}
