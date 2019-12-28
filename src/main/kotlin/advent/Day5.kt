/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/5
 */
package advent

import java.io.File

class Day5(input: List<Int>? = null,
           private val startingMemory: Pair<Int, Int>? = null,
           private val startingInstruction: Int? = null) : Day {

    private val input = input ?: File(this::class.java.classLoader.getResource("input05.txt")!!.toURI())
            .readText().split(',').map { it.toInt() }

    override fun solvePart1() =
            IntCode(input.toTypedArray(), startingMemory?.first, startingMemory?.second)
                    .start(startingInstruction ?: 0)

    override fun solvePart2() =
            IntCode(input.toTypedArray(), startingMemory?.first, startingMemory?.second)
                    .start(startingInstruction ?: 0)
}
