package com.tr4n.moviedb.domain

import androidx.paging.PagingData
import com.tr4n.moviedb.data.model.cast.MovieCreditsResponse
import com.tr4n.moviedb.data.model.details.MovieDetailsResponse
import com.tr4n.moviedb.data.model.movies.MovieItem
import com.tr4n.moviedb.data.model.movies.NowPlayingMovieResponse
import com.tr4n.moviedb.data.model.movies.PopularMovieResponse
import com.tr4n.moviedb.data.model.movies.TopRatedMovieResponse
import com.tr4n.moviedb.data.model.movies.UpcomingMovieResponse
import com.tr4n.moviedb.data.model.search_movies.SearchMovieResponse
import com.tr4n.moviedb.data.model.videos.GetVideosResponse
import com.tr4n.moviedb.utils.NetworkResult
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface TmDbRepository {
    //paging
    suspend fun popularPagingPagingList(lang: String): Flow<PagingData<MovieItem>>
    suspend fun nowPlayingPagingList(lang: String): Flow<PagingData<MovieItem>>
    suspend fun upcomingPagingList(lang: String): Flow<PagingData<MovieItem>>
    suspend fun topRatedPagingList(lang: String): Flow<PagingData<MovieItem>>

    //non-paging
    suspend fun popularList(lang: String, page: Int): Flow<NetworkResult<PopularMovieResponse>>
    suspend fun nowPlayingList(
        lang: String,
        page: Int
    ): Flow<NetworkResult<NowPlayingMovieResponse>>

    suspend fun upcomingList(lang: String, page: Int): Flow<NetworkResult<UpcomingMovieResponse>>
    suspend fun topRatedList(lang: String, page: Int): Flow<NetworkResult<TopRatedMovieResponse>>

    suspend fun movieDetails(
        lang: String,
        movieId: String
    ): Flow<NetworkResult<Response<MovieDetailsResponse>>>

    suspend fun movieCredits(
        lang: String,
        movieId: String
    ): Flow<NetworkResult<Response<MovieCreditsResponse>>>

    suspend fun getVideos(
        lang: String,
        movieId: String
    ): Flow<NetworkResult<Response<GetVideosResponse>>>

    suspend fun searchPagingList(
        query: String,
        lang: String
    ): Flow<NetworkResult<Response<SearchMovieResponse>>>
}