package org.pursuit.custom_sb.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.pursuit.custom_sb.R;

import java.util.List;

public class SoundAdapter extends RecyclerView.Adapter<SoundViewHolder> {
    private List<Button> soundButtons;

    public SoundAdapter(List<Button> soundButtons) {
        this.soundButtons = soundButtons;
    }

    @NonNull
    @Override
    public SoundViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sound_itemview, viewGroup, false);
        return new SoundViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundViewHolder soundViewHolder, int i) {

        soundViewHolder.onBind(soundButtons.get(i));
    }

    @Override
    public int getItemCount() {
        return soundButtons.size();
    }
}
