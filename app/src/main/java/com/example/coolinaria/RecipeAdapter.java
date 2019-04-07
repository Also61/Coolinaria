package com.example.coolinaria;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    ArrayList<RecipeItem> recipeItems;
    Context context;


    public RecipeAdapter(ArrayList<RecipeItem> recipeItems, Context context){
        this.recipeItems = recipeItems;
        this.context = context;
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

    class RecipeViewHolder extends  RecyclerView.ViewHolder implements
            View.OnClickListener {

        public ImageView recipeImageView;
        public TextView title;
        public TextView description;


        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            recipeImageView = itemView.findViewById(R.id.recipeImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }


        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            RecipeItem recipeItem = recipeItems.get(position);



            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResorse",recipeItem.getImageResource());
            intent.putExtra("title",recipeItem.getTitle());
            intent.putExtra("description",recipeItem.getDescription());
            intent.putExtra("recipe",recipeItem.getRecipe());
            context.startActivity(intent);
        }
    }

}
