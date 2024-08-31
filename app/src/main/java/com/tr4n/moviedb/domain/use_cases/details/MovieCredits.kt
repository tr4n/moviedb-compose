package com.tr4n.moviedb.domain.use_cases.details

import com.tr4n.moviedb.data.model.cast.MovieCreditsResponse
import com.tr4n.moviedb.domain.TmDbRepository
import com.tr4n.moviedb.utils.NetworkResult
import retrofit2.Response
import javax.inject.Inject

class MovieCredits @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        lang: String,
        movieId: String
    ): kotlinx.coroutines.flow.Flow<NetworkResult<Response<MovieCreditsResponse>>> {
        return tmDbRepository.movieCredits(lang, movieId)
    }
}