package advent

import org.junit.Test
import kotlin.test.assertEquals

class TestDay6 {

    private val sampleOrbits =
            "COM)B\n" +
            "B)C\n" +
            "C)D\n" +
            "D)E\n" +
            "E)F\n" +
            "B)G\n" +
            "G)H\n" +
            "D)I\n" +
            "E)J\n" +
            "J)K\n" +
            "K)L"

    private val sampleOrbitsYouSan =
            "COM)B\n" +
            "B)C\n" +
            "C)D\n" +
            "D)E\n" +
            "E)F\n" +
            "B)G\n" +
            "G)H\n" +
            "D)I\n" +
            "E)J\n" +
            "J)K\n" +
            "K)L\n" +
            "K)YOU\n" +
            "I)SAN"

    @Test
    fun `Check output is 42 for sample input`() {
        assertEquals(42, Day6(sampleOrbits.lines()).solvePart1())
    }

    @Test
    fun `Check output is 4 for sample input between you and santa`() {
        assertEquals(4, Day6(sampleOrbitsYouSan.lines()).solvePart2())
    }
}

