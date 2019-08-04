package org.pursuit.custom_sb;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.pursuit.custom_sb.RecyclerView.SoundAdapter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CustomSound customSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCustomSounds(this);
        setCLickListener(createSoundButtons());
    }

//    private void initRecyclerView() {
//        RecyclerView soundRecyclerView = findViewById(R.id.sound_recyclerview);
//        soundRecyclerView.setAdapter(new SoundAdapter(createSoundButtons()));
//        soundRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
//    }

    private void initCustomSounds(Context c) {
        customSound = new CustomSound(c);

    }

    private String[] getAllRawResources() {
        Field fields[] = R.raw.class.getDeclaredFields();
        String[] names = new String[fields.length];

        try {
            for (int i = 0; i < fields.length; i++) {
                Field f = fields[i];
                names[i] = f.getName();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return names;
    }

    private List<Button> createSoundButtons() {
        List<Button> soundButtons = new ArrayList<>();

        Button soundButton1 = findViewById(R.id.sound_button1);
        soundButtons.add(soundButton1);

        Button soundButton2 = findViewById(R.id.sound_button2);
        soundButtons.add(soundButton2);

        Button soundButton3 = findViewById(R.id.sound_button3);
        soundButtons.add(soundButton3);

        Button soundButton4 = findViewById(R.id.sound_button4);
        soundButtons.add(soundButton4);

        Button soundButton5 = findViewById(R.id.sound_button5);
        soundButtons.add(soundButton5);


        return soundButtons;
    }

    private void setCLickListener(final List<Button> soundButtons) {
        for (int i = 0; i < soundButtons.size(); i++) {
            final int finalI = i;
            soundButtons.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    customSound.playSound(soundButtons.get(finalI));
                }
            });

        }
    }


}
