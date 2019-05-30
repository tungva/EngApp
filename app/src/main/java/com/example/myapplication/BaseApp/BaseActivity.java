package com.example.myapplication.BaseApp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.myapplication.Repository.IQuestionRepository;
import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    IQuestionRepository questionRepository;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ((BaseApplication)getApplication()).getAppComponent().inject(this);
    }
}
