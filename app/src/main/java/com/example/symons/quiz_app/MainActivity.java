package com.example.symons.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int total = 0; //for the total amount

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
        }
    }


    public void submit(View view) {
        quiz1();
        quiz2();
        total=(q1points + q2points);
        Toast.makeText(this, "You got " +total + " questions correct", Toast.LENGTH_SHORT).show();
    }

}
