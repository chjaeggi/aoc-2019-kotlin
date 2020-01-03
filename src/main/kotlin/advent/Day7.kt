/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/7
 */
package advent

import com.marcinmoskala.math.permutations

class Day7(input: List<Int>) : Day {

    private val intCodeProgram = input.toIntArray()

    override fun solvePart1(): Int {
        return listOf(0, 1, 2, 3, 4).permutations().map { phases ->
            runPhase(phases)
        }.max() ?: 0
    }

    override fun solvePart2() = 0

    private fun runPhase(phases: List<Int>): Int {
        return (phases.indices).fold(0) { past, id ->
            IntCode(intCodeProgram).start(mutableListOf(phases[id], past))
        }
    }

}

