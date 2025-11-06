package io.github.singhalmradul.sylvie.model.entities;

import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne

import scala.compiletime.uninitialized

import com.microstrategy.sylvie.model.enumerations.ProgrammingLanguage

@Entity
class TestStep extends IdentifiableEntity:

  var keyword: String = uninitialized

  var location: String = uninitialized

  var description: String = uninitialized

  @ManyToOne
  var testTemplate: TestTemplate = uninitialized
