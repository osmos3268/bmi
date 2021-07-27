package com.eric.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;   //顯示結果
    private EditText weight,height;  //使用者輸入的

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //將布局檔載入

        result = findViewById((R.id.result);
        weight = findViewById((R.id.userweight);
        height = findViewById((R.id.userheight);

    }

    public void bmiClick(View view){//要讓布局檔呼叫的方法，權限得是public
        float userweight= Float.parseInt(weight.getText().toString());
        float userheight= Float.parseInt(height.getText().toString());
        float bmi = userweight/((userheight/100)*(userheight/100));

        result.setText("結果: "+bmi);


    }

}
