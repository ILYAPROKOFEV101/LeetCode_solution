package YandexContest


data class MyData(val name: String, val surname: String)
class MySecondData(val name: String, val surname: String)
data class MyThirdData(var name: String, var surname: String)

val myDataHashSet  = HashSet<MyData>().apply {
    add (MyData ("John", "Doe"))
    add (MyData("John", "Doe"))
}

val mySecondDataHashSet = HashSet<MySecondData>().apply {
    add (MySecondData ("John", "Doe"))
    add (MySecondData("John", "Doe"))
    }

    val myThirdDataHashSet = HashSet<MyThirdData>().apply {
    add (MyThirdData("John", "Doe"))
    add (MyThirdData("John", "Doe"))
}

fun main (){


    println("${myDataHashSet.size} ${mySecondDataHashSet.size} ${myThirdDataHashSet.size}")
}
