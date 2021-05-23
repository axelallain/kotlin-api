package fr.axelallain.ktest.Controllers

import fr.axelallain.ktest.Models.Band
import fr.axelallain.ktest.Services.BandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class RestController {

    @Autowired
    lateinit var bandService: BandService

    @GetMapping("/test")
    fun test(): MutableList<Band> {
        return bandService.findAll()
    }
}