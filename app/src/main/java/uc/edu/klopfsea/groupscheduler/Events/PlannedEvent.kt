package uc.edu.klopfsea.groupscheduler.Events

class PlannedEvent(var name: String, var date: String, var startTime: String) {
    init {
        val eventVerifier: EventVerifier = EventVerifier()
        eventVerifier.verifyEvent(this)
    }
}