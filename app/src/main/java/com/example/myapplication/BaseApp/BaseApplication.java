package com.example.myapplication.BaseApp;
import android.app.Application;
import com.example.myapplication.DI.AppComponent;
import com.example.myapplication.DI.AppModule;
import com.example.myapplication.DI.DaggerAppComponent;

public class BaseApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }


    public AppComponent getAppComponent(){
        return  component;
    }
}
