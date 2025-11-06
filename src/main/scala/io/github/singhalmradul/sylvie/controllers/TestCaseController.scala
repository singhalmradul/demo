package io.github.singhalmradul.sylvie.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

import com.microstrategy.sylvie.services.TestCaseService

@RestController
class TestCaseController(testCaseService: TestCaseService)
