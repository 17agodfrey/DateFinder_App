package com.example.datefinder_app.di

import com.example.datefinder_app.data.remote.ApiService
import com.example.datefinder_app.data.remote.NetworkClient
import com.example.datefinder_app.data.repository.DateFinderRepository
import com.example.datefinder_app.domain.repository.IDateFinderRepository
//import com.example.datefinder_app.domain.usecase.FetchDateIdeasUseCase
//import com.example.datefinder_app.domain.usecase.FetchMapDatesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return NetworkClient.apiService
    }

    @Provides
    @Singleton
    fun provideDateFinderRepository(apiService: ApiService): IDateFinderRepository {
        return DateFinderRepository(apiService)
    }


    /// I'm having the ViewModels call the repository directly, so I don't need to provide the use cases here
//    @Provides
//    @Singleton
//    fun provideFetchDateIdeasUseCase(repository: IDateFinderRepository): FetchDateIdeasUseCase {
//        return FetchDateIdeasUseCase(repository)
//    }
//
//    @Provides
//    @Singleton
//    fun provideFetchMapDatesUseCase(repository: IDateFinderRepository): FetchMapDatesUseCase {
//        return FetchMapDatesUseCase(repository)
//    }
}