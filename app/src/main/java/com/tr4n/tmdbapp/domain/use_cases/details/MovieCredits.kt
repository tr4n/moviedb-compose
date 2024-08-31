package com.tr4n.tmdbapp.domain.use_cases.details

import com.tr4n.tmdbapp.data.model.cast.MovieCreditsResponse
import com.tr4n.tmdbapp.domain.TmDbRepository
import com.tr4n.tmdbapp.utils.NetworkResult
import retrofit2.Response
import javax.inject.Inject

class MovieCredits @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String, movieId: String) :kotlinx.coroutines.flow.Flow<NetworkResult<Response<MovieCreditsResponse>>> {
        return tmDbRepository.movieCredits(lang, movieId)
    }
}