package com.example.coolinaria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecipeItem> recipeItems = new ArrayList<>();
//Добавление рецептов
        recipeItems.add(new RecipeItem(R.drawable.tataki_roli,
                Utils.TATAKI_TITLE, Utils.TATAKI_DESCRIPTION, Utils.TATAKI_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.donburi,
                Utils.DONBURI_TITLE,Utils.DONBURI_DESCRIPTION, Utils.DONBURI_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.lasagna,
                Utils.LASGANA_TITLE,Utils.LASGANA_DESCRIPTION,Utils.DONBURI_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.glintwine,
                Utils.GLINTVINE_TITLE,Utils.GLINTVINE_DESCRIPTION,Utils.GLINTVINE_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeAdapter(recipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}
