package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvFilter,tvDalgona,tvEspresso,tvResult;
    Button btnFilterPlus,btnFilterMinus,btnDalgonaPlus,btnDalgonaMinus,btnEspressoPlus,btnEspressoMinus;
    Button btnOrder;

    int sum1=0;
    int sum2=0;
    int sum3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvFilter=findViewById(R.id.tvFilter);
        tvDalgona=findViewById(R.id.tvDalgona);
        tvEspresso=findViewById(R.id.tvEspresso);
        btnFilterPlus=findViewById(R.id.btnFilterPlus);
        btnFilterMinus=findViewById(R.id.btnFilterMinus);
        btnDalgonaPlus=findViewById(R.id.btnDalgonaPlus);
        btnDalgonaMinus=findViewById(R.id.btnDalgonaMinus);
        btnEspressoPlus=findViewById(R.id.btnEspressoPlus);
        btnEspressoMinus=findViewById(R.id.btnEspressoMinus);

        btnOrder=findViewById(R.id.btnOrder);
        tvResult=findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);


        btnFilterPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum1=sum1+1;
                tvFilter.setText("Total Filter Coffee's = "+sum1);
            }
        });
        btnFilterMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum1=sum1-1;
                tvFilter.setText("Total Filter Coffee's = "+sum1);
            }
        });

        btnDalgonaPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum2=sum2+1;
                tvDalgona.setText("Total Dalgona Coffee's = "+sum2);
            }
        });
        btnDalgonaMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum2=sum2-1;
                tvDalgona.setText("Total Dalgona Coffee's = "+sum2);
            }
        });

        btnEspressoPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum3=sum3+1;
                tvEspresso.setText("Total Espresso Coffee's = "+sum3);
            }
        });
        btnEspressoMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum3=sum3-1;
                tvEspresso.setText("Total Espresso Coffee's = "+sum3);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnOrder.setVisibility(View.GONE);
                int sum=(sum1+sum2+sum3)*30;
                tvResult.setText("Total Bill = "+ sum + " Rs.");
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}