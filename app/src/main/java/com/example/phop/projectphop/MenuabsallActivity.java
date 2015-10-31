package com.example.phop.projectphop;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuabsallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuabsall);

        ListView lv=(ListView)this.findViewById(R.id.lv_absall);

        String[] list={"Bicycles  Elbow-to-Knee Crunches","Crunches","Double Crunch","Dumbbell Pullover","Dumbbell Side Bend","Lying Leg Raise","Reverse Crunch","Sit-Up","Twisting Sit-Up"};
        Integer[] imgid={R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs,R.drawable.abs};
        CustomListAdapter adapter=new CustomListAdapter(this, list, imgid);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        break;
                }

            }
        });
    }

}
