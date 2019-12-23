package days.day2

import days.Day
import java.io.File

class Day2(input: List<Int>? = null, private val startingParameters: Pair<Int, Int>? = null) :
        Day {

    private val input = input ?: File("src/main/kotlin/inputs/input02.txt")
            .readText().split(',').map { it.toInt() }

    override fun solvePart1() =
            IntCode(input.toTypedArray(), startingParameters?.first, startingParameters?.second).start()

    override fun solvePart2(): Int {
        for (i in 0..100) {
            for (j in 0..100) {
                if (IntCode(input.toTypedArray(), i, j).start() == 19690720) {
                    return 100 * i + j
                }
            }
        }
        return -1
    }
}