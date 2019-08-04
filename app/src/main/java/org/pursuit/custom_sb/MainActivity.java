package org.pursuit.custom_sb;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonZero;
    private MediaPlayer mpZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomSound customSound = new CustomSound(this);
        CustomSoundButton soundZero = new CustomSoundButton(this, 0, customSound);
        ConstraintLayout container = findViewById(R.id.main_containter);
        container.addView(soundZero, 1);
    }

    void createButtonZero() {
        buttonZero = findViewById(R.id.sound_btn_0);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpZero = MediaPlayer.create(getApplicationContext(), R.raw.kyle_guy);
                mpZero.setVolume(100f, 100f);
                mpZero.start();
                mpZero.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
