package advent

import java.util.logging.Logger

class IntCode(private var program: Array<Int>,
              memoryOne: Int? = null,
              memoryTwo: Int? = null) {

    private var pointer = 0
    private var halted = false
    private var result = -1

    init {
        program[1] = memoryOne ?: program[1]
        program[2] = memoryTwo ?: program[2]
        program += Array<Int>(program.size) { 0 } // double the size for extra memory
    }

    fun start(startingInstruction: Int? = null): Int {
        while (!halted) {
            val opCode = program[pointer].toString().padStart(5, '0')
            val (arg1, arg2, arg3) = getArgumentAddress(opCode)
            when {
                opCode.endsWith('1') -> {
                    result = program[arg1] + program[arg2]
                    program[arg3] = result
                    pointer += 4
                }
                opCode.endsWith('2') -> {
                    result = program[arg1] * program[arg2]
                    program[arg3] = result
                    pointer += 4
                }
                opCode.endsWith('3') -> {
                    program[arg1] = startingInstruction ?: 0
                    pointer += 2
                }
                opCode.endsWith('4') -> {
                    result = program[arg1]
                    pointer += 2
                }
                opCode.endsWith("99") -> {
                    halted = true
                }
                else -> {
                    Logger.getLogger(IntCode::class.java.name)
                            .warning("Unexpected IntCode received with ${program[pointer]}")
                }
            }
        }
        return result
    }

    private fun getArgumentAddress(opCode: String): Triple<Int, Int, Int> {
        val paramModes = listOf(opCode[2], opCode[1], opCode[0])
        val addresses = MutableList(3) { 0 }

        (paramModes.indices).map { index ->
            if (paramModes[index] == '0') addresses[index] = program[pointer + 1 + index]
            else addresses[index] = pointer + 1 + index
        }
        return Triple(addresses[0], addresses[1], addresses[2])
    }
}
