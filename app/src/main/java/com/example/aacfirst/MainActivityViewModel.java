package com.example.aacfirst;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count = 1;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public void getDecreasedValue() {
        --count;
        countLiveData.setValue(count);
    }

    public void getIncreasedValue() {
        ++count;
        countLiveData.setValue(count);
    }

    public MutableLiveData<Integer> getCurrentValue() {
        countLiveData.setValue(count);
        return countLiveData;
    }

}
