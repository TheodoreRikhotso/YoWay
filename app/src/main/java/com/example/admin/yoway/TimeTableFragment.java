package com.example.admin.yoway;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TimeTableFragment extends Fragment {

   private View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.activity_time_table_fragment, container, false);
        Toast.makeText(getActivity(), "f", Toast.LENGTH_SHORT).show();
        return view;
    }
}
