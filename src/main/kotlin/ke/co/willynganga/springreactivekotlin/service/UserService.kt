package ke.co.willynganga.springreactivekotlin.service

import ke.co.willynganga.springreactivekotlin.controller.UserRepository
import ke.co.willynganga.springreactivekotlin.model.User
import ke.co.willynganga.springreactivekotlin.util.UserDatabase.Companion.users
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.reactive.asFlow
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrNull
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun findAllUsers(): Flow<User> = userRepository.findAll().asFlow()

    suspend fun findUserById(id: Long): User? = userRepository.findById(id).awaitFirst()

    suspend fun saveUser(user: User): User = userRepository.save(user).awaitFirst()

    suspend fun deleteUserById(id: Long) {
        userRepository.deleteById(id).awaitFirstOrNull()
    }
}