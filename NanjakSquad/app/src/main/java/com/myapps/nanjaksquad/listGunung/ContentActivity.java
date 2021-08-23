package com.myapps.nanjaksquad.listGunung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.myapps.nanjaksquad.R;
import com.myapps.nanjaksquad.adapter.SectionsPagerAdapter;
import com.myapps.nanjaksquad.databinding.ActivityContentBinding;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityContentBinding activityContentBinding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(activityContentBinding.getRoot());
        setTitle(R.string.gunung);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        activityContentBinding.viewPager.setAdapter(sectionsPagerAdapter);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setElevation(0);
        }
    }
}