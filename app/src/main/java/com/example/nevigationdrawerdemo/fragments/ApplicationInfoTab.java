package com.example.nevigationdrawerdemo.fragments;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nevigationdrawerdemo.BuildConfig;
import com.example.nevigationdrawerdemo.R;
import com.example.nevigationdrawerdemo.util.Utility;


public class ApplicationInfoTab extends Fragment {

    public ApplicationInfoTab() {
        // Required empty public constructor
    }

    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_application_info_tab, container, false);

        PackageInfo info = Utility.getPackagInfo(getActivity());
        TextView packageName = view.findViewById(R.id.packageNameTextView);

        packageName.setText(info.packageName);

        TextView minSdk = view.findViewById(R.id.SDKTextView);
        int MyDeviceAPI = Build.VERSION.SDK_INT;
        minSdk.setText(MyDeviceAPI+"");
        return view;
    }


}
