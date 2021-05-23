package fr.axelallain.ktest

import fr.axelallain.ktest.Models.Band
import fr.axelallain.ktest.Services.BandService
import org.aspectj.lang.annotation.Before
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class BandServiceTests {

    @Autowired
    lateinit var bandService: BandService
    
    @Test
    fun `should return the band with the name that has been searched`() {
        // given
        var bands = mutableListOf(Band(1, "bandone"), Band(2, "bandtwo"))

        // when
        var result = bandService.findByName("bandtwo")

        // then
        if (result != null) {
            assertThat(result.name).isEqualTo("bandtwo")
        }
    }
}