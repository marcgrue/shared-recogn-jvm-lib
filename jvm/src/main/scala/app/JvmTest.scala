package app

import app.dsl.Person._

object JvmTest {

  // jvm lib jar code is recognized on jvm
  Person.name("Bob").age(42)

  // jvm method is recognized on jvm
  Method.call
}
