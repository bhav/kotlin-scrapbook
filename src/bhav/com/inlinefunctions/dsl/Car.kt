package bhav.com.inlinefunctions.dsl

class Car(val make: String) {

    fun engine(make: String, init: EngineBehaviour.() -> Unit): EngineBehaviour {
        val engineBehaviour = EngineBehaviour(5,100)
        engineBehaviour.init()
        return engineBehaviour


    }

    fun getMakem(): String {
        return make
    }

}