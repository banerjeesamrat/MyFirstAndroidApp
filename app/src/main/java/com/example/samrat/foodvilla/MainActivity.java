package com.example.samrat.foodvilla;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String food[] = new String[5];
    int top = -1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void push(View view) {


        if (top == food.length - 1) {

            Toast.makeText(this, "Stop already", Toast.LENGTH_LONG).show();
        } else {
            EditText editText;
            editText = findViewById(R.id.editText);
            String foodItem = editText.getText().toString();
            ++top;
            food[top] = foodItem;
            //food[top]=editText.getText().toString();
            Toast.makeText(this, foodItem + " has been added", Toast.LENGTH_LONG).show();
        }

    }

    public void pop(View view) {
        if (top == -1) {

            Toast.makeText(this, "Nothing to eat!", Toast.LENGTH_LONG).show();
        } else {

            String poppedFoodItem = food[top];
            textView = findViewById(R.id.textView3);
            textView.setText("You just ate " + poppedFoodItem);
        }
    }
}

//res->values->strings.xml(To change the nsme of the project)
