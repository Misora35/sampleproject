package jp.ac.hitp.it2073502.sampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SCH = findViewById(R.id.SCH);
        SCH.setOnClickListener ((View v)-> {
            startActivity(new Intent(this, SCH.class));
        });

    }
}