package io.github.singhalmradul.sylvie.repositories

import java.util.UUID

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param


trait RepositoryWithUuid[T] extends JpaRepository[T, UUID]
