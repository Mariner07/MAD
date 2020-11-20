package com.example.quiz_nurlan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Map<String, String > questions=new HashMap<String, String>();
    int questionNo=1;
    int NoofQuestions=4;
    TextView question;
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView outcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1=findViewById(R.id.Answer1);
        answer2=findViewById(R.id.Answer2);
        answer3=findViewById(R.id.Answer3);
        question=findViewById(R.id.question);
        outcome=findViewById(R.id.Outcome);

        questions.put("Question1", "Who is the first ever character who acknowledged Naruto as shinobi?");
        questions.put("Right1","Iruka");
        questions.put("WrongA1", "Kakashi");
        questions.put("WrongB1", "Jiraya");

        questions.put("Question2","What age did Naruto become Hokage?");
        questions.put("WrongA2", "27");
        questions.put("WrongB2", "30");
        questions.put("Right2", "31");

        questions.put("Question3", "Which character is referred as the most useless?");
        questions.put("Right3", "Sakura");
        questions.put("WrongA3", "Ino");
        questions.put("WrongB3","Kiba");

        questions.put("Question4", "Naruto's first kiss was with");
        questions.put("WrongA4", "Sakura");
        questions.put("Right4", "Sasuke");
        questions.put("WrongB4", "Hinata");

        question.setTextColor(Color.RED);
        question.setTextSize(25);
        answer1.setTextColor(Color.YELLOW);
        answer1.setTextSize(15);

        answer2.setTextColor(Color.YELLOW);
        question.setTextSize(15);

        answer3.setTextColor(Color.YELLOW);
        answer3.setTextSize(15);


        setQuestion();

    }

    void setQuestion() {
        question.setText(questions.get("Question"+questionNo));
        Random r= new Random();
        int RandomIntValue=r.nextInt(4);
        if(RandomIntValue==0){
            answer1.setText(questions.get("Right"+ questionNo));
            answer2.setText((questions.get("WrongA"+questionNo)));
            answer3.setText((questions.get("WrongB"+questionNo)));
            answer1.setTag("Correct!");
            answer2.setTag("Wrong");
            answer3.setTag("Wrong");
        }
        if(RandomIntValue==1){
            answer1.setText(questions.get("WrongA"+questionNo));
            answer2.setText(questions.get("WrongB"+questionNo));
            answer3.setText(questions.get("Right"+questionNo));
            answer1.setTag("Wrong");
            answer2.setTag("Wrong");
            answer3.setTag("Correct!");
        }
        if(RandomIntValue==2){
            answer1.setText(questions.get("Right"+questionNo));
            answer2.setText(questions.get("WrongA"+questionNo));
            answer3.setText(questions.get("WrongB"+questionNo));
            answer1.setTag("Correct!");
            answer2.setTag("Wrong");
            answer3.setTag("Wrong");
        }
        if(RandomIntValue==3){
            answer1.setText(questions.get("WrongA"+questionNo));
            answer2.setText(questions.get("Right"+questionNo));
            answer3.setText(questions.get("WrongB"+questionNo));
            answer1.setTag("Wrong");
            answer2.setTag("Correct!");
            answer3.setTag("Wrong");
        }
    }
    public void onAnswerClick(View v){
        if(v.getTag()=="Correct!"){
            questionNo++;
            if(questionNo>NoofQuestions){
                outcome.setTextColor(Color.GREEN);
                outcome.setText("You successfully finished the quiz!\nClick me to exit :)");
                //outcome.setVisibility(View.INVISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.INVISIBLE);
                answer3.setVisibility(View.INVISIBLE);
            }
            else{
                outcome.setTextColor(Color.GREEN);
                outcome.setText("Well done!");
                setQuestion();
            }

        }else{
            outcome.setTextColor(Color.RED);
            outcome.setText("You can play again :)");
            setQuestion();
        }
    }
    public void onClickFinish(View v){
        if(outcome.getText().toString().contains("successfully")==true){
            finish();
            System.exit(0);
        }
    }
}