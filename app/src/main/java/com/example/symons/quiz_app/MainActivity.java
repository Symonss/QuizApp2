package com.example.symons.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int q3points = 0;
    private int q4points = 0;
    private int q6points = 0;
    int q5points = 0;
    int total = 0; //for the total amount
    int nothing = 0;
    int q1points = 0;
    int q2points = 0;
    private int q7points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Question1
    public void quiz1() {
        RadioGroup answers = findViewById(R.id.ans1);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q1ans:
                findViewById(R.id.q1ans);
                q1points = 1;
                break;
            default:
                findViewById(R.id.q1ans);

        }
    }

    //Question2
    public void quiz2() {
        EditText q2ans = findViewById(R.id.txtq2);
        String ans2 = q2ans.getText().toString();
        if (ans2.equalsIgnoreCase("Block Chain")) {
            q2points = 1;
        } else {
            q2points = nothing;
        }
    }

    //Question 3
    public void quiz3() {
        CheckBox GorBox = findViewById(R.id.q3ans1);
        boolean answer = GorBox.isChecked();

        if (answer) {
            q3points = 1;
        }

        CheckBox AfcBox = findViewById(R.id.q3ans2);
        boolean hasIntegrity = AfcBox.isChecked();

        if (hasIntegrity) {
            q3points = 1;
        }
    }

    //Question4
    public void quiz4() {
        RadioGroup answers = findViewById(R.id.ans4);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q4ans:
                findViewById(R.id.q4ans);
                //calculate();
                q4points = 1;
                break;
            default:
                findViewById(R.id.q4ans);

        }
    }

    //Question 5
    public void quiz5() {
        CheckBox Box5 = findViewById(R.id.q5ans1);
        boolean answer = Box5.isChecked();

        if (answer) {
            q5points = 1;
        }

        CheckBox Box5b = findViewById(R.id.q5ans2);
        boolean hasIntegrity = Box5b.isChecked();

        if (hasIntegrity) {
            q5points = 1;
        }
    }

    //Question6
    public void quiz6() {
        RadioGroup answers = findViewById(R.id.ans6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q6ans:
                findViewById(R.id.q6ans);
                q6points = 1;
                break;
            default:
                findViewById(R.id.q6ans);

        }
    }

    //Question7
    public void quiz7() {
        RadioGroup answers = findViewById(R.id.ans7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q7ans:
                findViewById(R.id.q7ans);
                q7points = 1;
                break;
            default:
                findViewById(R.id.q7ans);

        }
    }

    /*
    this method is called when submit button is clicked
    its calls methods for each questions
    finally it adds all the points and tells you how much you got

     */
    public void submit(View view) {
        quiz1();
        quiz2();
        quiz3();
        quiz4();
        quiz5();
        quiz6();
        quiz7();
        total = (q1points + q2points + q3points + q4points + q5points + q6points + q7points);
        Toast.makeText(this, "You got " + total + "of 7 questions correct", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, AboutActivity.class);

        startActivity(i);
    }

}
