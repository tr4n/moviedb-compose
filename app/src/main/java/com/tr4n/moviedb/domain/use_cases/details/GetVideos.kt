package com.tr4n.moviedb.domain.use_cases.details

import com.tr4n.moviedb.data.model.videos.GetVideosResponse
import com.tr4n.moviedb.domain.TmDbRepository
import com.tr4n.moviedb.utils.NetworkResult
import retrofit2.Response
import javax.inject.Inject

class GetVideos @Inject constructor(private val tmDbRepository: TmDbRepository) {
    suspend operator fun invoke(
        lang: String,
        movieId: String
    ): kotlinx.coroutines.flow.Flow<NetworkResult<Response<GetVideosResponse>>> {
        return tmDbRepository.getVideos(lang, movieId)
    }
}