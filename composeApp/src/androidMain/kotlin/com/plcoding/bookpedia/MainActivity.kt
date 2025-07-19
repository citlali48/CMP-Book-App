package com.plcoding.bookpedia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.app.App
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}

@Composable
@Preview
fun previewBookScreen() {
    BookListScreen(
        BookListState(searchResults = fakeData())) {
    }
}


fun fakeData () : List<Book> {
    return (1 .. 100).map {
        Book(
            id = it.toString(),
            title = "Book $it",
            imageUrl = "oooiiaaaii",
            authors = listOf("Kali Uchis"),
            description = "Description $it",
            languages = emptyList(),
            firstPublishYear = null,
            averageRating = 4.888882,
            ratingCount = 403,
            numPages = 420,
            numEditions = 2
        )
    }
}