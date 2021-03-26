package com.example.cardview_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class MyMovieAdapter extends RecyclerView.Adapter<MyMovieAdapter.ViewHolder> {
    MyMovieData [] movieData;
    Context context;

    public MyMovieAdapter(MyMovieData[] myMovieData , MainActivity activity) {
        this.movieData = myMovieData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_list , parent , false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyMovieData myMovieDataList = movieData[position];
        holder.textViewNama.setText(myMovieDataList.getNama());
        holder.textViewDate.setText(myMovieDataList.getDate());
        holder.movieImage.setImageResource(myMovieDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myMovieDataList.getNama(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewNama;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            movieImage = itemView.findViewById(R.id.image_view);
            textViewNama = itemView.findViewById(R.id.textNama);
            textViewDate = itemView.findViewById(R.id.textDate);
        }
    }
}
