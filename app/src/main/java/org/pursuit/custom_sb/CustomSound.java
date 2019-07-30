package org.pursuit.custom_sb;

import android.content.Context;
import android.media.MediaPlayer;

public final class CustomSound  {
    MediaPlayer mediaPlayer;
    private Context c;

    public CustomSound(Context context) {
        this.c = context;
        mediaPlayer = MediaPlayer.create(context, null);
    }

    public void startSound(int soundNum) {
        switch (soundNum) {
            case 0:
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release();
                    }
                });
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }

}
