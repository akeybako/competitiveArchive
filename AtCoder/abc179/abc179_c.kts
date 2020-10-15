import kotlin.math.sqrt

fun main(args: Array<String>) {
    val N = nextInt()

    var ans = 0
    (1..N).forEach { A ->
        ans += N / A
        if(N % A == 0) ans-- // except when C = 0
    }
    println(ans)
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
