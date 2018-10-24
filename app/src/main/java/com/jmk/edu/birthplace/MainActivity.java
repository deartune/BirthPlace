package com.jmk.edu.birthplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView02);
    }
    public  void onclick(View view){
        int id = view.getId();
        String text = ((Button)view).getText().toString();
        text = "내가 태어난곳은 " +text+ " 입니다";
        textView.setText(text);



    }
}

