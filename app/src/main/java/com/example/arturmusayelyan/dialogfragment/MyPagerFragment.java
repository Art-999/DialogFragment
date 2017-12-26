package com.example.arturmusayelyan.dialogfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 26/12/2017.
 */

public class MyPagerFragment extends Fragment {
    public MyPagerFragment() {

    }

    public static MyPagerFragment newInstance(int itemPosition) {
        Bundle bundle = new Bundle();
        bundle.putInt("ColorKey",itemPosition);
        MyPagerFragment fragment = new MyPagerFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pager_my, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int itemPositionColor=getArguments().getInt("ColorKey");
        if(itemPositionColor==0){
            view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
        else if(itemPositionColor==1){
            view.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else if(itemPositionColor==2){
            view.setBackgroundColor(getResources().getColor(R.color.blue));
        }
        else if(itemPositionColor==3){
            view.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }
}
