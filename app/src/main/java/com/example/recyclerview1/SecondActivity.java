package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description;
    String str1, str2;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("img") && getIntent().hasExtra("str1") && getIntent().hasExtra("str2")) {
            str1 = getIntent().getStringExtra("str1");
            str2 = getIntent().getStringExtra("str2");
            img = getIntent().getIntExtra("img", 1);
        }
        else {
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title.setText(str1);
        description.setText(str2);
        mainImageView.setImageResource(img);
    }
}
