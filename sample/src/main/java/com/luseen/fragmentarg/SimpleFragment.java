package com.luseen.fragmentarg;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luseen.easy_fragment_argument.Argument;
import com.luseen.easy_fragment_argument.ArgumentFragment;

public class SimpleFragment extends ArgumentFragment {

    private static final String TAG = "SimpleFragment";

    @Argument
    private String name;

    @Argument
    private Boolean secondBoolean;

    @Argument
    private Integer testInteger;

    @Argument
    private User testUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_simple, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG,"String " + name);
        Log.d(TAG,"Boolean " + secondBoolean);
        Log.d(TAG,"Integer " + testInteger);
        Log.d(TAG,"User " + testUser.getUserName());
    }
}
