package com.example.tour_guide_21;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //tabbed activity
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new Intrest(), "Intrest");
        viewPagerAdapter.addFragment(new Iconic(), "Iconic");
        viewPagerAdapter.addFragment(new Heritage(), "Heritage");
        viewPagerAdapter.addFragment(new Restaurents(), "Restaurents");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_location);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_iconic);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_boudhanath);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_fork);
    }

}
