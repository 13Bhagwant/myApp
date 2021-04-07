package com.dgl114.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CardDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_CARD_ID = "com.dgl114.assignment4.recyclerview.card_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);

        // 1. Get the Intent that brought you here - don't create a new Intent!


        // 2. Get a single card - use the CardDao and make sure you get the right Card!


        // 3. Get references to your view widgets so that the Card data can be displayed.


        // 4. Show the card by calling showCard()
            // Unlike in StudyHelper there is no need for showCard to have a parameter here,
            // since you've already picked the right card above.
            // (Remember that in StudyHelper chosing a Subject displayed numerous Questions;
            // in this app choosing a card displays more details about *that* card).
        showCard();
    }

    private void showCard() {
        // 5. Set values as appropriate for the views, based on the Card instance
    }
}