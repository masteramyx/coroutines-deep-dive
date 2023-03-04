import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher

fun main() {
    CoroutineScope(StandardTestDispatcher()).launch {
        println("A")
        delay(1000)
        println("B")
    }

    CoroutineScope(UnconfinedTestDispatcher()).launch {
        println("C")
        delay(1000)
        println("D")
    }
}