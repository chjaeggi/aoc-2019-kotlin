package advent

import days.day2.Day2
import org.junit.Test
import kotlin.test.assertEquals

class TestDay2 {

    @Test
    fun testPart1() {
        assertEquals(2, Day2(listOf(1, 0, 0, 0, 99)).solvePart1())
        assertEquals(6, Day2(listOf(2, 3, 0, 3, 99)).solvePart1())
        assertEquals(9801, Day2(listOf(2, 4, 4, 5, 99, 0)).solvePart1())
        assertEquals(30, Day2(listOf(1, 1, 1, 4, 99, 5, 6, 0, 99)).solvePart1())
    }
}
