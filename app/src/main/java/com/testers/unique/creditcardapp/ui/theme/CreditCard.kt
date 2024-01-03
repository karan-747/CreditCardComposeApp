package com.testers.unique.creditcardapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.testers.unique.creditcardapp.CreditCardModel
import com.testers.unique.creditcardapp.R

@Composable
fun CreditCard(cardInfo: CreditCardModel) {
    Card(
        modifier = Modifier
            .height(200.dp)
            .padding(bottom = 5.dp, top = 2.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {

        Box {
            Image(
                painter = painterResource(id = cardInfo.backgroundImage),
                contentDescription = "Visa",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Box(
                modifier = Modifier.padding(16.dp).fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = cardInfo.providerImage),
                    contentDescription = "Provider Image",
                    modifier = Modifier
                        .width(80.dp)
                        .align(Alignment.TopStart)
                )
                Column(
                    modifier = Modifier.align(Alignment.BottomStart)
                ) {
                    Text(
                        text = cardInfo.cardNo,
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.2.sp

                    )
                    Text(
                        text = cardInfo.cardHolder,
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.1.sp

                    )
                }
            }
        }

    }
}


@Composable
@Preview(showBackground = true)
fun PreviewMyCard() {
    val cardInfo = CreditCardModel(
        "1234 1234 1234 1234",
        "VLADMIR PUTIN",
        R.drawable.visa,
        R.drawable.back1
    )
    CreditCard(cardInfo = cardInfo)
}