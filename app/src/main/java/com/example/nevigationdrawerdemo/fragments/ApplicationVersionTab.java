package com.example.nevigationdrawerdemo.fragments;


import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nevigationdrawerdemo.BuildConfig;
import com.example.nevigationdrawerdemo.R;
import com.example.nevigationdrawerdemo.util.Utility;

/**
 * A simple {@link Fragment} subclass.
 */
public class ApplicationVersionTab extends Fragment {

    private static final String TAG = ApplicationVersionTab.class.getSimpleName();


    public ApplicationVersionTab() {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_application_version_tab, container, false);

        PackageInfo info = Utility.getPackagInfo(getActivity());

        TextView versionCodeView = view.findViewById(R.id.edit_text_version_code);

        versionCodeView.setText(info.versionCode + "");

        Log.v(TAG,"version name "+ info.versionName);
        Log.v(TAG,"version code  "+ info.versionCode + "");
        TextView versionNoView = view.findViewById(R.id.edit_text_version_no);
        versionNoView.setText(info.versionName);

        return view;
    }

}
