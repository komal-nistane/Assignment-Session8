package com.example.nevigationdrawerdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nevigationdrawerdemo.CustomApplication;
import com.example.nevigationdrawerdemo.R;
import com.example.nevigationdrawerdemo.model.Person;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrganizationInformationFragment extends Fragment {

    private static final String TAG = OrganizationInformationFragment.class.getSimpleName();
    /**
     * holds customApplication instance
     */
    private CustomApplication mCustomApplication;

    public OrganizationInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mCustomApplication = new CustomApplication();
        ArrayList<Person> person = mCustomApplication.addPerson();

        for (Person persons : person) {
            Log.i(TAG, "Name :" + persons.getName() +
                    " Surname: " + persons.getSurName() +
                    " City: " + persons.getCity() +
                    " Education : " + persons.getEducation()
            );
        }
        return inflater.inflate(R.layout.fragment_organization_information, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mCustomApplication.clearPersonList();
    }
}
