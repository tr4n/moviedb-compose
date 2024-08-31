package com.tr4n.tmdbapp.domain.use_cases.popular

import com.tr4n.tmdbapp.data.model.movies.PopularMovieResponse
import com.tr4n.tmdbapp.domain.TmDbRepository
import com.tr4n.tmdbapp.utils.NetworkResult
import javax.inject.Inject

class PopularMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String, page: Int) :kotlinx.coroutines.flow.Flow<NetworkResult<PopularMovieResponse>> {
        return tmDbRepository.popularList(lang, page)
    }
}