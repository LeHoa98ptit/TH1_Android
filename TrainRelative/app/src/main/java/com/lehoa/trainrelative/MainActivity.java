package com.lehoa.trainrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView txtKetQua;
    EditText editA, editB;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        Process();
        statusScreen();
    }


    private void Process(){
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();
                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so vao de thuc hien tinh toan", Toast.LENGTH_LONG).show();
                }else{
                    float so1 = Float.parseFloat(A);
                    float so2 = Float.parseFloat(B);
                    txtKetQua.setText(String.valueOf(so1+so2));
                }

            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();
                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so vao de thuc hien tinh toan", Toast.LENGTH_LONG).show();
                }else{
                    float so1 = Float.parseFloat(A);
                    float so2 = Float.parseFloat(B);
                    txtKetQua.setText(String.valueOf(so1-so2));
                }
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();
                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so vao de thuc hien tinh toan", Toast.LENGTH_LONG).show();
                }else{
                    float so1 = Float.parseFloat(A);
                    float so2 = Float.parseFloat(B);
                    txtKetQua.setText(String.valueOf(so1*so2));
                }
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();
                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so vao de thuc hien tinh toan", Toast.LENGTH_LONG).show();
                }else{
                    float so1 = Float.parseFloat(A);
                    float so2 = Float.parseFloat(B);
                    if (so2 == 0){
                        Toast.makeText(MainActivity.this, "So thu 2 khong duoc bang 0 ", Toast.LENGTH_LONG).show();
                    }else {
                        float kq = so1 / so2;
                        txtKetQua.setText(String.valueOf(kq));
                    }
                }

            }
        });
    }

    private void AnhXa(){
        txtKetQua = (TextView) findViewById(R.id.txtKQ);
        editA = (EditText) findViewById(R.id.editA);
        editB =  (EditText) findViewById(R.id.editB);
        btnCong = (Button) findViewById(R.id.btncong);
        btnTru = (Button) findViewById(R.id.btntru);
        btnNhan = (Button) findViewById(R.id.btnnhan);
        btnChia = (Button) findViewById(R.id.btchia);
    }

    private void statusScreen(){
        Display display = ((WindowManager) Objects.requireNonNull(getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay();
        switch (display.getRotation()){
            case Surface.ROTATION_0:

            case Surface.ROTATION_180:
                Toast.makeText(MainActivity.this, "Màn hình đứng", Toast.LENGTH_SHORT).show();
                break;

            case Surface.ROTATION_90:


            case Surface.ROTATION_270:
                Toast.makeText(MainActivity.this, "Màn hình ngang", Toast.LENGTH_SHORT).show();
                break;
        }

    }


}
