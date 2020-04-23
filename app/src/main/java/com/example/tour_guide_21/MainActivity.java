package com.example.tour_guide_21;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

//import android.support.v8.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(getString(R.string.app_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //tabbed activity
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new Intrest(), "Intrest");
        viewPagerAdapter.addFragment(new Iconic(), "Iconic");
        viewPagerAdapter.addFragment(new Heritage(), "Heritage");
        viewPagerAdapter.addFragment(new Restaurents(), "Restaurents");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.ic_location);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.ic_iconic);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.ic_boudhanath);
        Objects.requireNonNull(tabLayout.getTabAt(3)).setIcon(R.drawable.ic_fork);
    }

}
