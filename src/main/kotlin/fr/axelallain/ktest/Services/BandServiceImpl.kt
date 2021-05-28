package fr.axelallain.ktest.Services

import fr.axelallain.ktest.Daos.BandDao
import fr.axelallain.ktest.Models.Band
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BandServiceImpl : BandService {

    @Autowired
    lateinit var bandDao : BandDao

    override fun findAll(): MutableList<Band> = bandDao.findAll()

    override fun findByName(name: String): Band? = bandDao.findByName(name)

    override fun addBand(band: Band): Band? = bandDao.save(band)
}