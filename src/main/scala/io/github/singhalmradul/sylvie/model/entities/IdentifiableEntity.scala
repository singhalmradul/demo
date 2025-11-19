package io.github.singhalmradul.sylvie.model.entities

import java.util.UUID

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.UUID as UuidStrategy
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

import scala.compiletime.uninitialized

@MappedSuperclass
abstract class IdentifiableEntity:

  @Id
  @GeneratedValue(strategy = UuidStrategy)
  var id: UUID = uninitialized
