package com.example.phop.projectphop;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuchestallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuchestall);
        ListView lv=(ListView)this.findViewById(R.id.lv_chestall);

        String[] list={"Barbell Bench Press","Chest Dip","Decline Dumbbell Bench Press","Decline Dumbbell Fly","Decline Press","Dumbbell Bench Press","Dumbbell Fly","Incline Barbell Bench Press","Incline Dumbbell Fly","Incline Dumbbell Press"};
        Integer[] imgid={R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest,R.drawable.chest};
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
