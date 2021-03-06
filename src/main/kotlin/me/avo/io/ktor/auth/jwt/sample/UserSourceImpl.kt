package me.avo.io.ktor.auth.jwt.sample

import io.ktor.auth.*

class UserSourceImpl : UserSource {

    override fun findUserById(id: Int): User {
        return users[id]!!
    }

    override fun findUserByCredentials(credential: UserPasswordCredential): User {
        return testUser
    }

    private val users = listOf(testUser).associateBy(User::id)

}