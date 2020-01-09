import advent.Day
import advent.Day8
import java.io.File

fun main(args: Array<String>) {
    println(Day8(File(Day::class.java.classLoader.getResource(
            "input08.txt")!!.toURI()).readText().map { it - '0' }).solvePart2())
}
