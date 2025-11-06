package io.github.singhalmradul.sylvie.repositories;

import java.util.Optional
import java.util.UUID

import org.springframework.data.jpa.repository.JpaRepository

import com.microstrategy.sylvie.model.entities.TestStep

trait TestStepRepository extends JpaRepository[TestStep, Long]
