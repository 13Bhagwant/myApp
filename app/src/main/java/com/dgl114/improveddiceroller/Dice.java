package com.dgl114.improveddiceroller;

import java.util.Random;

public class Dice {

    private int LARGEST_NUM;
    private final int SMALLEST_NUM = 1;

    private int mNumber;
    private int mImageId;

    private Random random;

    public Dice(int number) {

    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        if (number >= SMALLEST_NUM && number <= LARGEST_NUM) {
            mNumber = number;
            switch (mNumber) {
                case 1:
                    mImageId = R.drawable.dice_1;
                    break;
                case 2:
                    mImageId = R.drawable.dice_2;
                    break;
                case 3:
                    mImageId = R.drawable.dice_3;
                    break;
                case 4:
                    mImageId = R.drawable.dice_4;
                    break;
                case 5:
                    mImageId = R.drawable.dice_5;
                    break;
                case 6:
                    mImageId = R.drawable.dice_6;
                    break;
                case 7:
                    mImageId = R.drawable.dice_7;
                    break;
                case 8:
                    mImageId = R.drawable.dice_8;
                    break;
                case 9:
                    mImageId = R.drawable.dice_9;
                    break;
                case 10:
                    mImageId = R.drawable.dice_10;
                    break;
                case 11:
                    mImageId = R.drawable.dice_11;
                    break;
                case 12:
                    mImageId = R.drawable.dice_12;
                    break;
                case 13:
                    mImageId = R.drawable.dice_13;
                    break;
                case 14:
                    mImageId = R.drawable.dice_14;
                    break;
                case 15:
                    mImageId = R.drawable.dice_15;
                    break;
                case 16:
                    mImageId = R.drawable.dice_16;
                    break;
                case 17:
                    mImageId = R.drawable.dice_17;
                    break;
                case 18:
                    mImageId = R.drawable.dice_18;
                    break;
                case 19:
                    mImageId = R.drawable.dice_19;
                    break;
                case 20:
                    mImageId = R.drawable.dice_20;
                    break;
            }
        }
    }

    public int getImageId() {
        return mImageId;
    }

    public void addOne() { setNumber(mNumber + 1); }

    public void subtractOne() { setNumber(mNumber - 1); }

    public void roll() { setNumber(random.nextInt(LARGEST_NUM) + 1); }
}
