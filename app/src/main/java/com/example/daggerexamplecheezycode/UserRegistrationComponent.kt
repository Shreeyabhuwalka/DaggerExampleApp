package com.example.daggerexamplecheezycode

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

//    fun getUserRegistrationService() : UserRegistrationService
//    fun emailService(): EmailService
//
    //passing the consumer in parameter
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int):UserRegistrationComponent
    }
}