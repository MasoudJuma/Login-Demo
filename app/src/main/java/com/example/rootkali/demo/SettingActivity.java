package com.example.rootkali.demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SettingActivity extends AppCompatActivity {
    Button show;
    CheckBox checkBox1,checkBox2,checkBox3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 =findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        show =  findViewById(R.id.button);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));

                } else if (checkBox1.isChecked() == true && checkBox3.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));

                } else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));

                } else if (checkBox1.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                } else if (checkBox2.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
                } else if (checkBox3.isChecked() == true)

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                } else

                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }

        });
    }
}
