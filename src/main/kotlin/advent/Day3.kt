package advent

import java.io.File
import kotlin.math.abs

class Day3(input: List<List<String>>? = null) : Day {

    private lateinit var newZero: Pair<Int, Int>
    private var intersections: Set<Pair<Int, Int>>
    private val wireCoords = listOf(mutableListOf<Pair<Int, Int>>(), mutableListOf<Pair<Int, Int>>())

    private val wires =
            input ?: File(this::class.java.classLoader.getResource("input03.txt")!!.toURI())
                    .useLines { sequence ->
                        sequence.toList().map { str ->
                            str.split(",")
                        }
                    }

    init {
        wires.mapIndexed { index, wire ->
            newZero = 0 to 0
            wire.map {
                wireCoords[index] += moveInstruction(it.first(), it.drop(1).toInt())
            }
        }
        intersections = wireCoords[0].intersect(wireCoords[1])
    }

    override fun solvePart1() =
            intersections.map { abs(it.first) + abs(it.second) }.min() ?: Int.MAX_VALUE

    private fun moveInstruction(direction: Char, distance: Int) = (0 until distance).map {
        newZero = when (direction) {
            'R' -> newZero.first + 1 to newZero.second
            'L' -> newZero.first - 1 to newZero.second
            'D' -> newZero.first to newZero.second - 1
            'U' -> newZero.first to newZero.second + 1
            else -> throw IllegalArgumentException("Invalid direction: $direction")
        }
        newZero
    }

    override fun solvePart2() = intersections.map {
        wireCoords[0].indexOf(it) + 1 + wireCoords[1].indexOf(it) + 1
    }.min() ?: Int.MAX_VALUE
}

