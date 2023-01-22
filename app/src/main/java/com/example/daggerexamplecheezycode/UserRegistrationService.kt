package com.example.daggerexamplecheezycode

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registrationUser(email: String, password: String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"no-reply@chase.com","User Registered")
    }
}