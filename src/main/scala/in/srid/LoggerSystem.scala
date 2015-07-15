package in.srid

import org.slf4j.{LoggerFactory, MDC}

class LoggerSystem {

  private val log = LoggerFactory.getLogger(classOf[LoggerSystem])

  def doSomeLogging(mdcValue: String, message: String) = {
    MDC.put("loggerMDC", mdcValue)
    log.info(message)
    MDC.remove("loggerMDC")
  }
}
