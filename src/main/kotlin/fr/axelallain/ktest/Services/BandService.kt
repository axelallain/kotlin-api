package fr.axelallain.ktest.Services

import fr.axelallain.ktest.Models.Band

interface BandService {

    fun findAll(): MutableList<Band>
}