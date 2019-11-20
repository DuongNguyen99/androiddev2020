package vn.edu.usth.weather;

//import android.content.Context;
//import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Gravity;
//import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

public class ForecastFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_forecast,container,false);
       // return inflater.inflate(R.layout.fragment_forecast,container, false);
        v.setBackgroundColor(0xff0000ff);

        LinearLayout vertical_layout= v.findViewById(R.id.linear_layout);
        LinearLayout horizontal_row;
        TextView dayText;
        ImageView icon;
        TextView weather_forecast;

        for(int i=1; i<=7; i++){
            horizontal_row =(LinearLayout) inflater.inflate(R.layout.horizontal_row, container, false);
            dayText = horizontal_row.findViewById(R.id.dayText);
            icon = horizontal_row.findViewById(R.id.icon);
            weather_forecast = horizontal_row.findViewById(R.id.weather_forecast);

            if(i==1){
                dayText.setText("Monday");
                icon.setImageResource(R.drawable.partly_cloudy);
                weather_forecast.setText("Partly Cloudy");
            } else if(i==2){
                dayText.setText("Tuesday");
                icon.setImageResource(R.drawable.showers_icon);
                weather_forecast.setText("Showers");
            } else if(i==3){
                dayText.setText("Wednesday");
                icon.setImageResource(R.drawable.rain_icon);
                weather_forecast.setText("Rain");
            } else if(i==4){
                dayText.setText("Thursday");
                icon.setImageResource(R.drawable.rain_icon);
                weather_forecast.setText("Rain");
            } else if(i==5){
                dayText.setText("Friday");
                icon.setImageResource(R.drawable.thunderstorm_icon);
                weather_forecast.setText("Thunderstorm");
            } else if(i==6){
                dayText.setText("Saturday");
                icon.setImageResource(R.drawable.partly_cloudy);
                weather_forecast.setText("Scattered Cloudy");
            } else if(i==7){
                dayText.setText("Sunday");
                icon.setImageResource(R.drawable.partly_cloudy);
                weather_forecast.setText("Partly Cloudy");
            }

            vertical_layout.addView(horizontal_row);
        }


       /* TextView day_text = new TextView(getActivity());
        day_text.setText("Thursday");
        day_text.setBackgroundColor(0x000000);
        day_text.setPadding(10, 10, 10, 10);

        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.weather_icon_1);
        weatherIcon.setScaleType(ImageView.ScaleType.FIT_CENTER);

        RelativeLayout.LayoutParams textViewParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewParam.addRule(RelativeLayout.CENTER_IN_PARENT);
        textViewParam.setMargins(10,10,10,10);
        RelativeLayout.LayoutParams imageViewParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout l_Layout = v.findViewById(R.id.LinearLayout1);
        l_Layout.setOrientation(LinearLayout.VERTICAL);
        l_Layout.setGravity(Gravity.CENTER);
        l_Layout.addView(day_text,textViewParam);
        l_Layout.addView(weatherIcon,imageViewParam);*/
        return v;
    }
}