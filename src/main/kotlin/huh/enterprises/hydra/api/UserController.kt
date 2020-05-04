package huh.enterprises.hydra.api

import huh.enterprises.hydra.component.users.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/")
    fun selectUsers() = "Hello world";
}