package com.example.nevigationdrawerdemo.fragments;


import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nevigationdrawerdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeviceInformationTab extends Fragment{


    /**
     * Holds manufacturer info in text view instance
     */
    TextView mtextManufacture;

    /**
     * Holds model info in text view instance
     */
    TextView mtextModel;

    /**
     * Holds device name in text view instance
     */
    TextView mtextDeviceName;

    /**
     * Holds kernel version info in text view instance
     */
    TextView mtextKernelVersion;

    /**
     * Holds serial info in text view instance
     */
    TextView mtextSerial;

    /**
     * Holds OS version info in text view instance
     */
    TextView mtextOSVersion;

    /**
     * Holds Build number info in text view instance
     */
    TextView mtextBuildNumber;

    public DeviceInformationTab() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i("TAG", "SERIAL: " + Build.SERIAL);
        Log.i("TAG","MODEL: " + Build.MODEL);
        Log.i("TAG","ID: " + Build.ID);
        Log.i("TAG","Manufacture: " + Build.MANUFACTURER);
        Log.i("TAG","brand: " + Build.BRAND);
        Log.i("TAG","type: " + Build.TYPE);
        Log.i("TAG","user: " + Build.USER);
        Log.i("TAG","BASE: " + Build.VERSION_CODES.BASE);
        Log.i("TAG","INCREMENTAL " + Build.VERSION.INCREMENTAL);
        Log.i("TAG","SDK  " + Build.VERSION.SDK);
        Log.i("TAG","BOARD: " + Build.BOARD);
        Log.i("TAG","BRAND " + Build.BRAND);
        Log.i("TAG","HOST " + Build.HOST);
        Log.i("TAG","FINGERPRINT: "+Build.FINGERPRINT);
        Log.i("TAG","Version Code: " + Build.VERSION.RELEASE);
        View view = inflater.inflate(R.layout.fragment_device_information_tab, container, false);

        mtextModel = view.findViewById(R.id.text_view_model);
        mtextModel.setText(Build.MODEL); // get model name

        mtextManufacture = view.findViewById(R.id.text_view_manufacture);
        mtextManufacture.setText(Build.MANUFACTURER); // get device manufacture

        mtextKernelVersion = view.findViewById(R.id.text_view_version_kernel);
        mtextKernelVersion.setText(System.getProperty("os.version")); // get kernel version

        mtextDeviceName = view.findViewById(R.id.text_view_device_name);
        mtextDeviceName.setText(Build.PRODUCT);

        mtextSerial = view.findViewById(R.id.text_view_serial);
        mtextSerial.setText(Build.SERIAL); // get device Serial

        mtextOSVersion = view.findViewById(R.id.text_view_version_os);
        mtextOSVersion.setText(Build.VERSION.RELEASE); // get OS version

        mtextBuildNumber = view.findViewById(R.id.text_view_build_num);
        mtextBuildNumber.setText(Build.FINGERPRINT); //get Device's Build Number

        return view;
    }


}
