package org.pursuit.custom_sb;

import android.content.Context;


import androidx.annotation.Nullable;

public class CustomSoundButton extends android.support.v7.widget.AppCompatButton {
    private int name;
    private CustomSound customSound;


    public CustomSoundButton(Context context, int name, CustomSound customSound) {
        super(context);
        this.customSound = customSound;
        this.name = name;

    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        new Runnable() {
            @Override
            public void run() {
                customSound.startSound(name);
            }
        };
        super.setOnClickListener(l);
    }
}
