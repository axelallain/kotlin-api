package fr.axelallain.ktest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories("fr.axelallain.ktest.Daos")
class KtestApplication

fun main(args: Array<String>) {
	runApplication<KtestApplication>(*args)
}
