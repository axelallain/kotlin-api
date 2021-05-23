package fr.axelallain.ktest.Models

import javax.persistence.*

class Band(s: String) {

    @Entity
    data class Band(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        val name: String
    )
}