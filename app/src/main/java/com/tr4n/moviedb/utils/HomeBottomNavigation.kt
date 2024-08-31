package com.tr4n.moviedb.utils

import com.tr4n.moviedb.R

sealed class HomeBottomNavigation(val title: String, val icon: Int, val route: String) {

    data object Home : HomeBottomNavigation("Home", R.drawable.ic_home, "home")
    data object Favorite : HomeBottomNavigation("Favorite", R.drawable.ic_favorite, "favorite")
    data object Profile : HomeBottomNavigation("Profile", R.drawable.ic_profile, "profile")


}