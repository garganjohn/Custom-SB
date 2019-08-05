package org.pursuit.custom_sb;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.view.View;

public final class CustomSound {
    private SoundPool soundPool;
    private MediaPlayer mpSound1;
    private Context c;
    private int sound1, sound2, sound3, sound4, sound5, sound6;

    public CustomSound(Context c) {
        this.c = c;
        createBuilder();
        setSounds();
    }

    public MediaPlayer getMpSound1() {
        return mpSound1;
    }

    public void setMpSound1(MediaPlayer mpSound1) {
        this.mpSound1 = mpSound1;
    }

    public SoundPool getSoundPool() {
        return soundPool;
    }

    public void setSoundPool(SoundPool soundPool) {
        this.soundPool = soundPool;
    }

    void createBuilder() {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();
    }

    void setSounds() {
        sound1 = soundPool.load(c, R.raw.airhorn, 1);
        sound2 = soundPool.load(c, R.raw.gunshot, 1);
        sound3 = soundPool.load(c, R.raw.kyle_guy, 1);
        sound4 = soundPool.load(c, R.raw.shockwave, 1);
        sound5 = soundPool.load(c, R.raw.slap, 1);
        sound6 = soundPool.load(c, R.raw.yer, 1);
        mpSound1 = MediaPlayer.create(c, R.raw.wolfofwallstreet);
    }

    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.sound_button1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;

            case R.id.sound_button2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;

            case R.id.sound_button3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;

            case R.id.sound_button4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;

            case R.id.sound_button5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;

            case R.id.sound_button6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;

            case R.id.sound_button7:
                mpSound1.start();
                mpSound1.setOnCompletionListener(mp -> mpSound1.release());
                break;

        }
    }
}



