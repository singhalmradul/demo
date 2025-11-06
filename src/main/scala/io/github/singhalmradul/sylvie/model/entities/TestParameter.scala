package io.github.singhalmradul.sylvie.model.entities

import jakarta.persistence.Entity

import scala.compiletime.uninitialized

@Entity
class TestParameter extends IdentifiableEntity:

  var name: String = uninitialized

  var dataType: String = uninitialized
