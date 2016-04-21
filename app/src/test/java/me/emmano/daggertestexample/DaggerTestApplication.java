package me.emmano.daggertestexample;

public class DaggerTestApplication extends DaggerApplication {

  private TestApplicationComponent testApplicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    testApplicationComponent = DaggerTestApplicationComponent.builder()
        .testApplicationModule(new TestApplicationModule())
        .build();
  }

  public TestApplicationComponent getTestApplicationComponent() {
    return testApplicationComponent;
  }
}
