package app

import app.dsl.Person._

object SharedTest {

  // jvm lib jar code compiles but is not recognized on shared
  Person.name("Bob").age(42)

  // jvm method is recognized on shared
  Method.call
}
