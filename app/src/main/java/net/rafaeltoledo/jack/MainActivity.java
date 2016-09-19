package net.rafaeltoledo.jack;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String other;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SampleComponent component = DaggerSampleComponent.create();
        component.inject(this);

        new Handler().postDelayed(() -> Log.d("JACK!", other), 2000);
    }
}
