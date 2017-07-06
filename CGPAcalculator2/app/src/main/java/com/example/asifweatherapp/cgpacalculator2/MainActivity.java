package com.example.asifweatherapp.cgpacalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText subject1_marksET,subject2_marksET,subject3_marksET,subject4_marksET,subject5_marksET,subject6_marksET,subject7_marksET,subject8_marksET,subject9_marksET;
    private EditText subject1_creditET,subject2_creditET,subject3_creditET,subject4_creditET,subject5_creditET,subject6_creditET,subject7_creditET,subject8_creditET,subject9_creditET;

    private double subject1_marks,subject2_marks,subject3_marks,subject4_marks,subject5_marks,subject6_marks,subject7_marks,subject8_marks,subject9_marks;
    private double subject1_credit,subject2_credit,subject3_credit,subject4_credit,subject5_credit,subject6_credit,subject7_credit,subject8_credit,subject9_credit;

    private Button show_resultButton;

    private double result;

    private TextView resultTV;

    private MarksModel marksModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        subject1_marksET= (EditText) findViewById(R.id.subject1_marksEditText);
        subject2_marksET= (EditText) findViewById(R.id.subject2_marksEditText);
        subject3_marksET= (EditText) findViewById(R.id.subject3_marksEditText);
        subject4_marksET= (EditText) findViewById(R.id.subject4_marksEditText);
        subject5_marksET= (EditText) findViewById(R.id.subject5_marksEditText);
        subject6_marksET= (EditText) findViewById(R.id.subject6_marksEditText);
        subject7_marksET= (EditText) findViewById(R.id.subject7_marksEditText);
        subject8_marksET= (EditText) findViewById(R.id.subject8_marksEditText);
        subject9_marksET= (EditText) findViewById(R.id.subject9_marksEditText);


        subject1_creditET= (EditText) findViewById(R.id.subject1_creditEditText);
        subject2_creditET= (EditText) findViewById(R.id.subject2_creditEditText);
        subject3_creditET= (EditText) findViewById(R.id.subject3_creditEditText);
        subject4_creditET= (EditText) findViewById(R.id.subject4_creditEditText);
        subject5_creditET= (EditText) findViewById(R.id.subject5_creditEditText);
        subject6_creditET= (EditText) findViewById(R.id.subject6_creditEditText);
        subject7_creditET= (EditText) findViewById(R.id.subject7_creditEditText);
        subject8_creditET= (EditText) findViewById(R.id.subject8_creditEditText);
        subject9_creditET= (EditText) findViewById(R.id.subject9_creditEditText);



        show_resultButton= (Button) findViewById(R.id.showResultButton);

        resultTV= (TextView) findViewById(R.id.ShowResultTextView);

    }

    public void showResult(View view) {

        subject1_marks=Double.parseDouble(subject1_marksET.getText().toString());
        subject2_marks=Double.parseDouble(subject2_marksET.getText().toString());
        subject3_marks=Double.parseDouble(subject3_marksET.getText().toString());
        subject4_marks=Double.parseDouble(subject4_marksET.getText().toString());
        subject5_marks=Double.parseDouble(subject5_marksET.getText().toString());
        subject6_marks=Double.parseDouble(subject6_marksET.getText().toString());
        subject7_marks=Double.parseDouble(subject7_marksET.getText().toString());
        subject8_marks=Double.parseDouble(subject8_marksET.getText().toString());
        subject9_marks=Double.parseDouble(subject9_marksET.getText().toString());


        subject1_credit=Double.parseDouble(subject1_creditET.getText().toString());
        subject2_credit=Double.parseDouble(subject2_creditET.getText().toString());
        subject3_credit=Double.parseDouble(subject3_creditET.getText().toString());
        subject4_credit=Double.parseDouble(subject4_creditET.getText().toString());
        subject5_credit=Double.parseDouble(subject5_creditET.getText().toString());
        subject6_credit=Double.parseDouble(subject6_creditET.getText().toString());
        subject7_credit=Double.parseDouble(subject7_creditET.getText().toString());
        subject8_credit=Double.parseDouble(subject8_creditET.getText().toString());
        subject9_credit=Double.parseDouble(subject9_creditET.getText().toString());


        marksModel=new MarksModel(subject1_marks,subject2_marks,subject3_marks,subject4_marks,subject5_marks,subject6_marks,subject7_marks,subject8_marks,subject9_marks,subject1_credit,subject2_credit,subject3_credit,subject4_credit,subject5_credit,subject6_credit,subject7_credit,subject8_credit,subject9_credit);

        double mark_grade1=marksModel.getMarkGrade(subject1_marks);
        double mark_grade2=marksModel.getMarkGrade(subject2_marks);
        double mark_grade3=marksModel.getMarkGrade(subject3_marks);
        double mark_grade4=marksModel.getMarkGrade(subject4_marks);
        double mark_grade5=marksModel.getMarkGrade(subject5_marks);
        double mark_grade6=marksModel.getMarkGrade(subject6_marks);
        double mark_grade7=marksModel.getMarkGrade(subject7_marks);
        double mark_grade8=marksModel.getMarkGrade(subject8_marks);
        double mark_grade9=marksModel.getMarkGrade(subject9_marks);


        result=marksModel.getResult(mark_grade1,mark_grade2,mark_grade3,mark_grade4,mark_grade5,
                mark_grade6,mark_grade7,mark_grade8,mark_grade9,
                subject1_credit,subject2_credit,subject3_credit,subject4_credit,subject5_credit,
                subject6_credit,subject7_credit,subject8_credit,subject9_credit);

        //result=mark_grade1+mark_grade2;
//        result=subject1_marks+subject2_marks;
       resultTV.setText(Double.toString(result));

    }
}
