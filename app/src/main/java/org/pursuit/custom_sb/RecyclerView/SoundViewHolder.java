package org.pursuit.custom_sb.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import org.pursuit.custom_sb.CustomSound;
import org.pursuit.custom_sb.R;

public class SoundViewHolder extends RecyclerView.ViewHolder {
    private CustomSound customSound;


    public SoundViewHolder(@NonNull View itemView) {
        super(itemView);
        customSound = new CustomSound(itemView.getContext());
    }

    void onBind(final Button soundButton) {
        //TODO
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customSound.playSound(v);
            }
        });
    }
}
