package com.example.mohsen.mohsen_project;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class activity_experienced extends AppCompatActivity implements View.OnTouchListener {

    private Button sending;
    public MediaPlayer experiencedsound;
    private boolean isFlashOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experienced);

        experiencedsound =  MediaPlayer.create(activity_experienced.this, R.raw.experiencedmorse);

        sending = findViewById(R.id.button_sending);
        sending.setOnTouchListener(this);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN://when the button is clicked
                if (!experiencedsound.isPlaying()){
                    experiencedsound.start();//start media player
                    experiencedsound.setLooping(true);
                    turnOnFlash();
                }


                break;


            case MotionEvent.ACTION_UP://release the button
                experiencedsound.pause();//stop the media player
                turnOffFlash();
                break;

        }
        return false;
    }
    Camera camera;

    private void turnOnFlash(){
        if (!isFlashOn){
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                camera = Camera.open();
                Camera.Parameters params = camera.getParameters();
                List<String> supportedFlashModes = params.getSupportedFlashModes();
                params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(params);
                camera.startPreview();
            }else {
                CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                String cameraId = null;
                try {
                    cameraId = cameraManager.getCameraIdList()[0]; //usually back cam is at 0 position
                    cameraManager.setTorchMode(cameraId, true);
                } catch (CameraAccessException e){
                    e.printStackTrace();
                }
            }
            isFlashOn = true;
        }
    }

    private void turnOffFlash(){
        if (isFlashOn){
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                //  Camera camera = Camera.open();
                Camera.Parameters params = camera.getParameters();
                params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                camera.setParameters(params);
                camera.startPreview();
                camera.release();
                camera = null;
            }else {
                CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                String cameraId = null;
                try {
                    cameraId = cameraManager.getCameraIdList()[0]; //usually back cam is at 0 position
                    cameraManager.setTorchMode(cameraId, false);
                } catch (CameraAccessException e){
                    e.printStackTrace();
                }
            }
            isFlashOn = false;
        }
    }
}

