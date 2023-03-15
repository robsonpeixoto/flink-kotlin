package dev.robsonpeixoto.pojo


sealed interface Event
data class Header(var key: String = "", var value: String = "")
sealed class CloudEvent(var eventType: String, var headers: Array<Header> = emptyArray()) : Event
data class GithubEvent(var numPR: Int = 0) : CloudEvent(eventType = "github")
