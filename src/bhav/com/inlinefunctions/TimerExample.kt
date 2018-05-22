package bhav.com.inlinefunctions



fun main(args: Array<String>) {

    //Classic code case - having many of these can be messy
    val timer = TimerMock("Some timer")
    timer.start()
    someCall()
    timer.stop()

    //can use inline functions

    val inlineTimer = TimerMockInline("Inline Timer") {Thread.sleep(2000)}
    inlineTimer.doAction()



}



class TimerMock(val name: String) {

    var currentTimeStart = System.currentTimeMillis()

    fun start() {
        println("Starting Timer")
        currentTimeStart = System.currentTimeMillis()

    }

    fun stop() {
        println("Stopping Timer: Duration: ${System.currentTimeMillis() - currentTimeStart} ms")

    }

}

class TimerMockInline(val name: String, someAction:() -> Unit) {

    var currentTimeStart = System.currentTimeMillis()
    val someAction = someAction

    inline fun doAction() {
        println("Starting Inline Timer")
        currentTimeStart = System.currentTimeMillis()

        try {
            someAction()
        } finally {
            stop()
        }

    }

     fun stop() {
        println("Stopping Inline Timer: Duration: ${System.currentTimeMillis() - currentTimeStart} ms")

    }

}



fun someCall() {

    Thread.sleep(2000)
}