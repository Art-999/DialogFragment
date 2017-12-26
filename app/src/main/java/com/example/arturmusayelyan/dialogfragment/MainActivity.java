package com.example.arturmusayelyan.dialogfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.rd.PageIndicatorView;

public class MainActivity extends AppCompatActivity implements Comunicator {
    private FragmentManager manager;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        pager=findViewById(R.id.view_pager);
        pager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        PageIndicatorView pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(pager);
    }

    public void showDialog(View view) {
        MyDialogFragment dialogFragment = MyDialogFragment.newInstance();
        dialogFragment.show(manager, "MyDialogFragment");
    }

    @Override
    public void onDialogMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
