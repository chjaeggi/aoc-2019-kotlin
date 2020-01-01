/**
 * Quest can be found here:
 * http://adventofcode.com/2019/day/6
 */
package advent

class Day6(input: List<String>) : Day {

    private val planetMap: Map<String, String> = input.map { it.split(')') }.map { it.last() to it.first() }.toMap()

    override fun solvePart1() = planetMap.map { countToCom(it.key, it.value, 0) }.sum()
    override fun solvePart2(): Int {
        val youToCom = pathToCom("YOU", planetMap["YOU"] ?: error("Key Not Found"), mutableListOf())
        val sanToCom = pathToCom("SAN", planetMap["SAN"] ?: error("Key Not Found"), mutableListOf())
        val intersection = youToCom.intersect(sanToCom).first()

        return youToCom.indexOf(intersection) + sanToCom.indexOf(intersection)
    }

    private fun countToCom(planet: String, parent: String, localCount: Int): Int {
        return if (parent == "COM") localCount + 1
        else {
            val newChild = planetMap[planet] ?: error("Key Not Found")
            val newParent = planetMap[newChild] ?: error("Key Not Found")
            countToCom(newChild, newParent, localCount + 1)
        }
    }

    private fun pathToCom(planet: String, parent: String, path: MutableList<String>): List<String> {
        if (parent == "COM") path.add("COM")
        else {
            path.add(parent)
            val newChild = planetMap[planet]
            val newParent = planetMap[newChild]
            if (newChild != null && newParent != null) {
                pathToCom(newChild, newParent, path)
            }
        }
        return path
    }
}