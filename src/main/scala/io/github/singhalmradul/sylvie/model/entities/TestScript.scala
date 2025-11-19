package io.github.singhalmradul.sylvie.model.entities

import java.util.ArrayList
import java.util.List as JList
import java.util.UUID

import jakarta.persistence.Entity
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

import scala.compiletime.uninitialized

@Entity
class TestScript extends IdentifiableEntity, Executable
