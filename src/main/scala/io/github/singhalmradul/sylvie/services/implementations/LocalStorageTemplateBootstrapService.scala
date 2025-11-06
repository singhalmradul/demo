package io.github.singhalmradul.sylvie.services.implementations

import com.microstrategy.sylvie.services.TemplateBootstrapService

import com.typesafe.scalalogging.Logger

class LocalStorageTemplateBootstrapService extends TemplateBootstrapService:

  val log = Logger(getClass)

  override def bootstrapTemplates(): Unit =
    log.info("Bootstrapping templates from local storage")
