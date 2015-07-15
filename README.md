# Logback capturing logs example

In one of our project we had to test the logged message (format and few other things since it was the core functionality).

This can be achieved by 2 ways, using a mock and verify the logs or the other way is to capture the logs in-memory and assert them later.

This example demonstrates the later, that how to capture the logs and use them later to verify.

The idea is to have a [custom appender](./src/test/scala/in/srid/InMemoryAppender.scala) which captures the logs in-memory. From our test we trigger to start capturing the logs.
A unique id is allocated for that test which can be used to retrieve the logs for that particular test case.

To run the test,

    sbt test

This example is based on Logback but the same idea can be used for Log4j as well.
