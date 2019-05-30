package com.example.myapplication.DI;
import android.content.Context;
import com.example.myapplication.BaseApp.BaseApplication;
import com.example.myapplication.Repository.IQuestionRepository;
import com.example.myapplication.Repository.QuestionRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final BaseApplication baseApplication;

    public AppModule(BaseApplication baseApplication){
        this.baseApplication = baseApplication;
    }

    @Provides
    @Singleton
    Context providerApplication(){
        return baseApplication;
    }

    @Provides
    @Singleton
    IQuestionRepository providerQuestion(){
        return new QuestionRepository();
    }

}
