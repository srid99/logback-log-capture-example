package in.srid

import java.io.ByteArrayOutputStream
import java.lang.System.lineSeparator

import ch.qos.logback.core.OutputStreamAppender
import InMemoryAppender.outputStream
import org.slf4j.MDC

import scala.util.Random

class InMemoryAppender extends OutputStreamAppender {
  override def start() = {
    setOutputStream(outputStream)
    super.start()
  }
}

object InMemoryAppender {
  val outputStream = new ByteArrayOutputStream
}

trait InMemoryLogCapture {
  def capturedLogMessages(uniqueId: Int) = {
    val id = uniqueId.toString
    outputStream.toString.split(lineSeparator).toList.filter(_.startsWith(id)).map(_.replace(id, "").trim)
  }

  def startCapturingLogMessages: Int = {
    val uniqueId = Random.nextInt()
    MDC.put("uniqueId", uniqueId.toString)
    uniqueId
  }
}
