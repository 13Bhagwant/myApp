package com.dgl114.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CardAdapter mCardAdapter;
    private RecyclerView mRecyclerView;
    private CardDatabase mCardDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Singleton
        mCardDb = CardDatabase.getInstance(getApplicationContext());

        // 1. Instantiate the RecyclerView object and set layout


        // 2. Instantiate the CardAdapter from the CardAdapater constructor
            // set it to the RecyclerView adapter

    }

    // 3. Write a private method (similar to loadSubjects from StudyHelper)
        // that returns a List<Card> from the database (use the CardDao!)

    // 4. Complete the CardHolder class
    private class CardHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Card mCard;
        private TextView mTextView;

        public CardHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.recycler_view_items, parent, false));
            itemView.setOnClickListener(this);
            mTextView = itemView.findViewById(R.id.cardTextView);
        }

        // 5. Complete the bind method. Use this method to ensure mCard and mTextView
            // both have appropriate values.
            // You may also use this space to distinguish each Card using a method similar
            // to that in StudyHelper - or of your own design.
        public void bind(Card card) {

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, CardDetailsActivity.class);
            intent.putExtra(CardDetailsActivity.EXTRA_CARD_ID, mCard.getId());
            startActivity(intent);
        }
    }

    // 6. Complete the CardAdapter class
    private class CardAdapter extends RecyclerView.Adapter<CardHolder> {

        private List<Card> mCardList;

        // 7. Write the CardAdapter constructor. Look to StudyHelper for inspiration.


        @NonNull
        @Override
        public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getApplicationContext());
            return new CardHolder(layoutInflater, parent);
        }

        // 8. Complete the onBindViewHolder method. Look to StudyHelper for inspiration.
        @Override
        public void onBindViewHolder(CardHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return mCardList.size();
        }
    }
}