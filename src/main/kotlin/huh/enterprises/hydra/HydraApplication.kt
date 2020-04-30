package huh.enterprises.hydra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HydraApplication

fun main(args: Array<String>) {
	runApplication<HydraApplication>(*args)
}
