package me.emmano.daggertestexample;

import android.app.Application;

public class DaggerApplication extends Application {

  private ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    applicationComponent =
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule()).build();
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
}
