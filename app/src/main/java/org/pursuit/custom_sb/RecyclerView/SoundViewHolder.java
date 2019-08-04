package org.pursuit.custom_sb.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import org.pursuit.custom_sb.R;

public class SoundViewHolder extends RecyclerView.ViewHolder {
    private Button soundButton;
    public SoundViewHolder(@NonNull View itemView) {
        super(itemView);
        soundButton = itemView.findViewById(R.id.sound_button);
    }
    void onBind(){
        //TODO
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
