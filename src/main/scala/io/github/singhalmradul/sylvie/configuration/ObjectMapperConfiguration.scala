package io.github.singhalmradul.sylvie.configuration

import org.springframework.context.annotation.Configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

@Configuration
class ObjectMapperConfiguration:

  def objectMapper(): ObjectMapper =
    val objectMapper = ObjectMapper()

    objectMapper.registerModule(DefaultScalaModule)

    objectMapper
