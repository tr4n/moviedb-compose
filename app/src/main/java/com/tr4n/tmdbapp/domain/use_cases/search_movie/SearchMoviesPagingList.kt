package com.tr4n.tmdbapp.domain.use_cases.search_movie

import com.tr4n.tmdbapp.data.model.search_movies.SearchMovieResponse
import com.tr4n.tmdbapp.domain.TmDbRepository
import com.tr4n.tmdbapp.utils.NetworkResult
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class SearchMoviesPagingList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        query: String,
        lang: String
    ): Flow<NetworkResult<Response<SearchMovieResponse>>> {
        return tmDbRepository.searchPagingList(query = query, lang = lang)
    }
}