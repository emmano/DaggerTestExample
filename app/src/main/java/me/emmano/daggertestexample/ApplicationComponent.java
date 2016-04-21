package me.emmano.daggertestexample;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = ApplicationModule.class) public interface ApplicationComponent {
  void inject(MainActivity mainActivity);
}