package com.github.tonytanganadroid.precisefragment.app.fragment.visibility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.tonytanganadroid.precisefragment.app.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void single(View view) {

        startActivity(new Intent(this, SingleFragmentActivity.class));
    }

    public void viewPager(View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));

    }
}
