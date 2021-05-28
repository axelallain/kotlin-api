package fr.axelallain.ktest.Dtos

import com.fasterxml.jackson.annotation.JsonCreator

data class BandDto @JsonCreator constructor(
    val id: Int,
    val name: String
)