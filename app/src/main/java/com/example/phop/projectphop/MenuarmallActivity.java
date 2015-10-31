package com.example.phop.projectphop;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuarmallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuarmall);

        ListView lv=(ListView)this.findViewById(R.id.lv_armall);

        String[] list={"Barbell Curl","Concentration Curls","Dumbbell Bicep Curl","Ez-bar Preacher Curl","Lying Triceps Extensions","Overhead dumbbell extension","Seated Dumbbell Curls","Tricep Dips","Triceps pushdown"};
        Integer[] imgid={R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm,R.drawable.arm};
        CustomListAdapter adapter=new CustomListAdapter(this, list, imgid);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(MenuarmallActivity.this, null);
                        startActivity(intent);
                        break;
                }

            }
        });
    }

}
