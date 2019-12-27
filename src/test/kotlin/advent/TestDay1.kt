package advent

import org.junit.Test
import kotlin.test.assertEquals

class TestDay1 {

    @Test
    fun `Assert correct fuel consumption with sample input`() {
        assertEquals(2, Day1(listOf(12)).solvePart1())
        assertEquals(2, Day1(listOf(14)).solvePart1())
        assertEquals(654, Day1(listOf(1969)).solvePart1())
        assertEquals(33583, Day1(listOf(100756)).solvePart1())
    }

    @Test
    fun `Assert correct recursive fuel consumption with sample input`() {
        assertEquals(2, Day1(listOf(12)).solvePart2())
        assertEquals(2, Day1(listOf(14)).solvePart2())
        assertEquals(966, Day1(listOf(1969)).solvePart2())
        assertEquals(50346, Day1(listOf(100756)).solvePart2())
    }
}
