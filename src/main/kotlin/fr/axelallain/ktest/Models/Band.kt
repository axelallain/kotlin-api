package fr.axelallain.ktest.Models

import javax.persistence.*

@Entity
data class Band(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(nullable = false)
    val name: String = ""
)