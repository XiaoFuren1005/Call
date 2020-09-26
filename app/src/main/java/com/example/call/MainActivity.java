package com.example.call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) this.findViewById(R.id.bt1);

        btn.setOnClickListener((View.OnClickListener) this);

        editText = (EditText) findViewById(R.id.edit);
    }
    public void onClick(View v){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + editText.getText()));
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"实现点击第三个按钮", Toast.LENGTH_LONG);
    }
}