package io.github.singhalmradul.sylvie.model.entities

import java.util.ArrayList
import java.util.List as JList

import jakarta.persistence.Entity
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

import scala.compiletime.uninitialized

@Entity
class TestPlan extends IdentifiableEntity:

  @ManyToMany(targetEntity = classOf[TestSuite])
  @JoinTable
  var testSuites: JList[TestSuite] = ArrayList[TestSuite]()
