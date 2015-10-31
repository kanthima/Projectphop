package com.example.phop.projectphop;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenubackallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubackall);
        ListView lv=(ListView)this.findViewById(R.id.lv_backall);

        String[] list={"Back Extensions","Barbell Deadlift","Barbell Row","Barbell Shrug","Close-Grip Pulldown","Dumbbell Row","Dumbbell Shrug","Pull ups","Wide-Grip_Lat_Pulldown"};
        Integer[] imgid={R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back};
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
