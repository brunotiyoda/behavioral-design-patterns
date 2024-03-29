package domain

class Runway(private val atcMediator: IATCMediator) : Command {

    init {
        atcMediator.setLandingStatus(true)
    }

    override fun land() {
        println("Landing permission granted...")
        atcMediator.setLandingStatus(true)
    }

}