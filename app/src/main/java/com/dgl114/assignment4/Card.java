package com.dgl114.assignment4;

// 1. Add Room annotations as necessary to this file.
public class Card {

    private long mId;
    private String mText;
    private String mDetail;

    public Card() {}

    public Card(String text) {
        mText = text;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }
}
