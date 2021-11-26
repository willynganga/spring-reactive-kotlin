package ke.co.willynganga.springreactivekotlin.util

import ke.co.willynganga.springreactivekotlin.model.User

class UserDatabase {

    companion object {
        val users = listOf(
            User(1, "Jane", "Doe", 1998),
            User(2, "John", "Doe", 2000),
            User(3, "Mike", "Doe", 1995),
            User(4, "Shawn", "Doe", 1994),
            User(5, "Pete", "Doe", 2001),
            User(6, "Kyle", "Doe", 1999),
        )
    }

}