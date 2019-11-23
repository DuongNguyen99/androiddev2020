package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WeatherFragment extends Fragment{
    public WeatherFragment(){};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RelativeLayout weatherFragment = (RelativeLayout) inflater.inflate(R.layout.fragment_weather, container, false);

        ImageView weatherImage=weatherFragment.findViewById(R.id.imageCenter);
        weatherImage.setImageResource(R.drawable.rain_icon);

        TextView text_top_left = weatherFragment.findViewById(R.id.textTopLeft);
        text_top_left.setText("20C");

        TextView text_top_right = weatherFragment.findViewById(R.id.textTopRight);
        text_top_right.setText("Paris");

        weatherFragment.removeAllViews();
        weatherFragment.addView(text_top_left);
        weatherFragment.addView(weatherImage);
        weatherFragment.addView(text_top_right);

        return weatherFragment;
    }
}

