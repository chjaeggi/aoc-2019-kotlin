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
        }.max() ?: -1
    }

    override fun solvePart2(): Int {
        return listOf(5, 6, 7, 8, 9).permutations().map { phases ->
            runAmplified(phases)
        }.max() ?: -1
    }

    private fun runPhase(phases: List<Int>): Int {
        return (phases.indices).fold(0) { past, id ->
            IntCode(intCodeProgram).start(mutableListOf(phases[id], past))
        }
    }

    private fun runAmplified(phases: List<Int>): Int {
        val intCodeMachines = listOf(
                IntCode(intCodeProgram, immediateReturnOnOutput = true),
                IntCode(intCodeProgram, immediateReturnOnOutput = true),
                IntCode(intCodeProgram, immediateReturnOnOutput = true),
                IntCode(intCodeProgram, immediateReturnOnOutput = true),
                IntCode(intCodeProgram, immediateReturnOnOutput = true)
        )

        var active = 0
        var output = 0
        var result = 0
        val phaseSet = mutableMapOf(0 to false, 1 to false, 2 to false, 3 to false, 4 to false)

        while (!(intCodeMachines.last()).halted) {
            val args = mutableListOf<Int>()
            if (phaseSet[active] != true) {
                args.add(phases[active])
                phaseSet[active] = true
            }
            args.add(output)
            output = intCodeMachines[active].start(args)
            if (output > 0) result = output
            active += 1
            active %= 5
        }
        return result
    }

}

