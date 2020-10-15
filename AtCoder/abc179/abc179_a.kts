fun main(args: Array<String>) {
    val S = next().trimEnd()
    val ans = S + if(S.endsWith("s")) "es" else "s"
    println(ans)
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextIntList() = next().split(" ").map{ it.toInt() }
fun nextLongList() = next().split(" ").map{ it.toLong() }
fun nextDoubleList() = next().split(" ").map{ it.toDouble() }

