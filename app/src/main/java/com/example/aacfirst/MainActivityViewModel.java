package com.example.aacfirst;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count = 1;

    public int getDecreasedValue() {
        return --count;
    }

    public int getIncreasedValue() {
        return ++count;
    }

    public int getCurrentValue() {
        return count;
    }

}
