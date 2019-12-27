package advent

import java.io.File

class Day2(input: List<Int>? = null, private val startingParameters: Pair<Int, Int>? = null) :
        Day {

    private val input = input ?: File(this::class.java.classLoader.getResource("input02.txt")!!.toURI())
            .readText().split(',').map { it.toInt() }

    override fun solvePart1() =
            IntCode(input.toTypedArray(), startingParameters?.first,
                    startingParameters?.second).start()

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