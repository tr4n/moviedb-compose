package com.tr4n.tmdbapp.domain.use_cases.now_playing

import com.tr4n.tmdbapp.data.model.movies.NowPlayingMovieResponse
import com.tr4n.tmdbapp.domain.TmDbRepository
import com.tr4n.tmdbapp.utils.NetworkResult
import javax.inject.Inject

class NowPlayingMoviesList @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(lang: String, page: Int) :kotlinx.coroutines.flow.Flow<NetworkResult<NowPlayingMovieResponse>> {
        return tmDbRepository.nowPlayingList(lang, page)
    }
}