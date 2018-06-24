package ru.google.multiplyactivities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        int count = getIntent().getIntExtra("Count", 1);
        String message = "Вы посетили эту страницу " + String.valueOf(count)
                + " раз";

        // Toast.LENGTH_LONG

        String name = getIntent().getStringExtra("Name");
        TextView textView = findViewById(R.id.textView);
        if (name == null || name.length() <= 0) {
            textView.setText("Привет, Username!");
        } else {
            if (name.toLowerCase().contains("admin")) {
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                textView.setTextColor(Color.argb(
                        255, 255, 0, 255
                ));
                textView.setText("ADMIN: " + name);
            } else {
                textView.setText("Привет, " + name + "!");
            }

        }
    }
}
