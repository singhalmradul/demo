package io.github.singhalmradul.sylvie.model.entities

import jakarta.persistence.Entity
import scala.compiletime.uninitialized

@Entity
class Execution extends IdentifiableEntity:

  var testPlan: TestPlan = uninitialized