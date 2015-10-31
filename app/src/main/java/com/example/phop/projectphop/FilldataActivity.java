package com.example.phop.projectphop;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FilldataActivity extends AppCompatActivity {
    public Integer sexnumber;
    private Double calbmis;
    private EditText edtName,edtWeight,edtHeight;
    private String strName,strWeight,strHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filldata);

        bindWidget();

    }

    private void bindWidget() {
        edtName=(EditText)findViewById(R.id.edt_name);
        edtWeight=(EditText)findViewById(R.id.edt_weight);
        edtHeight=(EditText)findViewById(R.id.edt_height);
        //sexnumber.toString();
        //calBMI();
    }

    public void clicksave(View view){
        strName=edtName.getText().toString().trim();
        if (strName.equals("")) {
            showAlert();
        }

        strWeight=edtWeight.getText().toString().trim();
        if (strWeight.equals("")) {
            showAlert();
        }
        strHeight=edtHeight.getText().toString().trim();
        if (strHeight.equals("")) {
            showAlert();
        }

        showLog();
        confirmData();

    }

    private void showLog() {
        Log.d("member", "name= " + strName);
        Log.d("member", "sex= " + sexnumber);
        Log.d("member", "weight= " + strWeight);
        Log.d("member", "height= " + strHeight);
        Log.d("member", "resultbmi= " + calBMI());

    }

    private void confirmData() {
        AlertDialog.Builder objAlert = new AlertDialog.Builder(this);
        objAlert.setTitle("Are you Sure ?");
        objAlert.setCancelable(false);
        objAlert.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        objAlert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                upDatatoSqlite();
                Intent objintent = new Intent(FilldataActivity.this, MenuActivity.class);
                startActivity(objintent);
            }
        });
        objAlert.show();
    }

    private void upDatatoSqlite() {
        MemberTABLE objMemberTABLE=new MemberTABLE(this);
        long inSertData=objMemberTABLE.addNewValueToSQLite(strName, sexnumber,Double.parseDouble(strWeight),Double.parseDouble(strHeight),calBMI());
        edtName.setText("");
        edtWeight.setText("");
        edtHeight.setText("");
        Toast.makeText(FilldataActivity.this, "Add Data Finish", Toast.LENGTH_SHORT).show();
    }

    private void showAlert() {
        AlertDialog.Builder objAlert=new AlertDialog.Builder(this);
        objAlert.setTitle("ข้อมูลไม่ครบ");
        objAlert.setMessage("กรุณากรอกข้อมูลด้วย");
        objAlert.setCancelable(false);
        objAlert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        objAlert.show();
        
    }

   public double calBMI(){

        double wei=Double.valueOf(edtWeight.getText().toString());
        double hei=Double.valueOf(edtHeight.getText().toString());
        double hei2=hei/100;
        double hei3=Math.pow(hei2, 2);
        calbmis=wei/hei3;
        NumberFormat formatter = new DecimalFormat("#0.00");
       return Double.parseDouble(formatter.format(calbmis));
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male:
                if (checked) {
                    sexnumber=1;
                }
                else{
                    sexnumber=null;

            }
                    break;
            case R.id.radio_female:
                if (checked) {
                    sexnumber=2;

                }
                else{
                    sexnumber=null;

                }
                    break;
        }

    }

}
