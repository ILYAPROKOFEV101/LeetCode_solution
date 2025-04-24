import kotlinx.coroutines.*

fun isSupported(featureState: Boolean): String {
    return if (featureState)
        return "Has support"
    else
        return "No support"
}

fun main() {
    println(isSupported(featureState = true))
}