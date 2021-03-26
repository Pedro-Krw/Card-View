package com.example.cardview_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (findViewById(R.id.recycleView));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData [] myMovieData = new MyMovieData[]{

                new MyMovieData("Nikola Tesla" , "2020" , R.drawable.tesla ),
                new MyMovieData("Batman" , "2020" , R.drawable.batman ),
                new MyMovieData("Tannet" , "2020" , R.drawable.tanet ),
                new MyMovieData("Godzila Vs Kong" , "2021" , R.drawable.kong ),
                new MyMovieData("Habibie 3" , "2020" , R.drawable.habibi ),
                new MyMovieData("Interstellar" , "2014" , R.drawable.intersstaler ),
                new MyMovieData("Imperfect The Series" , "2021" , R.drawable.arie ),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData, MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);


    }
}