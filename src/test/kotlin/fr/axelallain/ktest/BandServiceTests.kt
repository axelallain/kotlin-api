package fr.axelallain.ktest

import fr.axelallain.ktest.Controllers.RestController
import fr.axelallain.ktest.Models.Band
import fr.axelallain.ktest.Services.BandService
import org.aspectj.lang.annotation.Before
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired

@ExtendWith(MockitoExtension::class)
class BandServiceTests {

    @InjectMocks
    lateinit var restController: RestController

    @Mock
    lateinit var bandService: BandService

    @Test
    fun `should return the band with the name that has been searched`() {
        // given
        var band = Band(1, "testband")
        Mockito.`when`(bandService.findByName("testband")).thenReturn(band)

        // when
        var result = restController.findByName("testband")

        // then
        if (result != null) {
            assertThat(result.name).isEqualTo("testband")
        }
    }
}