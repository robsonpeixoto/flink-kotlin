package dev.robsonpeixoto.pojo


sealed interface Event
data class Headers(var contentType: String = "")
sealed class CloudEvent(var eventType: String, var headers: Headers = Headers(contentType = "json")) : Event
data class GithubEvent(var numPR: Int = 0) : CloudEvent(eventType = "github")
