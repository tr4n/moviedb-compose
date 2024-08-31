package com.tr4n.tmdbapp.domain.use_cases.upcoming

import com.tr4n.tmdbapp.data.model.movies.UpcomingMovieResponse
import com.tr4n.tmdbapp.domain.TmDbRepository
import com.tr4n.tmdbapp.utils.NetworkResult
import javax.inject.Inject

class UpcomingMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String, page: Int) :kotlinx.coroutines.flow.Flow<NetworkResult<UpcomingMovieResponse>> {
        return tmDbRepository.upcomingList(lang, page)
    }
}