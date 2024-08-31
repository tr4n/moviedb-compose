package com.tr4n.moviedb.domain.use_cases.upcoming

import com.tr4n.moviedb.data.model.movies.UpcomingMovieResponse
import com.tr4n.moviedb.domain.TmDbRepository
import com.tr4n.moviedb.utils.NetworkResult
import javax.inject.Inject

class UpcomingMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        lang: String,
        page: Int
    ): kotlinx.coroutines.flow.Flow<NetworkResult<UpcomingMovieResponse>> {
        return tmDbRepository.upcomingList(lang, page)
    }
}