package io.github.singhalmradul.sylvie.model.entities

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

import scala.compiletime.uninitialized

@Entity
class ExecutionResult extends IdentifiableEntity:

  @ManyToOne
  var execution: Execution = uninitialized

  var details: String = uninitialized
