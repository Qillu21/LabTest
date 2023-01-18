package com.example.mindshapener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView number1, number2, operation;
    Button button;
    TextInputEditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (TextView) findViewById(R.id.firstNumber);
        number2 = (TextView) findViewById(R.id.secondNumber);
        operation = (TextView) findViewById(R.id.operation);
        button = findViewById(R.id.button);
        result = (TextInputEditText) findViewById(R.id.enterResult);
    }

    public void clickEasy(View view){
        Toast.makeText(this, "Easy Mode", Toast.LENGTH_SHORT).show();
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        int randomNumber2 = random.nextInt(9);

        number1.setText(String.valueOf(randomNumber));
        number2.setText(String.valueOf(randomNumber2));

        int randomOp = random.nextInt(4);

        if(randomOp == 0){
            operation.setText("+");
        }else if(randomOp == 1){
            operation.setText("-");
        }else if(randomOp == 2){
            operation.setText("*");
        }else if(randomOp == 3){
            operation.setText("/");
        }
    }
    public void clickMedium(View view){
        Toast.makeText(this, "Medium Mode", Toast.LENGTH_SHORT).show();

        Random random = new Random();
        int randomNumber = random.nextInt(99);
        int randomNumber2 = random.nextInt(99);

        number1.setText(String.valueOf(randomNumber));
        number2.setText(String.valueOf(randomNumber2));

        int randomOp = random.nextInt(4);

        if(randomOp == 0){
            operation.setText("+");
        }else if(randomOp == 1){
            operation.setText("-");
        }else if(randomOp == 2){
            operation.setText("*");
        }else if(randomOp == 3){
            operation.setText("/");
        }
    }
    public void clickHard(View view){
        Toast.makeText(this, "Hard Mode", Toast.LENGTH_SHORT).show();

        Random random = new Random();
        int randomNumber = random.nextInt(999);
        int randomNumber2 = random.nextInt(999);

        number1.setText(String.valueOf(randomNumber));
        number2.setText(String.valueOf(randomNumber2));

        int randomOp = random.nextInt(4);

        if(randomOp == 0){
            operation.setText("+");
        }else if(randomOp == 1){
            operation.setText("-");
        }else if(randomOp == 2){
            operation.setText("*");
        }else if(randomOp == 3){
            operation.setText("/");
        }
    }
    public void clickButt(View view){

    }
}