package com.example.recyclerview.pojo

const val VERTICAL = "vertical"
const val HORIZONTAL = "horizontal"
data class MovieContent(var categoryTitle: String, var type: String, var movieList: List<MovieItem>) {
    companion object {
        fun getMovieContent(): List<MovieContent> {
            var movieContentList: MutableList<MovieContent> = arrayListOf()
            movieContentList.add(
                MovieContent(
                    categoryTitle = "New",
                    type = VERTICAL,
                    movieList = MovieItem.getVerticalMovieList()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Horror",
                    type = HORIZONTAL,
                    movieList = MovieItem.getHorizontalMovie()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Romance",
                    type = VERTICAL,
                    movieList = MovieItem.getVerticalMovieList()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Action",
                    type = VERTICAL,
                    movieList = MovieItem.getVerticalMovieList()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Western",
                    type = HORIZONTAL,
                    movieList = MovieItem.getHorizontalMovie()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Anime",
                    type = VERTICAL,
                    movieList = MovieItem.getVerticalMovieList()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Comedy",
                    type = HORIZONTAL,
                    movieList = MovieItem.getHorizontalMovie()
                )
            )
            movieContentList.add(
                MovieContent(
                    categoryTitle = "Thriller",
                    type = HORIZONTAL,
                    movieList = MovieItem.getHorizontalMovie()
                )
            )
            return movieContentList
        }
    }
}