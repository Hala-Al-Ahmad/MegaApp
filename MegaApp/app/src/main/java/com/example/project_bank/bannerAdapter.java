package com.example.project_bank;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class bannerAdapter extends RecyclerView.Adapter< bannerAdapter.viewItem> {

    Context c;
    List<banner_Cycle> banner_items;

    public  bannerAdapter(Context c, List<banner_Cycle> banner_items) {
        this.banner_items = banner_items;
        this.c = c;
    }

    class viewItem extends RecyclerView.ViewHolder {
        ImageView image;

        public viewItem(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_cycle);


        }
    }


    @Override
    public viewItem onCreateViewHolder(final ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.banner_cycle, parent, false);
        return new viewItem(itemView);
    }

    @Override
    public void onBindViewHolder(viewItem holder, final int position) {
        Glide.with(c).load(banner_items.get(position).getImageURL()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return banner_items.size();
    }


}
