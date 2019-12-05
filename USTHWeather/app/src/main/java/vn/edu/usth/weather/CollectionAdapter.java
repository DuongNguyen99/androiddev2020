package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CollectionAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };

    public CollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public Fragment getItem(int page) {
        WeatherAndForecastFragment weatherAndForecastFragment = new WeatherAndForecastFragment();
        Bundle bundle = new Bundle();
        page = page + 1;
        bundle.putString("page", Integer.toString(page));
        weatherAndForecastFragment.setArguments(bundle);
        return weatherAndForecastFragment;
    }

    @Override
    public CharSequence getPageTitle(int page) {
        return titles[page];
    }

}
