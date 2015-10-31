package com.example.phop.projectphop;


import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BMIActivity extends AppCompatActivity {

    private MemberTABLE objMemberTABLE;
    private LineGraphSeries<DataPoint>series;
    private TextView txtshowBMI;
    private double doubmis;
    private double[] data;
    private double objdata;
    private int intId,i;

    public BMIActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        txtshowBMI= (TextView) findViewById(R.id.txt_bmi);

        GraphView graph=(GraphView)findViewById(R.id.graph);
        objMemberTABLE = new MemberTABLE(this);


        data= new double[]{objdata};
        //setcurrentbmi();
        intId=objMemberTABLE.CurrentIdBmi();

        //Intent intent= getIntent();
        //String MemID = intent.getStringExtra("");
        //ShowData(MemID);

           // doubmiall = objMemberTABLE.currentBmiall();
          //  Log.d("GetData", "allbmi=" + String.valueOf(+ doubmiall));
       //}
        for (i=1;i<=intId;i++) {
            objdata=objMemberTABLE.currentBmiall();
           // data = objMemberTABLE.currentBmiall();


        //}

            /*LineGraphSeries<DataPoint>series=new LineGraphSeries<DataPoint>(new DataPoint[]
                    {
                            new DataPoint(i,data[i])

                    });
            graph.addSeries(series);
            series.setColor(Color.GREEN);*/
           PointsGraphSeries<DataPoint>series1 = new PointsGraphSeries<DataPoint>(new DataPoint[]
                    {
                    new DataPoint(i,data[i])
                    });
            graph.addSeries(series1);
            series1.setSize(12);
            series1.setColor(Color.GREEN);
            series1.setShape(PointsGraphSeries.Shape.POINT);

        }




   }


    /*public void ShowData(String MemID)
    {
        GraphView graph=(GraphView)findViewById(R.id.graph);
        Double arrData[]=objMemberTABLE.currentBmiall();
        if(arrData != null){
            for (i=1;i<=intId;i++){
                PointsGraphSeries<DataPoint>series1=new PointsGraphSeries<DataPoint>(new DataPoint[]{
                        new DataPoint(i,arrData[0])
                });
                graph.addSeries(series1);
                series1.setSize(12);
                series1.setColor(Color.GREEN);
                series1.setShape(PointsGraphSeries.Shape.POINT);
        }
        }

    }*/

    private void setcurrentbmi() {
        doubmis=objMemberTABLE.currentBmi();
        txtshowBMI.setText(Double.toString(doubmis));
    }

}
