package com.example.fragment2_torik.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment2_torik.R;

public class KoalaFragment extends Fragment
{
    public KoalaFragment ()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.activity_multiple_koala, container, false);

        return rootView;

    }
}
