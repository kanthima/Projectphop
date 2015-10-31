package com.example.phop.projectphop;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class easy1RmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy1_rm);

        final EditText editweight = (EditText) findViewById(R.id.etxt_weieasy1rm);
        final EditText editrep = (EditText) findViewById(R.id.etxt_repeasy1rm);
        final TextView txteasy = (TextView) findViewById(R.id.txt_easy1Rm);
        Button btn = (Button) findViewById(R.id.btn_caleasy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float weight = Float.valueOf(editweight.getText().toString());
                int rap = Integer.valueOf(editrep.getText().toString());
                int sum;
                if (rap <= 10 && rap >= 1) {
                    switch (rap) {
                        case 1:
                            float total = (weight * 100) / 100;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 2:
                            total = (weight * 100) / 95;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 3:
                            total = (weight * 100) / 93;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 4:
                            total = (weight * 100) / 90;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 5:
                            total = (weight * 100) / 87;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 6:
                            total = (weight * 100) / 85;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 7:
                            total = (weight * 100) / 83;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 8:
                            total = (weight * 100) / 80;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 9:
                            total = (weight * 100) / 77;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;
                        case 10:
                            total = (weight * 100) / 75;
                            sum = (int) total;
                            txteasy.setText(String.valueOf(sum));
                            break;

                    }
                } else {
                    txteasy.setText("0");
                    switch (v.getId()) {
                        case R.id.btn_caleasy:
                            opendialog();
                            break;
                    }

                }


            }
        });
        Button btn1 = (Button) findViewById(R.id.btn_Begineasy);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(easy1RmActivity.this, BarbellCurl_couActivity.class);
                startActivity(intent);
            }
        });

    }

    private void opendialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(easy1RmActivity.this);
        builder.setMessage("กรุณากรอกหมายเลย 1 ถึง 10");
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}