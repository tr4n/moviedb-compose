package com.tr4n.tmdbapp.di

import com.tr4n.tmdbapp.data.repository.TmDbRepositoryImpl
import com.tr4n.tmdbapp.domain.TmDbRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class TmDbRepositoryBind {

    @Binds
    @Singleton
    abstract fun bindRepository(tmDbRepositoryImpl: TmDbRepositoryImpl): TmDbRepository

}