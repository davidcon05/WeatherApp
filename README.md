# [Jetpack Compose Weather Tutorial Project](https://www.youtube.com/watch?v=eAbKK7JNxCE&t=78s&ab_channel=PhilippLackner)
This is a tutorial project by Phillip Lackner for learning about:
1. Jetpack Compose
2. Clean Architecture
3. MVI
4. DI with Hilt
5. Google Location Services
6. Retrofit
7. Moshi


## [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
There are three layers in this project:
1. Presentation Layer - UI 
   1. ViewModels, Composables
2. Domain Layer - Business Logic
   1. UsesCases, Entities, Repositories; the core logic of the app
3. Data Layer - Data Access
   1. DataSources, Mappers, Models; things that interact with the outside world# PLWeather

This is a smaller project so there layout uses a data, domain, presentation structure. For a larger 
project a feature based structure would be better. 

## [MVI](https://medium.com/swlh/mvi-architecture-with-android-fcde123e3c4a)
MVI stands for Model-View-Intent. It is a unidirectional data flow architecture. The data flows from
the View to the ViewModel and then back to the View. The View is passive and only displays data. The
ViewModel is active and handles the business logic. The ViewModel is also responsible for updating
the View.


## [Hilt](https://dagger.dev/hilt/)
Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual
dependency injection in your project. Hilt is built on top of Dagger library.

## [Location Services](https://developer.android.com/training/location)
The location services are used to get the current location of the user. This is done by using the
`FusedLocationProviderClient` to get the last known location of the user. If the last known location
is not recent enough then the `LocationRequest` is used to get the current location of the user.

## [Retrofit](https://square.github.io/retrofit/)
A type-safe HTTP client for Android and Java.

## [Moshi](https://github.com/square/moshi)
Modern JSON library for Kotlin and Java.

