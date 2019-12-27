/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/4
 */
package advent

import java.io.File

class Day4(input: List<Int>? = null) : Day {

    private val bounds =
            input ?: File(this::class.java.classLoader.getResource("input04.txt")!!.toURI())
                    .readText().split('-').map { it.toInt() }


    override fun solvePart1() = (bounds.first() until bounds.last()).count { !it.isDecreasing() && it.hasDoubleDigit() }

    override fun solvePart2() =
            (bounds.first() until bounds.last()).count { !it.isDecreasing() && it.hasExclusiveDoubleDigit() }

    private fun Int.isDecreasing(): Boolean {
        val digitArray = this.toString().toList().map { it.toString().toInt() }
        for (i in 1..digitArray.lastIndex) if (digitArray[i - 1] > digitArray[i]) return true
        return false
    }

    private fun Int.hasDoubleDigit(): Boolean {
        val digitArray = this.toString().toList().map { it.toString().toInt() }
        for (i in 1..digitArray.lastIndex) if (digitArray[i - 1] == digitArray[i]) return true
        return false
    }

    private fun Int.hasExclusiveDoubleDigit() =
            this.toString().toList().map { it.toString().toInt() }.groupBy { it }.any { it.value.size == 2 }

}