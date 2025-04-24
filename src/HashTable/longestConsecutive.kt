package HashTable

fun longestConsecutive(nums: IntArray): Int {
    var numSet = HashSet<Int>()
    for( num in nums){
        numSet.add(num)
    }


    var maxLength = 0

    for( num in numSet){
        if (!numSet.contains(num - 1)) {

            var currentNum = num
            var currantStrike = 1



            while(numSet.contains(currentNum + 1)){
                currentNum += 1
                currantStrike += 1
            }

            if(currantStrike >= maxLength){
                maxLength = currantStrike
            }
        }

    }

    return maxLength

}