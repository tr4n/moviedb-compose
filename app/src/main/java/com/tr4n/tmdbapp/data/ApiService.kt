package com.tr4n.tmdbapp.data
import com.tr4n.tmdbapp.data.model.cast.MovieCreditsResponse
import com.tr4n.tmdbapp.data.model.details.MovieDetailsResponse
import com.tr4n.tmdbapp.data.model.movies.NowPlayingMovieResponse
import com.tr4n.tmdbapp.data.model.movies.PopularMovieResponse
import com.tr4n.tmdbapp.data.model.movies.TopRatedMovieResponse
import com.tr4n.tmdbapp.data.model.movies.UpcomingMovieResponse
import com.tr4n.tmdbapp.data.model.search_movies.SearchMovieResponse
import com.tr4n.tmdbapp.data.model.videos.GetVideosResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    //get now playing movies
    @GET("movie/now_playing")
    suspend fun getNowPlaying(
        @Query("page") page: Int?,
        @Query("language") language: String?,
    ):NowPlayingMovieResponse

    //get now popular movies
    @GET("movie/popular")
    suspend fun getPopular(
        @Query("page") page: Int?,
        @Query("language") language: String?,
    ): PopularMovieResponse


    //get now upcoming movies
    @GET("movie/upcoming")
    suspend fun getUpcoming(
        @Query("page") page: Int?,
        @Query("language") language: String?,
    ):UpcomingMovieResponse

    //get now top_rated movies
    @GET("movie/top_rated")
    suspend fun getTopRated(
        @Query("page") page: Int?,
        @Query("language") language: String?,
    ):TopRatedMovieResponse

    //get movie details
    @GET("movie/{movieId}")
    suspend fun getMovieDetails(
        @Path("movieId") movieId: String,
        @Query("language") language: String?,
    ): Response<MovieDetailsResponse>

    //get movie details
    @GET("movie/{movieId}/credits")
    suspend fun getMovieCredits(
        @Path("movieId") movieId: String,
        @Query("language") language: String?,
    ): Response<MovieCreditsResponse>

    //get videos
    @GET("movie/{movieId}/videos")
    suspend fun getVideos(
        @Path("movieId") movieId: String,
        @Query("language") language: String?,
    ): Response<GetVideosResponse>

    //search movie by name
    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query") query: String?,
        @Query("page") page: Int?,
        @Query("language") language: String?,
    ): Response<SearchMovieResponse>
}