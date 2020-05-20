package com.lehoa.lethihoa_linearlayout;

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


    EditText editA, editB;
    TextView txtKQ;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        Process();
        statusScrenn();
    }

    private void Anhxa(){
        btnChia = (Button) findViewById(R.id.btnchia);
        btnCong = (Button) findViewById(R.id.btncong);
        btnNhan = (Button) findViewById(R.id.btnnhan);
        btnTru =  (Button) findViewById(R.id.btntru);
        editA = (EditText) findViewById(R.id.editA);
        editB = (EditText) findViewById(R.id.editB);
        txtKQ = (TextView) findViewById(R.id.txtKetQua);
    }


    private void Process(){
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();

                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so de thao tac tiep", Toast.LENGTH_SHORT).show();
                }
                else{
                    float soA = Float.parseFloat(A);
                    float soB = Float.parseFloat(B);
                    txtKQ.setText(String.valueOf(soA+soB));
                }
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();

                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so de thao tac tiep", Toast.LENGTH_SHORT).show();
                }
                else{
                    float soA = Float.parseFloat(A);
                    float soB = Float.parseFloat(B);
                    txtKQ.setText(String.valueOf(soA-soB));
                }

            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();

                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so de thao tac tiep", Toast.LENGTH_SHORT).show();
                }
                else{
                    float soA = Float.parseFloat(A);
                    float soB = Float.parseFloat(B);
                    txtKQ.setText(String.valueOf(soA*soB));
                }

            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = editA.getText().toString().trim();
                String B = editB.getText().toString().trim();

                if(A.isEmpty() || B.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui long nhap so de thao tac tiep", Toast.LENGTH_SHORT).show();
                }
                else{
                    float soA = Float.parseFloat(A);
                    float soB = Float.parseFloat(B);
                    if (soB == 0){
                        Toast.makeText(MainActivity.this, "So thu 2 khong duoc bang 0", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float kq = soA/soB;
                        txtKQ.setText(String.valueOf(kq));
                    }

                }

            }
        });
    }
    private void statusScrenn(){
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
