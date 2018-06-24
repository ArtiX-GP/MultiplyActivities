package ru.google.multiplyactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Кол-во посещений активности "О программе".
    private int count;

    // Поле ввода (EditText).
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        count++;
        Intent intent = new Intent(
                MainActivity.this, AboutActivity.class);
        // intent.putExtra("Ключ", "Значение");
        intent.putExtra("Count", count);
        intent.putExtra("Name", editText.getText().toString());
        startActivity(intent);
    }

}
