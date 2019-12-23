package days.day1

import days.Day
import java.io.File

class Day1(input: List<Int>? = null) : Day {

    private val input = input ?: File("src/main/kotlin/inputs/input01.txt").readLines().map { it.toInt() }

    override fun solvePart1() = input.sumBy { it / 3 - 2 }
    override fun solvePart2() = input.sumBy { recursiveSum(it) }

    private fun recursiveSum(fuelAdd: Int): Int {
        var temporaryFuel = fuelAdd
        var sum = 0

        while (temporaryFuel >= 9) {
            temporaryFuel = temporaryFuel / 3 - 2
            sum += temporaryFuel
        }
        return sum
    }
}