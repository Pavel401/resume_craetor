package com.pavel.resumecreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Window window = MainActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccent));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
    }

    public void createButtonListener(View view) {
        Toast toast=Toast.makeText(this, "Settings Button Clicked", Toast.LENGTH_LONG);
        toast.show();
        final VibrationEffect vibrationEffect1;
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        // this is the only type of the vibration which requires system version Oreo (API 26)
        if (android.os.Build.VERSION.SDK_INT >= 26) {

            // this effect creates the vibration of default amplitude for 1000ms(1 sec)
            vibrationEffect1 = VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE);

            // it is safe to cancel other vibrations currently taking place
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
        }else {
            vibrator.vibrate(50);
        }
        Intent in = new Intent(MainActivity.this,details_page.class);
        startActivity(in);

    }

    public void settingsButtonListener(View view) {
        Toast toast=Toast.makeText(this, "Settings Button Clicked", Toast.LENGTH_SHORT);
        toast.show();
        final VibrationEffect vibrationEffect1;
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        // this is the only type of the vibration which requires system version Oreo (API 26)
        if (android.os.Build.VERSION.SDK_INT >= 26) {

            // this effect creates the vibration of default amplitude for 1000ms(1 sec)
            vibrationEffect1 = VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE);

            // it is safe to cancel other vibrations currently taking place
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
        }else {
            vibrator.vibrate(50);
        }


    }

    public void downloadsButtonListener(View view) {
        Toast toast=Toast.makeText(this, "Download Button Clicked", Toast.LENGTH_SHORT);
        toast.show();
        final VibrationEffect vibrationEffect1;
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        // this is the only type of the vibration which requires system version Oreo (API 26)
        if (android.os.Build.VERSION.SDK_INT >= 26) {

            // this effect creates the vibration of default amplitude for 1000ms(1 sec)
            vibrationEffect1 = VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE);

            // it is safe to cancel other vibrations currently taking place
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
        }else {
            vibrator.vibrate(50);
        }
    }

    public void aboutButtonListener(View view) {
        Toast toast=Toast.makeText(this, "About Button Clicked", Toast.LENGTH_SHORT);
        toast.show();
        final VibrationEffect vibrationEffect1;
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        // this is the only type of the vibration which requires system version Oreo (API 26)
        if (android.os.Build.VERSION.SDK_INT >= 26) {

            // this effect creates the vibration of default amplitude for 1000ms(1 sec)
            vibrationEffect1 = VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE);

            // it is safe to cancel other vibrations currently taking place
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
        }else {
            vibrator.vibrate(50);
        }
    }
}

