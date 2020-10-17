package com.example.songs_corousel_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager1,viewPager2;
    MultiSnapRecyclerView firstRecyclerView,secondRecyclerView;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.brochure));
        models.add(new Model(R.drawable.sticker));
        models.add(new Model(R.drawable.poster));
        models.add(new Model(R.drawable.namecard));

        adapter = new Adapter(models, this);
        firstRecyclerView = findViewById(R.id.firstRecyclerView);
        firstRecyclerView.setAdapter(adapter);
        firstRecyclerView.setPadding(130, 0, 130, 0);


    }
}