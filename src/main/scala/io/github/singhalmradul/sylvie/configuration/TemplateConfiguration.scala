package io.github.singhalmradul.sylvie.configuration

import java.io.File

import org.springframework.context.annotation.Configuration

import freemarker.template.Configuration as FreeMarkerConfiguration
import freemarker.template.TemplateExceptionHandler.RETHROW_HANDLER
import FreeMarkerConfiguration.VERSION_2_3_34

@Configuration
class TemplateConfiguration:

  def freeMarkerConfiguration: FreeMarkerConfiguration =
    val freeMarkerConfiguration = FreeMarkerConfiguration(VERSION_2_3_34)
    val directory               = File("/tmp/templates")

    freeMarkerConfiguration.setDirectoryForTemplateLoading(directory)
    freeMarkerConfiguration.setDefaultEncoding("UTF-8")
    freeMarkerConfiguration.setTemplateExceptionHandler(RETHROW_HANDLER)

    freeMarkerConfiguration
