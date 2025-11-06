package com.microstrategy.demo;

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

import org.junit.jupiter.api.Test;

@SpringBootTest
@ActiveProfiles(Array("test"))
class DemoApplicationTests:

  @Test
  def contextLoads(): Unit =
    assert(true)
