package com.example.coolinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        ImageView imageView = findViewById(R.id.recipeImageView);



        Intent intent = getIntent();
        if (intent != null){
title.setText(intent.getStringExtra("title"));
recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}
