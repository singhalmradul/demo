package io.github.singhalmradul.sylvie.services.implementations

import scala.jdk.OptionConverters.*

import org.springframework.stereotype.Service

import com.microstrategy.sylvie.repositories.TestCaseRepository
import com.microstrategy.sylvie.repositories.TestStepRepository
import com.microstrategy.sylvie.services.TestCaseService

@Service
class TestCaseServiceImpl(
    testCaseRepository: TestCaseRepository,
    testStepRepository: TestStepRepository) extends TestCaseService
