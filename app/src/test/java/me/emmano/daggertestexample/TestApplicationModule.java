package me.emmano.daggertestexample;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class TestApplicationModule {

  @Singleton @Provides String provideTestString() {
    return "test";
  }
}
