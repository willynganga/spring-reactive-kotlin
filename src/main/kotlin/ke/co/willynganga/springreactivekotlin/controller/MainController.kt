package ke.co.willynganga.springreactivekotlin.controller

import ke.co.willynganga.springreactivekotlin.model.User
import ke.co.willynganga.springreactivekotlin.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class MainController(
    private val userService: UserService
) {

    @GetMapping("/")
    fun sayHello(): String {
        return "Hello World!"
    }

    @GetMapping("/greet")
    fun greet(@RequestParam name: String): String {
        return "Hello $name!"
    }

    @GetMapping("/user/all")
    fun findAllUsers() = userService.findAllUsers()

    @GetMapping("/user/{id}")
    suspend fun findUserById(@PathVariable id: Long) = userService.findUserById(id)

    @PostMapping("/user/add")
    suspend fun saveUSer(@RequestBody user: User): User = userService.saveUser(user)

    @DeleteMapping("/user/delete/{id}")
    suspend fun deleteUser(@PathVariable id: Long) {
        userService.deleteUserById(id)
    }
}