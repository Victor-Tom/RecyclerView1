package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.apple, R.drawable.orange,R.drawable.banana,R.drawable.milk,R.drawable.yogurt,
                    R.drawable.cheese,R.drawable.chicken,R.drawable.steak,R.drawable.porkchop,R.drawable.carrots};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.food);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myadapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
