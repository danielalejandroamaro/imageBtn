package com.example.proyectoswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton card_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_button = findViewById(R.id.card_button);
    }

    public void revert_cart(View v) {
        int random_value = 1 + (int) (Math.random() * 3);
//        Toast.makeText(this, "el numero es: " + random_value, Toast.LENGTH_SHORT).show();

        switch (random_value) {
            case 1:
                card_button.setImageResource(R.drawable.carta_a_corazon);
                break;
            case 2:
                card_button.setImageResource(R.drawable.carta_j_hoja);
                break;
            default:
                card_button.setImageResource(R.drawable.carta_back);
                break;
        }
    }
}