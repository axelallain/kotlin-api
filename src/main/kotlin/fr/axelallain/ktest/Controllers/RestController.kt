package fr.axelallain.ktest.Controllers

import fr.axelallain.ktest.Dtos.BandDto
import fr.axelallain.ktest.Exceptions.CustomException
import fr.axelallain.ktest.Models.Band
import fr.axelallain.ktest.Services.BandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class RestController {

    @Autowired
    lateinit var bandService: BandService

    @CrossOrigin
    @GetMapping("/bands")
    fun findAll(): MutableList<Band> {
        return bandService.findAll()
    }

    @CrossOrigin
    @PostMapping("/bands")
    fun addBand(@RequestBody newBand: BandDto): Band? {
        if (newBand.name.isBlank()) {
            throw CustomException("Band name is null or blank.")
        } else {
            val band = Band(
                name = newBand.name
            )
            bandService.addBand(band)
            return band
        }
    }

    @CrossOrigin
    @GetMapping("/bands/{name}")
    fun findByName(@PathVariable name: String): Band? {
        return bandService.findByName(name)
    }
}