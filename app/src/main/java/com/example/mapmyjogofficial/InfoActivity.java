package com.example.mapmyjogofficial;

import android.icu.text.IDNA;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import com.example.mapmyjogofficial.databinding.ActivityMainBinding;

public class InfoActivity extends AppCompatActivity {
    private InfoActivity binding;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button = (Button) findViewById(R.id.button_info_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InfoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}