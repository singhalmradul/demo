package io.github.singhalmradul.sylvie.repositories

import java.util.Optional
import java.util.UUID

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

import com.microstrategy.sylvie.model.entities.TestCase

trait TestCaseRepository extends JpaRepository[TestCase, Long]
