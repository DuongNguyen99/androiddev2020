package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Tag","It's got on create");

        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.secondLayout, firstFragment).commit();

        WeatherFragment secondFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.firstLayout, secondFragment).commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Tag","It's got on start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Tag","It's got on resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Tag","It's got on Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tag","It's got on Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Tag","It's got on destroy");
    }
}