package Prime

import java.util.*
// Meeting Rooms II
fun minMeetingRooms(intervals: Array<IntArray>): Int {
    if(intervals.isEmpty()) return 0

    val pd = PriorityQueue<Int>()

    pd.add(intervals[0][1])

    for(i in 1 until intervals.size){
        if(pd.peek() <= intervals[i][0]){
            pd.poll()
        }
        pd.add(intervals[i][1])
    }

    return pd.size

}