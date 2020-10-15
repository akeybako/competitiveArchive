fun main(args: Array<String>) {
    val x = nextInt()

    println(if (x == 0) 1 else 0)
}

const val BLANK_DELIMITER = " "
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(BLANK_DELIMITER)
fun nextIntList() = next().split(BLANK_DELIMITER).map{ it.toInt() }
fun nextLongList() = next().split(BLANK_DELIMITER).map{ it.toLong() }
fun nextDoubleList() = next().split(BLANK_DELIMITER).map{ it.toDouble() }
