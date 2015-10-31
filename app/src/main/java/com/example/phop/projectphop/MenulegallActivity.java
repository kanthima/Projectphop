package com.example.phop.projectphop;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenulegallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulegall);
        ListView lv=(ListView)this.findViewById(R.id.lv_legall);

        String[] list={"Barbell Lunge","Barbell Squat","Dumbbell Squat","Leg Curl","Leg Extension","Standing Calf Raises","Stiff-Leg Deadlift"};
        Integer[] imgid={R.drawable.leg,R.drawable.leg,R.drawable.leg,R.drawable.leg,R.drawable.leg,R.drawable.leg,R.drawable.leg};
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
