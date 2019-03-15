package com.example.nevigationdrawerdemo;

import android.app.Application;
import android.util.Log;

import com.example.nevigationdrawerdemo.model.Person;

import java.util.ArrayList;
import java.util.List;

public class CustomApplication extends Application {
   ArrayList<Person> personList ;
private static final String TAG = CustomApplication.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     *
     * @return
     */
    public ArrayList<Person> addPerson(){
        personList = new ArrayList<>();
        personList.add(new Person("komal","Nistane", "Nagpur", "Mtech"));
        personList.add(new Person("ashwini","khekade", "Latur", "Mtech"));
        personList.add(new Person("ragini","jain", "Nagpur", "BE"));
        personList.add(new Person("swati","Khobragade", "Nagpur", "BE"));
        return personList;
    }

    public void clearPersonList()
    {
        personList.clear();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.v(TAG,"In on low memory");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.v(TAG,"In on trim memory");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.v(TAG,"In on terminate");
    }
}
