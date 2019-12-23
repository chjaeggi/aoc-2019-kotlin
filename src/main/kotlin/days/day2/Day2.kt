package days.day2

import days.Day
import java.io.File

class Day2(fileName: String = "src/inputs/input02.txt") : Day {

    private var input: List<Int> = File(fileName).readText().split(",").map { it.toInt() }

    override fun solvePart1() = 0
    override fun solvePart2() = 0


}