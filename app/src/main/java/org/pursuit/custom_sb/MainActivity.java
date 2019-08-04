package org.pursuit.custom_sb;

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
    private RecyclerView soundRecyclerView;
    private List<Button> soundButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        soundRecyclerView = findViewById(R.id.sound_recyclerview);
        soundRecyclerView.setAdapter(new SoundAdapter(createSoundButtons()));
        soundRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
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
        soundButtons = new ArrayList<>();
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

//    void createButtonZero() {
//        buttonZero = findViewById(R.id.sound_btn_0);
//        buttonZero.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mpZero = MediaPlayer.create(getApplicationContext(), R.raw.kyle_guy);
//                mpZero.setVolume(100f, 100f);
//                mpZero.start();
//                mpZero.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//                        mp.release();
//                    }
//                });
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
}
