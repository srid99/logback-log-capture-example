package in.srid

import org.specs2.mutable.SpecificationWithJUnit

class LoggerSystemSpec extends SpecificationWithJUnit with InMemoryLogCapture {

  val loggerSystem = new LoggerSystem

  "Logger system" should {

    "log the message" in {
      val id = startCapturingLogMessages

      loggerSystem.doSomeLogging("id1", "message one")
      loggerSystem.doSomeLogging("id2", "message two")

      capturedLogMessages(id) must containTheSameElementsAs(Seq(
        "in.srid.LoggerSystem - id1;message one",
        "in.srid.LoggerSystem - id2;message two"
      ))
    }
  }
}
