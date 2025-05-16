package String

class Trie() {

    var trie = mutableListOf<String>()
    var preparation = mutableListOf<String>()

    fun insert(word: String) {
        preparation.add(word)
        val value = preparation.filter { it == word }.count() > 1
        if (!value) trie.add(word)
    }

    fun search(word: String): Boolean {
        if(trie.contains(word)) return true
        else return false
    }

    fun startsWith(prefix: String): Boolean {
        if(trie.contains(prefix)) return true
        else return false
    }

}