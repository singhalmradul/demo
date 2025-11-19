package io.github.singhalmradul.sylvie.services.implementations

import com.typesafe.scalalogging.Logger
import io.github.singhalmradul.sylvie.services.TemplateBootstrapService

class LocalStorageTemplateBootstrapService extends TemplateBootstrapService:

  val log = Logger(getClass)

  override def bootstrapTemplates(): Unit =
    log.info("Bootstrapping templates from local storage")
