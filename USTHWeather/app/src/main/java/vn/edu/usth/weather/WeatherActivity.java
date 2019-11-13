package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Tag","It's got on create");
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