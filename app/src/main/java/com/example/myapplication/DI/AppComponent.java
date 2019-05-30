package com.example.myapplication.DI;
import com.example.myapplication.BaseApp.BaseActivity;
import dagger.Component;
import dagger.Module;
import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(BaseActivity baseActivity);
}
