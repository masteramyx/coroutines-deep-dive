import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun main(): Unit = coroutineScope {

    // OK
//    val channel = Channel<Int>()
//    launch {
//        repeat(5) { index ->
//            delay(1000)
//            println("Producing next: $index")
//            channel.send(index * 2)
//        }
//    }
//
//    launch {
//        repeat(5) {
//            val received = channel.receive()
//            println("Received: $received")
//        }
//    }


    // BETTER
//    val channel = Channel<Int>()
//    launch {
//        repeat(5) { index ->
//            delay(1000)
//            println("Producing next: $index")
//            channel.send(index * 2)
//        }
//        channel.close()
//    }
//
//    launch {
//        channel.consumeEach {received ->
//            println("Received: $received")
//        }
//    }

    // EVEN BETTER - `produce` handles closing the channel under all conditions
    val channel = produce {
        repeat(5) { index ->
            println("Producing next: $index")
            delay(1000)
            channel.send(index * 2)
        }
    }

    for (item in channel) {
        println("Received: $item")
    }
}