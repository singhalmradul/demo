package io.github.singhalmradul.sylvie.services.implementations

import scala.jdk.OptionConverters.*

import org.springframework.stereotype.Service

import io.github.singhalmradul.sylvie.repositories.TestCaseRepository
import io.github.singhalmradul.sylvie.repositories.TestStepRepository
import io.github.singhalmradul.sylvie.services.TestCaseService

@Service
class TestCaseServiceImpl(
    testCaseRepository: TestCaseRepository,
    testStepRepository: TestStepRepository) extends TestCaseService
