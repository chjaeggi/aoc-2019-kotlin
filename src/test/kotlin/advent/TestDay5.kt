package advent

import org.junit.Test
import kotlin.test.assertEquals

class TestDay5 {

    @Test
    fun `Check output equals input sample instruction`() {
        assertEquals(42, Day5(listOf(3, 0, 4, 0, 99), startingInstruction = 42).solvePart1())
    }

    @Test
    fun `Check multiply sample instruction`() {
        assertEquals(99, Day5(listOf(1002, 4, 3, 4, 33)).solvePart1())
    }

    @Test
    fun `Check equal than 8 or not sample instruction`() {
        assertEquals(1, Day5(listOf(3, 9, 8, 9, 10, 9, 4, 9, 99, -1, 8), startingInstruction = 8).solvePart2())
        assertEquals(0, Day5(listOf(3, 9, 8, 9, 10, 9, 4, 9, 99, -1, 8), startingInstruction = 21).solvePart2())
        assertEquals(1, Day5(listOf(3, 3, 1108, -1, 8, 3, 4, 3, 99), startingInstruction = 8).solvePart2())
        assertEquals(0, Day5(listOf(3, 3, 1108, -1, 8, 3, 4, 3, 99), startingInstruction = 21).solvePart2())
    }

    @Test
    fun `Check smaller than 8 sample instruction`() {
        assertEquals(1, Day5(listOf(3, 9, 7, 9, 10, 9, 4, 9, 99, -1, 8), startingInstruction = 7).solvePart2())
        assertEquals(0, Day5(listOf(3, 9, 7, 9, 10, 9, 4, 9, 99, -1, 8), startingInstruction = 8).solvePart2())
        assertEquals(1, Day5(listOf(3, 3, 1107, -1, 8, 3, 4, 3, 99), startingInstruction = 7).solvePart2())
        assertEquals(0, Day5(listOf(3, 3, 1107, -1, 8, 3, 4, 3, 99), startingInstruction = 8).solvePart2())
    }

    @Test
    fun `Check non-zero sample instruction`() {
        assertEquals(0, Day5(listOf(
                3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, -1, 0, 1, 9), startingInstruction = 0).solvePart2())
        assertEquals(1, Day5(listOf(
                3, 3, 1105, -1, 9, 1101, 0, 0, 12, 4, 12, 99, 1), startingInstruction = 1000).solvePart2())
    }

    @Test
    fun `Check 8, smaller or greater sample instruction`() {
        assertEquals(999, Day5(listOf(
                3, 21, 1008, 21, 8, 20, 1005, 20, 22, 107, 8, 21, 20, 1006, 20, 31,
                1106, 0, 36, 98, 0, 0, 1002, 21, 125, 20, 4, 20, 1105, 1, 46, 104,
                999, 1105, 1, 46, 1101, 1000, 1, 20, 4, 20, 1105, 1, 46, 98, 99), startingInstruction = 7)
                .solvePart2())
        assertEquals(1000, Day5(listOf(
                3, 21, 1008, 21, 8, 20, 1005, 20, 22, 107, 8, 21, 20, 1006, 20, 31,
                1106, 0, 36, 98, 0, 0, 1002, 21, 125, 20, 4, 20, 1105, 1, 46, 104,
                999, 1105, 1, 46, 1101, 1000, 1, 20, 4, 20, 1105, 1, 46, 98, 99), startingInstruction = 8)
                .solvePart2())
        assertEquals(1001, Day5(listOf(
                3, 21, 1008, 21, 8, 20, 1005, 20, 22, 107, 8, 21, 20, 1006, 20, 31,
                1106, 0, 36, 98, 0, 0, 1002, 21, 125, 20, 4, 20, 1105, 1, 46, 104,
                999, 1105, 1, 46, 1101, 1000, 1, 20, 4, 20, 1105, 1, 46, 98, 99), startingInstruction = 9)
                .solvePart2())
    }


}

