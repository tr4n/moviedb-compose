package com.tr4n.moviedb.domain.use_cases.top_rated

import androidx.paging.PagingData
import com.tr4n.moviedb.data.model.movies.MovieItem
import com.tr4n.moviedb.domain.TmDbRepository
import javax.inject.Inject

class TopRatedMoviesPagingList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String): kotlinx.coroutines.flow.Flow<PagingData<MovieItem>> {
        return tmDbRepository.topRatedPagingList(lang)
    }
}