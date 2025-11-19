package io.github.singhalmradul.sylvie.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

import io.github.singhalmradul.sylvie.model.entities.TestScript
import java.util.UUID

trait TestScriptRepository extends JpaRepository[TestScript, UUID]
