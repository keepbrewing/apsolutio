package com.example.apsolutio2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.ViewHolder> {

    private ArrayList<Albums> cities;

    public AlbumsAdapter(ArrayList<Albums> cities) {
        this.cities = cities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.new_trending_layout, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Albums city = cities.get(position);

        holder.name.setText(city.getName());
        holder.source.setText(city.getSource());

        Picasso.get().load(city.getImageURL()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        if (cities != null) {
            return cities.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;
        public final TextView source;
        public final ImageView image;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = view.findViewById(R.id.new_trending_name);
            source = view.findViewById(R.id.new_trending_source);
            image = view.findViewById(R.id.new_trending_image);
        }
    }
}