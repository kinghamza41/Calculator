package com.example.hamza.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button btn;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button1);
        txtv=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int sum=num1+num2;
        txtv.setText(Integer.toString(sum));
    }
    public void sub(View v){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button1);
        txtv=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int sub=num1-num2;
        txtv.setText(Integer.toString(sub));
    }
    public void mul(View v){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button1);
        txtv=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int mul=num1*num2;
        txtv.setText(Integer.toString(mul));
    }
    public void div(View v){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button1);
        txtv=(TextView)findViewById(R.id.textView2);
        float num1=Float.valueOf(e1.getText().toString());
        float num2=Float.valueOf(e2.getText().toString());
        float div=num1/num2;
        txtv.setText(Float.toString(div));
    }
}
