package com.example.mvcnerds.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvcnerds.Models.MovieModel;
import com.example.mvcnerds.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView movieNameTV;
    Button getMovieBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieNameTV = findViewById(R.id.textView);
        getMovieBtn = findViewById(R.id.button);
        getMovieBtn.setOnClickListener(this);

    }

    public MovieModel getMovieFromDatabase(){

        return new MovieModel("Cast Away", "28/5/1993", "Very Sad Movie", 1);
    }

    public void getMovie() {
        movieNameTV.setText(getMovieFromDatabase().getName());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button){
            getMovie();
        }
    }
}
