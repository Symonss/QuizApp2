package com.example.symons.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int total=0; //for the total amount

    int q1points=0;


    public void submit (View view){
        quiz1();

        Toast.makeText(this,"You got " + total+ " questions correct",Toast.LENGTH_SHORT).show();
    }

    //Question1
    public void quiz1(){
        RadioGroup answers =  findViewById(R.id.ans1);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q1ans:
                 findViewById(R.id.q1ans);
                //calculate();
                q1points=1;
                break;
            default:
                 findViewById(R.id.q1ans);

        }
    }

    //Question2
    public void quiz2(){
        RadioGroup answers =  findViewById(R.id.ans1);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q1ans:
                findViewById(R.id.q1ans);
                //calculate();
                q1points=1;
                break;
            default:
                findViewById(R.id.q1ans);

        }
    }








    /*
    This method is for calculating the total amount of marks scored
    this method is called for every question.
     */
        public void calculate(){
       total=q1points;


    }


}
