package com.example.daggerexamplecheezycode

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

//    CASE 1 - FirebaseRepository don't have inject constructor so we need to pass the Firebase object in return
//    @Provides
//    fun getFirebaseUserRepository() : UserRepository{
//        return FirebaseRepository()
//    }

//    CASE 2 - We need to pass the oject which dagger can create in parameter... Dagger will check if dagger can create it ot not?..
//    if dagger creates the object it parameter then it will retrun that object else it will retun the one mentoned in return
//    @Provides
//    fun getSQLUserRepository(sqlRepository: SQLRepository) : UserRepository{
//        return FirebaseRepository()
//    }

//    CASE 3 -- simple way to write case 2 as Dagger will alwys be able to crete SQLUserRepository as it has inject constructor
    @Binds
    abstract fun getSQLUserRepository(sqlRepository: SQLRepository) : UserRepository

}