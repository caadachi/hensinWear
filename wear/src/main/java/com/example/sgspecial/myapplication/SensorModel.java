package com.example.sgspecial.myapplication;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.util.Log;

import java.util.List;

/**
 * Created by 1cochan on 2014/08/30.
 */
public class SensorModel {
    public static void printSensors(Context context) {
        SensorManager mSensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : deviceSensors) {
            Log.d("タグ", sensor.getName() + ", " + sensor.getStringType() + ", " + sensor.getVendor());
        }
    }

    public static String getString(SensorEvent event) {
        String str = "加速度センサー値:"
                + "\nX軸:" + event.values[SensorManager.DATA_X]
                + "\nY軸:" + event.values[SensorManager.DATA_Y]
                + "\nZ軸:" + event.values[SensorManager.DATA_Z];
        return str;
    }


}
