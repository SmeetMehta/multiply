package com.example.smeet.multiplicationtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = (ListView)findViewById(R.id.list);
        SeekBar seek=(SeekBar)findViewById(R.id.seek);
        final ArrayList<Integer> mul=new ArrayList<Integer>();
        final ArrayAdapter<Integer> array=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,mul);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                      mul.clear();
                    x=seekBar.getProgress();
                     Log.i("Progress","x"+x);
                int j,y;
                for(j=1;j<11;j++)
                {
                    y=j*(x+1);
                    mul.add(y);
                }

                list.setAdapter(array);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
