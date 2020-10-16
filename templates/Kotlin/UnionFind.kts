class UnionFind(n: Int) {
    val par = Array(n) { -1 }
    val siz = Array(n) { 1 }

    fun root(x: Int): Int {
        if (par[x] == -1) return x
        par[x] = root(par[x])
        return par[x]
    }

    fun isSame(x: Int, y: Int): Boolean {
        return root(x) == root(y)
    }

    fun unite(x: Int, y: Int): Boolean {
        val rootX = root(x)
        val rootY = root(y)

        if (rootX == rootY) return false

        if (siz[rootX] < siz[rootY]) siz.swap(rootX, rootY)

        par[rootY] = rootX
        siz[rootX] += siz[rootY]
        return true
    }

    fun size(x: Int): Int {
        return siz[root(x)]
    }
}

// Test
fun main(args: Array<String>) {
    val uf = UnionFind(7)

    uf.unite(1, 2)
    uf.unite(2, 3)
    uf.unite(5, 6)
    println(uf.isSame(1, 3))
    println(uf.isSame(2, 5))

    uf.unite(1, 6)
    println(uf.isSame(2, 5))
}

// common
fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index1] = tmp
}