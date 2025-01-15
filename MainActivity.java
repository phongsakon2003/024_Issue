package com.example.appif;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity { // ประกาศตัวแปร
    Button btnok;
    TextView txtv;
    EditText etxtnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });// หาตำแหน่งและกำหนดค่าให้กับ UI elements
        txtv = findViewById(R.id.txtv);// TextView ที่ใช้แสดงผล
        etxtnum = findViewById(R.id.etxtnum1);// EditText ที่ใช้รับข้อมูลหมายเลข
    }
    public void btnOK_onClick(View view){ // เมธอดสำหรับการคลิกปุ่ม
        if (etxtnum.getText().toString().equals("1")){// ใช้คำสั่ง if-else เพื่อแปลหมายเลขเป็นเลขไทย
            txtv.setText("หนึ่ง");
        }else if (etxtnum.getText().toString().equals("2")){
            txtv.setText("สอง");
        }else if (etxtnum.getText().toString().equals("3")){
            txtv.setText("สาม");
        }else if (etxtnum.getText().toString().equals("4")){
            txtv.setText("สี่");
        }else if (etxtnum.getText().toString().equals("5")){
            txtv.setText("ห้า");
        }else if (etxtnum.getText().toString().equals("6")){
            txtv.setText("หก");
        }else if (etxtnum.getText().toString().equals("7")){
            txtv.setText("เจ็ด");
        }else if (etxtnum.getText().toString().equals("8")){
            txtv.setText("แปด");
        }else if (etxtnum.getText().toString().equals("9")){
            txtv.setText("เก้า");
        }else if (etxtnum.getText().toString().equals("100")){
            txtv.setText("หนึ่งร้อย");
        }
    }
}
