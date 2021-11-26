package ke.co.willynganga.springreactivekotlin.controller

import ke.co.willynganga.springreactivekotlin.model.User
import org.springframework.data.r2dbc.repository.R2dbcRepository

interface UserRepository: R2dbcRepository<User, Long>