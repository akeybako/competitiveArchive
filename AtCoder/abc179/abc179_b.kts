fun main(args: Array<String>) {
    val N = nextInt()
    val solo_cnt = 0
    val D = (0 until N).map {
        val (D_1, D_2) = nextIntList()
        D_1 == D_2
    }

    val ans = (2 until N).any {
        (it downTo it-2).all{ D[it] }
    }
    println(if (ans) "Yes" else "No")
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
