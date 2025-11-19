package io.github.singhalmradul.sylvie.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

import io.github.singhalmradul.sylvie.services.TestScriptService

@RestController
class TestScriptController(testCaseService: TestScriptService)
