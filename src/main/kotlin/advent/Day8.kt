/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/8
 */
package advent

class Day8(private val input: List<Int>) : Day {

    private val width = 25
    private val height = 6
    private val frameSize = width * height
    private val nOfFrames = input.size / frameSize
    private val frames = input.chunked(frameSize)
    private var result : MutableList<Int> = mutableListOf()

    override fun solvePart1(): Int {
        val minFrame = frames.minBy { frame ->
            frame.count { digit ->
                digit == 0
            }
        }
        return (minFrame?.count { it == 1 } ?: 0) * (minFrame?.count { it == 2 } ?: 0)
    }

    override fun solvePart2(): Int {
//        (0 until nOfFrames).forEachIndexed { index, _ ->
//
//        }
        return 0
    }
}