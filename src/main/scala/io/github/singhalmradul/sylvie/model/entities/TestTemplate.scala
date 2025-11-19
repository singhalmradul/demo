package io.github.singhalmradul.sylvie.model.entities

import java.util.ArrayList
import java.util.List as JList

import jakarta.persistence.Entity
import jakarta.persistence.EnumType.STRING
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany

import scala.compiletime.uninitialized

import io.github.singhalmradul.sylvie.model.enumerations.ProgrammingLanguage

@Entity
class TestTemplate extends IdentifiableEntity:

  var name: String = uninitialized

  var programmingLanguage: ProgrammingLanguage = uninitialized

  var location: String = uninitialized

  var dynamicFileLocation: String = uninitialized
