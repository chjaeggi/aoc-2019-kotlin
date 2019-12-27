/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/2
 */
package advent

import java.io.File

class Day2(input: List<Int>? = null, private val startingParameters: Pair<Int, Int>? = null) :
        Day {

    private val input = input ?: File(this::class.java.classLoader.getResource("input02.txt")!!.toURI())
            .readText().split(',').map { it.toInt() }

    override fun solvePart1() =
            IntCode(input.toTypedArray(), startingParameters?.first, startingParameters?.second).start()

    override fun solvePart2(): Int {
        (0 until 100).forEach { noun ->
            (0 until 100).forEach { verb ->
                if (IntCode(input.toTypedArray(), noun, verb).start() == 19690720) {
                    return 100 * noun + verb
                }
            }
        }
        return -1
    }
}