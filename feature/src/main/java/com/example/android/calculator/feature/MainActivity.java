package com.example.android.calculator.feature;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t1 = null, t2 = null;
    boolean ADD, SUB, MULT, DIV;
    Double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.txt1);
        t2 = (TextView) findViewById(R.id.txt2);
    }

    public void b1(View view) {
        t1.setText(t1.getText() + "1");
    }

    public void b2(View view) {
        t1.setText(t1.getText() + "2");
    }

    public void b3(View view) {
        t1.setText(t1.getText() + "3");
    }

    public void b4(View view) {
        t1.setText(t1.getText() + "4");
    }

    public void b5(View view) {
        t1.setText(t1.getText() + "5");
    }

    public void b6(View view) {
        t1.setText(t1.getText() + "6");
    }

    public void b7(View view) {
        t1.setText(t1.getText() + "7");
    }

    public void b8(View view) {
        t1.setText(t1.getText() + "8");
    }

    public void b9(View view) {
        t1.setText(t1.getText() + "9");
    }

    public void b0(View view) {
        t1.setText(t1.getText() + "0");
    }

    public void reset(View view) {
        t1.setHint("Enter 1st number");
        Toast.makeText(this,"Values cleared",Toast.LENGTH_SHORT).show();
        t1.setText(null);
        t2.setText(null);
    }

    public void sumOfNum(View view) {
        if(t1.getText()=="") {
        Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }
            else{
            a = Double.parseDouble(t1.getText() + "");
            t1.setHint("Enter 2nd number");
            ADD = true;
            t1.setText(null);
        }
    }

    public void subOfNum(View view) {
        if(t1.getText()=="") {
            Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }
        else {
            a = Double.parseDouble(t1.getText() + "");
            t1.setHint("Enter 2nd number");
            SUB = true;
            t1.setText(null);
        }
    }

    public void multOfNum(View view) {
        if(t1.getText()=="") {
            Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }
        else{
        a = Double.parseDouble(t1.getText() + "");
        t1.setHint("Enter 2nd number");
        MULT = true;
        t1.setText(null);
    }}

    public void divOfNum(View view) {
        if(t1.getText()=="") {
            Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }else{
        a = Double.parseDouble(t1.getText() + "");
        t1.setHint("Enter 2nd number");
        DIV = true;
        t1.setText(null);
    }}

    /*
            String txt1=a.getText().toString();
            String txt2=b.getText().toString();
            int aa=Integer.parseInt(txt1);
            int bb=Integer.parseInt(txt2);
            int c=aa+bb;
            String Result=String.valueOf(c);

     */
    public void beq(View view) {
        if(t1.getText()=="") {
            Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }
        else{
        b = Double.parseDouble(t1.getText() + "");
        if (ADD == true) {
            t1.setText(a.toString() + "+" + b.toString());
            t2.setText(a + b + "");
            ADD = false;
        }
        if (SUB == true) {
            t1.setText(a.toString() + "-" + b.toString());
            t2.setText(a - b + "");
            SUB = false;
        }
        if (MULT == true) {
            t1.setText(a.toString() + "*" + b.toString());
            t2.setText(a * b + "");
            MULT = false;
        }
        if (DIV == true) {
            t1.setText(a.toString() + "/" + b.toString());
            t2.setText(a / b + "");
            DIV = false;
        }
        t1.setHint("Enter 1st number");
    }}
}

  /*  @Override
        startActivityForResult(intent.REQUEST_IMAGE_CAPTURE);


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK);

        Bundle extras=data.getExtras();
        Bitmap photo =(Bitmap)extras.get("data");

    }
}*/
   /* public void sumOfNum(View view) {
        v1= Double.parseDouble(t1.getText());
        v2=Double.parseDouble(t1)
        int c = v1 +v2;
        String Result = String.valueOf(c);
        t2.setText(Result);
    }
    public void subOfNum(View view) {
        v1= Double.parseDouble(t1.getText());
        v2=Double.parseDouble(t1.getText());
        int c = v1-v2;
        t2.setText(c);
    }

    public void multOfNum(View view) {
        v1= Double.parseDouble(t1.getText());
        v2=Double.parseDouble(t1.getText());
        int c = v1*v2;
        t2.setText(c);
    }

    public void divOfNum(View view) {
        v1= Double.parseDouble(t1.getText());
        v2=Double.parseDouble(t1.getText());
        int c = v1/v2;
        t2.setText(c);
    }
}*/

 /*public void sumOfNum(View view){
    v1=Double.parseDouble(t1.getText() + " ");
     add=true;
    }
    public void subOfNum(View view){
        v1=Double.parseDouble(t1.getText() + " ");
        add=true;
    }
    public void multOfNum(View view){
        v1=Double.parseDouble(t1.getText() + " ");
        add=true;
    }
    public void divOfNum(View view){
        v1=Double.parseDouble(t1.getText() + " ");
        add=true;
    }

}*/

/*    public void sumOfNum(View view) {

    a.setText(a.getText() + 1;);
    v1=Double.parseDouble(t1.getText() + " ");
    add=true;
    t1.setText(null);*/

   /*     private void startActivities(Intent intent)
        {

        }
    }

    Second Activity
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String Result= intent.getStringExtra(EXTRA_MESSAGE);
        TextView tv1=(TextView)findViewById(R.id.tv) ;
        tv1.setText("Sum of Number is = " +Result);
    }
    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}*/