package com.dgl114.assignment4;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
// 1. Add Room annotations here.
public abstract class CardDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "card.db";
    private static CardDatabase mCardDatabase;

    // Singleton
    public static CardDatabase getInstance(Context context) {
        if (mCardDatabase == null) {
            // 2. Complete this method. Consider the approach used in StudyHelper.
                // Don't neglect to handle database schema changes,
                // and don't forget to add starter data!

        }

        return mCardDatabase;
    }

    public abstract CardDao cardDao();

    // 3. Complete the implementation of addStarterData.
        // You can follow StudyHelper very closely here,
        // but! the specific model methods will differ.
        // Don't forget that in StudyHelper both Subject and Questions were handled here
        // you only need to handle Cards, but you will need to use runInTransaction()
    private void addStarterData() {

    }
}
