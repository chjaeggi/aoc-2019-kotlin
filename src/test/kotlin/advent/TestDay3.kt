package advent

import org.junit.Test
import kotlin.test.assertEquals

class TestDay3 {

    private val wire1_1 = "R75,D30,R83,U83,L12,D49,R71,U7,L72".split(",")
    private val wire2_1 = "U62,R66,U55,R34,D71,R55,D58,R83".split(",")

    private val wire1_2 = "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51".split(",")
    private val wire2_2 = "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7".split(",")

    @Test
    fun `Check wire intersection distance with sample input`() {
        assertEquals(159, Day3(listOf(wire1_1, wire2_1)).solvePart1())
        assertEquals(135, Day3(listOf(wire1_2, wire2_2)).solvePart1())
    }

    @Test
    fun `Check wire intersection shortest wire length with sample input`() {
        assertEquals(610, Day3(listOf(wire1_1, wire2_1)).solvePart2())
        assertEquals(410, Day3(listOf(wire1_2, wire2_2)).solvePart2())
    }
}

