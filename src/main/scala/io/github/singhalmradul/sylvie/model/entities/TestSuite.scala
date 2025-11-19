package io.github.singhalmradul.sylvie.model.entities

import java.util.ArrayList
import java.util.List as JList

import jakarta.persistence.Entity
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany

@Entity
class TestSuite extends IdentifiableEntity, Executable:

  @ManyToMany(targetEntity = classOf[TestScript])
  var testCases: JList[TestScript] = ArrayList[TestScript]()
