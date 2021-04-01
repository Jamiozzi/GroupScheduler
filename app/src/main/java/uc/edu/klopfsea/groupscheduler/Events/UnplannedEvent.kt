package uc.edu.klopfsea.groupscheduler.Events

class UnplannedEvent(var name: String, var duration: String) {
    init {
        val eventVerifier: EventVerifier = EventVerifier()
        eventVerifier.verifyEvent(this)
    }
}
