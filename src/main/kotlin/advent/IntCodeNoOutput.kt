package advent

import java.util.logging.Logger

class IntCodeNoOutput(private var program: IntArray,
                      memoryOne: Int? = null,
                      memoryTwo: Int? = null) {

    private var pointer = 0
    private var halted = false
    private var result = -1

    init {
        program[1] = memoryOne ?: program[1]
        program[2] = memoryTwo ?: program[2]
    }

    fun start(): Int {
        while (!halted) {
            when (program[pointer]) {
                1 -> {
                    result = program[program[pointer + 1]] + program[program[pointer + 2]]
                    program[program[pointer + 3]] = result
                    pointer += 4
                }
                2 -> {
                    result = program[program[pointer + 1]] * program[program[pointer + 2]]
                    program[program[pointer + 3]] = result
                    pointer += 4
                }
                99 -> {
                    halted = true
                }
                else -> {
                    Logger.getLogger(IntCodeNoOutput::class.java.name)
                            .warning("Unexpected IntCode received with ${program[pointer]}")
                }
            }
        }
        return result
    }
}
