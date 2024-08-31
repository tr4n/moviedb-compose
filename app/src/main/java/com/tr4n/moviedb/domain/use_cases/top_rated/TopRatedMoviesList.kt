package com.tr4n.moviedb.domain.use_cases.top_rated

import com.tr4n.moviedb.data.model.movies.TopRatedMovieResponse
import com.tr4n.moviedb.domain.TmDbRepository
import com.tr4n.moviedb.utils.NetworkResult
import javax.inject.Inject

class TopRatedMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        lang: String,
        page: Int
    ): kotlinx.coroutines.flow.Flow<NetworkResult<TopRatedMovieResponse>> {
        return tmDbRepository.topRatedList(lang, page)
    }
}