package io.github.singhalmradul.sylvie.services.implementations

import scala.jdk.OptionConverters.*

import org.springframework.stereotype.Service

import io.github.singhalmradul.sylvie.repositories.TestScriptRepository
import io.github.singhalmradul.sylvie.services.TestScriptService

@Service
class TestScriptServiceImpl(
    testScriptRepository: TestScriptRepository) extends TestScriptService
