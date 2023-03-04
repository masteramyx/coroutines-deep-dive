import kotlin.concurrent.thread
import kotlinx.coroutines.*

// OutOfMemory Error
//fun main() {
//    repeat(100_000){
//        thread {
//            Thread.sleep(1000L)
//            print(".")
//        } 
//    }
//}

fun main(args: Array<String>) {
    runBlocking {
        repeat(100_000) {
            launch {
                delay(1000L)
                print(".")
            }
        }   
    }
}
