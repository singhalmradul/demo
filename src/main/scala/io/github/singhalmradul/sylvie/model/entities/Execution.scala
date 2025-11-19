package io.github.singhalmradul.sylvie.model.entities

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

import scala.compiletime.uninitialized

@Entity
class Execution extends IdentifiableEntity:

  @ManyToOne(targetEntity = classOf[TestPlan])
  var testPlan: TestPlan = uninitialized
