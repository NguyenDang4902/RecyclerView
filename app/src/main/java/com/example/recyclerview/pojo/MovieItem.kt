package com.example.recyclerview.pojo

data class MovieItem(var title: String, var imageUrl: String) {
    companion object {
        fun getVerticalMovieList() : List<MovieItem> {
            var movieList: MutableList<MovieItem> = arrayListOf()
            movieList.add(MovieItem(title = "Koe no Katachi", imageUrl = "https://upload.wikimedia.org/wikipedia/vi/c/c6/Koe_no_Katachi_Film_Poster.jpg"))
            movieList.add(MovieItem(title = "Kimi no Nawa", imageUrl = "https://kenh14cdn.com/thumb_w/650/2017/1-1485277071571.jpg"))
            movieList.add(MovieItem(title = "Yu-Gi-Oh! The Dark Side of Dimension", imageUrl = "https://static.wikia.nocookie.net/yugioh/images/9/9e/YuGiOhTheDarksideofDimensionsPoster.png/revision/latest?cb=20150713031525"))
            movieList.add(MovieItem(title = "Yu-Gi-Oh! Bonds Beyone Time", imageUrl = "https://upload.wikimedia.org/wikipedia/en/d/d9/Yu-Gi-Oh%21_10th_Poster.jpg"))
            movieList.add(MovieItem(title = "Doraemon: Nobita's Dinosaur", imageUrl = "https://en.wikipedia.org/wiki/Doraemon:_Nobita%27s_Dinosaur#/media/File:Nobita's_Dinosaur.png"))
            movieList.add(MovieItem(title = "Doraemon: The Records of Nobita, Spaceblazer", imageUrl = "https://upload.wikimedia.org/wikipedia/vi/a/a0/Nobita_no_Uch%C5%AB_Kaitakushi_poster.png"))
            movieList.add(MovieItem(title = "Doraemon: Stand By Me", imageUrl = "https://upload.wikimedia.org/wikipedia/vi/6/60/Stand_by_Me_Doraemon_vn_poster.jpg"))
            movieList.add(MovieItem(title = "Doraemon the Movie: Nobita's Little Star Wars 2021", imageUrl = "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/3/image/c5f0a1eff4c394a251036189ccddaacd/r/s/rsz_1doraemonlsw-_poster.jpg"))
            return movieList.shuffled()
        }

        fun getHorizontalMovie(): List<MovieItem> {
            var movieList: MutableList<MovieItem> = arrayListOf()
            movieList.add(MovieItem(title = "Furiosa: A Mad Max Saga", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/iADOJ8Zymht2JPMoy3R7xceZprc.jpg"))
            movieList.add(MovieItem(title = "Joy of Life", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/vlHJfLsduZiILN8eYdN57kHZTcQ.jpg"))
            movieList.add(MovieItem(title = "The Fall Guy", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/tSz1qsmSJon0rqjHBxXZmrotuse.jpg"))
            movieList.add(MovieItem(title = "Boy Kills World", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/25JskXmchcYwj3jHRmcPm738MpB.jpg"))
            movieList.add(MovieItem(title = "Civil War", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/sh7Rg8Er3tFcN9BpKIPOMvALgZd.jpg"))
            movieList.add(MovieItem(title = "Godzilla x Kong: The New Empire", imageUrl = "https://media.themoviedb.org/t/p/w300_and_h450_bestv2/z1p34vh7dEOnLDmyCrlUVLuoDzd.jpg"))
            return movieList.shuffled()
        }
    }
}