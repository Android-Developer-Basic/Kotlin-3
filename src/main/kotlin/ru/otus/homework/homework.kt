package ru.otus.homework

import kotlin.random.Random
import kotlin.system.measureTimeMillis


fun positionalWithOptPositional(n1: Int, n2: Int, vararg n: Int): Int = n1 + n2 + n.sum()


fun optPositionalWithDefault(vararg str: String, sep: Char = ' '): String = str.joinToString(separator = sep.toString())


fun measureFunExecutionTime(block: () -> Unit): Long = measureTimeMillis(block)


fun toMeasure() = Array(10_000_000) { Random.nextInt(100_000) }.sortDescending()
