package com.example.phop.projectphop;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenushoulderallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menushoulderall);
        ListView lv=(ListView)this.findViewById(R.id.lv_shoulderall);

        String[] list={"Barbell Shoulder Press","Dumbbell Front Raise","Dumbbell Lateral Raise","Dumbbell Shoulder Press","Military Press","Seated Bent-over Lateral Raises","Upright Rows"};
        Integer[] imgid={R.drawable.shoulder,R.drawable.shoulder,R.drawable.shoulder,R.drawable.shoulder,R.drawable.shoulder,R.drawable.shoulder,R.drawable.shoulder};
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
