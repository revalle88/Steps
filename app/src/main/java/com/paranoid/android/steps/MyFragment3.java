package com.paranoid.android.steps;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 27.04.2017.
 */ // класс для третьего фрагмента
public class MyFragment3 extends Fragment {

    TextView textMsg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout3, null);
        textMsg = (TextView) view.findViewById(R.id.tvMessage);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String msg = bundle.getString(MainActivity.KEY_MSG_3);
            if (msg != null) {
                textMsg.setText(msg);
            }
        }
        return view;
    }

    public void setMsg(String msg) {
        textMsg.setText(msg);
    }
}
