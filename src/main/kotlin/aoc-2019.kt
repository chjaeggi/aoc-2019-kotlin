import advent.Day
import advent.Day7
import java.io.File

fun main(args: Array<String>) {
    println(Day7(File(Day::class.java.classLoader.getResource("input07.txt")!!.toURI()).readText().split(
            ',').map { it.toInt() }).solvePart2())
}
