package me.emmano.daggertestexample;

import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = TestApplicationModule.class)
public interface TestApplicationComponent {
  void inject(MainActivity mainActivity);
}