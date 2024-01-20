package com.example.practical15_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    // Variables
    int costOfPizza = 200;
    int costOfCoffee = 50;
    int costOfBurger = 120;
    int totalCost = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind XML Component References
        CheckBox checkBox1 = findViewById(R.id.pizzaCheckBox);
        CheckBox checkBox2 = findViewById(R.id.coffeeCheckBox);
        CheckBox checkBox3 = findViewById(R.id.burgerCheckBox);
        Button button = findViewById(R.id.orderBtn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                StringBuilder resultString = new
                        StringBuilder("Selected Items : \n");
                if (checkBox1.isChecked())
                {
                    resultString.append(checkBox1.getText()).append(" ").append(costOfPizza).append(" Rs\n");
                    totalCost += costOfPizza;
                }
                if (checkBox2.isChecked())
                {
                    resultString.append(checkBox2.getText()).append(" ").append(costOfCoffee).append(" Rs\n");
                    totalCost += costOfCoffee;
                }
                if (checkBox3.isChecked())
                {
                    resultString.append(checkBox3.getText()).append(" ").append(costOfBurger).append(" Rs\n");
                    totalCost += costOfBurger;
                }
                resultString.append("Total = ").append(totalCost).append("Rs");
                Toast.makeText(MainActivity.this, resultString,
                        Toast.LENGTH_SHORT).show();
                // Reset Total
                totalCost = 0;
            }
        });
    }
}