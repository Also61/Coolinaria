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

        recipeItems.add(new RecipeItem(R.drawable.mak,Utils.McDONALDS_TITLE,Utils.McDONALDS_ADRESS,
                Utils.McDONALDS_OTHER));
        recipeItems.add(new RecipeItem(R.drawable.bk,Utils.BURGERKING_TITLE,Utils.BURGERKING_ADRESS,
                Utils.BURGERKING_OTHER));
        recipeItems.add(new RecipeItem(R.drawable.japonika,Utils.JAPONIKA_TITLE,Utils.JAPONIKA_ADRESS,
                Utils.JAPONIKA_OTHER));
        recipeItems.add(new RecipeItem(R.drawable.razdolie,Utils.RAZDOLIE_TITLE,Utils.RAZDOLIE_ADRESS,Utils.RAZDOLIE_OTHER));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeAdapter(recipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}
