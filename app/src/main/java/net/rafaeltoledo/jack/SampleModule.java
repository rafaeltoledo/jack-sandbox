package net.rafaeltoledo.jack;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {

    @Provides
    public String provideMessage() {
        return "Is Jack production ready?";
    }
}
