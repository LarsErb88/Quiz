package com.example.android.quiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quiz.R;

import java.text.NumberFormat;


/**
 * This app displays the number of correct answers of the Quiz.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * This method is called when the evaluation button is clicked.
     */

    public void evaluation(View view) {
        int correctAnswers = 0;

        EditText InputName = (EditText) findViewById(R.id.name_input);
        String Name = InputName.getText().toString();

        CheckBox rightStarsBox = findViewById(R.id.rightStars);
        CheckBox rightStripesBox = findViewById(R.id.rightStripes);
        CheckBox wrongStarsBox = findViewById(R.id.wrongStars);
        CheckBox wrongStripesBox = findViewById(R.id.wrongStripes);

        if (rightStarsBox.isChecked() == true & rightStripesBox.isChecked() == true & wrongStarsBox.isChecked() == false & wrongStripesBox.isChecked() == false) {
            correctAnswers += 1;
        }

        RadioButton NYBox = findViewById(R.id.NY);
        boolean YesNY = NYBox.isChecked();
        if (YesNY) {
            correctAnswers += 1;
        }

        RadioButton NeilABox = findViewById(R.id.NeilA);
        boolean YesNeilA = NeilABox.isChecked();
        if (YesNeilA) {
            correctAnswers += 1;
        }

        RadioButton DeathBox = findViewById(R.id.Death);
        boolean YesDeath = DeathBox.isChecked();
        if (YesDeath) {
            correctAnswers += 1;
        }

        RadioButton AustraliaBox = findViewById(R.id.Australia);
        boolean YesAustralia = AustraliaBox.isChecked();
        if (YesAustralia) {
            correctAnswers += 1;
        }

        EditText AnswerF = findViewById(R.id.answerF);
        String Converter = AnswerF.getText().toString();
        int IntAnswerF = Integer.parseInt(Converter);
        if (IntAnswerF == 50) {
            correctAnswers += 1;
        }

        if (correctAnswers == 6) {
            Toast.makeText(this, Name + ": GREAT WORK! All questions (6/6) were answered correctly", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, Name + ": you answered " + correctAnswers + "/6 questions correctly!", Toast.LENGTH_SHORT).show();
        }
    }
}





