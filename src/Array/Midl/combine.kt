package Array.Midl

fun combine(n: Int, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun backtrack(start: Int, current: MutableList<Int>) {
        if (current.size == k) {
            result.add(ArrayList(current))
            return
        }
        for (i in start..n) {
            current.add(i)
            backtrack(i + 1, current)
            current.removeAt(current.size - 1)
        }
    }

    backtrack(1, mutableListOf())
    return result
}


fun main()
{
    val n = 2
    val k = 4
    println(combine(n, k))
}
