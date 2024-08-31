package com.tr4n.tmdbapp.domain.use_cases.popular

import androidx.paging.PagingData
import com.tr4n.tmdbapp.data.model.movies.MovieItem
import com.tr4n.tmdbapp.domain.TmDbRepository
import javax.inject.Inject

class PopularMoviesPagingList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String) :kotlinx.coroutines.flow.Flow<PagingData<MovieItem>> {
        return tmDbRepository.popularPagingPagingList(lang)
    }
}