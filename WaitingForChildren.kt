import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//fun main(args: Array<String>) {
//    runBlocking {
//        launch {
//            delay(1000L)
//            println("World")
//        }
//
//        launch {
//            delay(2000L)
//            print("World!")
//        }
//
//        println("Hello, ")
//    }
//}


fun main(args: Array<String>) {
    runBlocking {
        val job1 = launch {
            delay(1000L)
            println("Test1")
        }

        val job2 = launch {
            delay(2000L)
            println("Test2")
        }

        job1.join()
        job2.join()
        println("All tests are done")
    }
}
