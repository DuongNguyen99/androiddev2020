package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.view.Gravity;
//import android.widget.FrameLayout;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.RelativeLayout;
//import android.widget.LinearLayout;

public class ForecastFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_forecast,container,false);
        return v;

        /*v.setBackgroundColor(0xff0000ff);
        TextView day_text = new TextView(getActivity());
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
    }
}