package BinarySearch

import javax.sound.midi.MidiEvent

fun binarySearch(arr: IntArray, target : Int ) : Int{
    var left = 0
    var right = arr.size - 1

    while( left <= right) {
        var mid = (left + right) / 2
        when{
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }

    }
    return -1

}

fun main() {
    val target = 7
    val numbers = intArrayOf(1, 3, 5, 7, 9, 11, 15).binarySearch(target)

    println("Элемент $target найден по индексу: $numbers")
}