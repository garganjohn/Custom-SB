package org.pursuit.custom_sb.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.custom_sb.R;

public class SoundAdapter extends RecyclerView.Adapter<SoundViewHolder> {
    private String[] rawResources;

    public SoundAdapter(String[] rawResources) {
        this.rawResources = rawResources;
    }

    @NonNull
    @Override
    public SoundViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sound_itemview, viewGroup, false);
        return new SoundViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundViewHolder soundViewHolder, int i) {
soundViewHolder.onBind();
    }

    @Override
    public int getItemCount() {
        return rawResources.length;
    }
}
