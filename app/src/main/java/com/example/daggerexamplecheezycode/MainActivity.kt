package com.example.daggerexamplecheezycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository,emailService)

//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.emailService()

        //this is used when module is created by dagger directly and no need to pass any parameter
//        val component = DaggerUserRegistrationComponent.builder().build()

//        when module has parameter, without factory
//        val component = DaggerUserRegistrationComponent.builder()
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()

        val component = DaggerUserRegistrationComponent.factory().create(3)

        component.inject(this)
        userRegistrationService.registrationUser("shree@gmail.com","11111")
    }
}