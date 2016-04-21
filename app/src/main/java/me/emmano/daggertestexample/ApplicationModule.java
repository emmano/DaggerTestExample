package me.emmano.daggertestexample;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class ApplicationModule {

  @Singleton @Provides String provideTestString() {
    return "Hello, World!";
  }
}
