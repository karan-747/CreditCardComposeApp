package com.testers.unique.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.testers.unique.creditcardapp.ui.theme.CreditCard
import com.testers.unique.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards() {
    val cards = listOf<CreditCardModel>(
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.mastercard,
            R.drawable.back1
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.visa,
            R.drawable.back3
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.rupay,
            R.drawable.back1
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.rupay,
            R.drawable.back4
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.mastercard,
            R.drawable.back3
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.paypal,
            R.drawable.back2
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.mastercard,
            R.drawable.back1
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.visa,
            R.drawable.back3
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.rupay,
            R.drawable.back1
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.rupay,
            R.drawable.back4
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.mastercard,
            R.drawable.back3
        ),
        CreditCardModel(
            "1234 1234 1234 1234",
            "VLADMIR PUTIN",
            R.drawable.paypal,
            R.drawable.back2
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        items(count = cards.size){
            CreditCard(cardInfo = cards[it])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreditCardAppTheme {

    }
}