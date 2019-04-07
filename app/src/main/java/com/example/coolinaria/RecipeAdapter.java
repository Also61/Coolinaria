package com.example.coolinaria;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    ArrayList<RecipeItem> recipeItems;


    public RecipeAdapter(ArrayList<RecipeItem> recipeItems){
        this.recipeItems = recipeItems;
    }


    @NonNull
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recipe_item,viewGroup,
                false);
RecipeViewHolder recipeViewHolder = new RecipeViewHolder(view);
return recipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder viewHolder, int i) {
        RecipeItem recipeItem = recipeItems.get(i);

        viewHolder.recipeImageView.setImageResource(recipeItem.getImageResource());
        viewHolder.title.setText(recipeItem.getTitle());
        viewHolder.description.setText(recipeItem.getDescription());
    }


    @Override
    public int getItemCount() {
        return recipeItems.size();
    }

    public static class RecipeViewHolder extends  RecyclerView.ViewHolder{

        public ImageView recipeImageView;
        public TextView title;
        public TextView description;


        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeImageView = itemView.findViewById(R.id.recipeImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }
    }

}
