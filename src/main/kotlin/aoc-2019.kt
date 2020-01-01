import advent.Day
import advent.Day6
import java.io.File

fun main(args: Array<String>) {
    println(Day6(File(Day::class.java.classLoader.getResource("input06.txt")!!.toURI()).readLines()).solvePart2())
}
