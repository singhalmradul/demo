package io.github.singhalmradul.sylvie.model.entities

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

import scala.compiletime.uninitialized

@Entity
class ParameterValue extends IdentifiableEntity:

  @ManyToOne
  var parameter: TestParameter = uninitialized

  var value: String = uninitialized
