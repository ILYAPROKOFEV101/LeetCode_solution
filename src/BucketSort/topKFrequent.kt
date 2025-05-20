package BucketSort

fun topKFrequent(words: Array<String>, k: Int): List<String> {

        val count = mutableMapOf<String, Int>()
        val result = mutableListOf<String>()



        for( i in words){
               count[i]  = count.getOrDefault(i, 0) + 1
        }

    var sorted = count.keys.sortedWith((
            compareByDescending<String> { count[it] }
        .thenBy { it }))


        return sorted.take(k)
        
    }