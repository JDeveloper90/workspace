package com.example.jeon.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.edit_id)
    EditText edit_id;

    @Bind(R.id.edit_password)
    EditText edit_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


    }

    @OnClick({R.id.save_btn, R.id.modify_btn})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_btn:
                Toast.makeText(MainActivity.this, "저장완료", Toast.LENGTH_SHORT).show();
                break;
            case R.id.modify_btn:
                Toast.makeText(MainActivity.this, "수정완료", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
