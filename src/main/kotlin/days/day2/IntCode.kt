package days.day2

import java.util.logging.Logger

class IntCode(private val code: Array<Int>,
              memoryOne: Int? = null,
              memoryTwo: Int? = null) {

    private var pointer = 0
    private var halted = false
    private var result = -1

    init {
        code[1] = memoryOne ?: code[1]
        code[2] = memoryTwo ?: code[2]
    }

    fun start(): Int {
        while (!halted) {
            when (code[pointer]) {
                1 -> {
                    result = code[code[pointer + 1]] + code[code[pointer + 2]]
                    code[code[pointer + 3]] = result
                    pointer += 4
                }
                2 -> {
                    result = code[code[pointer + 1]] * code[code[pointer + 2]]
                    code[code[pointer + 3]] = result
                    pointer += 4
                }
                99 -> {
                    halted = true
                }
                else -> {
                    Logger.getLogger(IntCode::class.java.name)
                            .warning("Unexpected IntCode received with ${code[pointer]}")
                }
            }
        }
        return result
    }
}
