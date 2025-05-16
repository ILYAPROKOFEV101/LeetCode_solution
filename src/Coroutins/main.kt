package Coroutins

import kotlinx.coroutines.*

fun main() = runBlocking {
        val  supervisor = SupervisorJob()
    val scope = CoroutineScope(coroutineContext + supervisor)

    val job : Job
    job = scope.launch {
        delay(1000L)
        println("Привет из launch!")
    }
    job.join()


    println("Привет из main!")
}
