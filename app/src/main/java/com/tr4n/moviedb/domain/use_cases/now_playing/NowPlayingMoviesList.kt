package com.tr4n.moviedb.domain.use_cases.now_playing

import com.tr4n.moviedb.data.model.movies.NowPlayingMovieResponse
import com.tr4n.moviedb.domain.TmDbRepository
import com.tr4n.moviedb.utils.NetworkResult
import javax.inject.Inject

class NowPlayingMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        lang: String,
        page: Int
    ): kotlinx.coroutines.flow.Flow<NetworkResult<NowPlayingMovieResponse>> {
        return tmDbRepository.nowPlayingList(lang, page)
    }
}