package advent

import org.junit.Test
import kotlin.test.assertEquals

class TestDay5 {

    @Test
    fun `Check output equals input sample instruction`() {
        assertEquals(42, Day5(listOf(3,0,4,0,99), startingInstruction = 42).solvePart1())
    }

    @Test
    fun `Check multiply sample instruction`() {
        assertEquals(99, Day5(listOf(1002, 4, 3, 4, 33)).solvePart1())
    }
}

