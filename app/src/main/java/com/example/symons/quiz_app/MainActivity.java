package com.example.symons.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int q3points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int total = 0; //for the total amount
    int nothing = 0;
    int q1points = 0;
    int q2points = 0;


    //Question1
    public void quiz1() {
        RadioGroup answers = findViewById(R.id.ans1);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.q1ans:
                findViewById(R.id.q1ans);
                //calculate();
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

    public void submit(View view) {
        quiz1();
        quiz2();
        quiz3();
        total = (q1points + q2points + q3points);
        Toast.makeText(this, "You got " + total + " questions correct", Toast.LENGTH_SHORT).show();
    }

}
