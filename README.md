## Advent of Code 2019 Solutions in Kotlin
My solutions for [Advent of Code challenges 2019](https://adventofcode.com/) in Kotlin (JVM).

[![Kotlin Version](https://img.shields.io/badge/kotlin-1.3.61-blue.svg)](http://kotlinlang.org/)
[![CircleCI](https://circleci.com/gh/chjaeggi/aoc-2019-kotlin.svg?style=svg)](https://circleci.com/gh/chjaeggi/aoc-2019-kotlin)
[![License](https://img.shields.io/badge/License-Apache%202.0-red.svg)](https://opensource.org/licenses/Apache-2.0)

Copyright © 2020 by Christian Jaeggi.

After solving about half of the challenges in [python (repo)](https://github.com/chjaeggi/aoc-2019-python), this one is my attempt at solving the challenges in Kotlin.
Because this beautiful language comes off rather badly at the moment in my current job this is the perfect opportunity to get back at it by implementing various algorithms, hopefully even more elegantly than in python.
I try to solve the riddles in a functional programming way (especially by relying on Kotlin's Collections) but you may still see a lot of procedureal code patterns as my brain is hard-wired this way ;-)

Before I start I want to give a big shout out to [Todd Ginsberg](https://github.com/tginsberg/advent-2019-kotlin) whose solutions are very concise as well as idiomatic to read.
It was when I saw his repository that I decided to go full Kotlin-mode (you may see some resemblance in our solutions).

#### Daily Solution Index for 2019
|   Day   | Title                                         |  Links                                       |
| --------|-----------------------------------------------|--------------------------------------------- |
|    1    | The Tyranny of the Rocket Equation            | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day1.kt) [\[AoC\]](http://adventofcode.com/2019/day/1) |
|    2    | 1202 Program Alarm                            | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day2.kt) [\[AoC\]](http://adventofcode.com/2019/day/2) |
|    3    | Crossed Wires                                 | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day3.kt) [\[AoC\]](http://adventofcode.com/2019/day/3) |
|    4    | Sunny with a Chance of Asteroids              | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day4.kt) [\[AoC\]](http://adventofcode.com/2019/day/5) |
|    5    | Universal Orbit Map                           | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day5.kt) [\[AoC\]](http://adventofcode.com/2019/day/6) |
|    6    | Secure Container                              | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day6.kt) [\[AoC\]](http://adventofcode.com/2019/day/4) |
|    7    | Amplification Circuit                         | [\[Code\]](https://github.com/chjaeggi/aoc-2019-kotlin/blob/master/src/main/kotlin/advent/Day7.kt) [\[AoC\]](http://adventofcode.com/2019/day/7) |
|    8    | Space Image Format                            | [\[AoC\]](http://adventofcode.com/2019/day/8) |
|    9    | Sensor Boost                                  | [\[AoC\]](http://adventofcode.com/2019/day/9) |
|    10   | Monitoring Station                            | [\[AoC\]](http://adventofcode.com/2019/day/10) |
|    11   | Space Police                                  | [\[AoC\]](http://adventofcode.com/2019/day/11) |
|    12   | The N-Body Problem                            | [\[AoC\]](http://adventofcode.com/2019/day/12) |
|    13   | Care Package                                  | [\[AoC\]](http://adventofcode.com/2019/day/13) |
|    14   | Space Stoichiometry                           | [\[AoC\]](http://adventofcode.com/2019/day/14) |
|    15   | Oxygen System                                 | [\[AoC\]](http://adventofcode.com/2019/day/15) |
|    16   | Flawed Frequency Transmission                 | [\[AoC\]](http://adventofcode.com/2019/day/16) |
|    17   | Set and Forget                                | [\[AoC\]](http://adventofcode.com/2019/day/17) |
|    18   | Many-Worlds Interpretation                    | [\[AoC\]](http://adventofcode.com/2019/day/18) |
|    19   | Tractor Beam                                  | [\[AoC\]](http://adventofcode.com/2019/day/19) |
|    20   | Donut Maze                                    | [\[AoC\]](http://adventofcode.com/2019/day/20) |
|    21   | Springdroid Adventure                         | [\[AoC\]](http://adventofcode.com/2019/day/21) |
|    22   | Slam Shuffle                                  | [\[AoC\]](http://adventofcode.com/2019/day/22) |
|    23   | Category Six                                  | [\[AoC\]](http://adventofcode.com/2019/day/23) |
|    24   | Planet of Discord                             | [\[AoC\]](http://adventofcode.com/2019/day/24) |
|    25   | Cryostasis                                    | [\[AoC\]](http://adventofcode.com/2019/day/25) |
