package io.github.singhalmradul.sylvie.model.entities

import java.util.UUID

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

import scala.compiletime.uninitialized

@MappedSuperclass
abstract class IdentifiableEntity:

  @Id
  @GeneratedValue(strategy = IDENTITY)
  var id: Long = uninitialized
