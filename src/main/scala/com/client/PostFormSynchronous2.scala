package com.client

object PostFormSynchronous2 extends App {
  import sttp.client3._

  val signup = Some("yes")

  val request = basicRequest
    // send the body as form data (x-www-form-urlencoded)
    .body(Map("name" -> "John", "surname" -> "doe"))
    // use an optional parameter in the URI
    .post(uri"https://httpbin.org/post?signup=$signup")

  val backend = HttpClientSyncBackend()
  val response = request.send(backend)

  println(response.body)
  println(response.headers)
}