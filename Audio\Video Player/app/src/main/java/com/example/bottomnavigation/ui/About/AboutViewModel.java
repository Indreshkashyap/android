package com.example.bottomnavigation.ui.About;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Create By indresh");
    }
    public LiveData<String> getText() {
        return mText;
    }
}
