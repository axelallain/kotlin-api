package fr.axelallain.ktest.Daos

import fr.axelallain.ktest.Models.Band
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BandDao : JpaRepository<Band, Int> {
    fun findByName(name: String): Band?
}