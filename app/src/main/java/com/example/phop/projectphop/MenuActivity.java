package com.example.phop.projectphop;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void clickmenubody(View view) {

        Intent objintent = new Intent(MenuActivity.this, MenuBodyActivity.class);
        startActivity(objintent);
    }

    public void clickcouse(View view) {
        switch (view.getId()) {
            case R.id.btn_Course:
                openNewGameDialog();
                break;
        }
    }

    public void clickBMI(View view) {
        Intent objintent = new Intent(MenuActivity.this, BMIActivity.class);
        startActivity(objintent);
    }

    private void openNewGameDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(R.string.newcourse);

        dialog.setItems(R.array.difficulty,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        startcourse(i);
                    }
                });
        dialog.show();
    }

    private void startcourse(int i) {
        switch (i) {
            case 0:
                Intent intent = new Intent(MenuActivity.this, MenuEasyActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(MenuActivity.this, MenuMidActivity.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(MenuActivity.this, MenuHardActivity.class);
                startActivity(intent2);
                break;
        }
    }
}

