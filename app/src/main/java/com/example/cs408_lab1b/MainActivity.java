package com.example.cs408_lab1b;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cs408_lab1b.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    Button button = findViewById(R.id.getHelp);

    Resources res = getResources();
    private String[] plotLines = res.getStringArray(R.array.plotLines);
    Random r = new Random();
    int randomLine = r.nextInt(plotLines.length);





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.getHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView  t = (TextView)view.getRootView().findViewById(R.id.output);
                t.setText(randomLine);

            }
        });






    }
}