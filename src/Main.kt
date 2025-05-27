




    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if(intervals.isEmpty()) return arrayOf()
        intervals.sortBy { it[0] }

        var merged = mutableListOf<IntArray>()

        var current = intervals[0]


        for(i in 1 until intervals.size){
                val next = intervals[i]

            if(current[1] >= next[0])
            {
                current[1] = maxOf(current[1], next[1])
            } else {
                merged.add(current)
                current = next
            }
        }

        merged.add(current)


        return merged.toTypedArray()

    }

