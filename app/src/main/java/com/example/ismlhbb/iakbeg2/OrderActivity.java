package com.example.ismlhbb.iakbeg2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    TextView txtNama;
    CheckBox ck1;
    CheckBox ck2;
    CheckBox ck3;
    Button btnBayar;
    TextView txtJumlah;
    TextView qty1;
    TextView qty2;
    TextView qty3;
    Button min1;
    Button min2;
    Button min3;
    Button plus1;
    Button plus2;
    Button plus3;

    int hrespfinal=0, hrcapfinal=0, hrcaffinal=0,hrEspresso=15000, hrCappuccino=20000, hrcaffeLatte=25000, hrDefault=0, qtyDefault1=0,qtyDefault2=0,qtyDefault3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        //define lokal variable to view
        ck1= (CheckBox) findViewById(R.id.espresso);
        ck2= (CheckBox) findViewById(R.id.cappuccino);
        ck3= (CheckBox) findViewById(R.id.caffeLatte);
        btnBayar= (Button) findViewById(R.id.btnHarga);
        txtJumlah= (TextView) findViewById(R.id.txtHarga);
        txtNama= (TextView) findViewById(R.id.name);
        qty1= (TextView) findViewById(R.id.txtqty1);
        qty2= (TextView) findViewById(R.id.txtqty2);
        qty3= (TextView) findViewById(R.id.txtqty3);
        min1= (Button) findViewById(R.id.btnmin1);
        min2= (Button) findViewById(R.id.btnmin2);
        min3= (Button) findViewById(R.id.btnmin3);
        plus1= (Button) findViewById(R.id.btnplus1);
        plus2= (Button) findViewById(R.id.btnplus2);
        plus3= (Button) findViewById(R.id.btnplus3);

        String terimaNama = getIntent().getStringExtra("name");

        //set value ke txt nama
        txtNama.setText("Hai "+terimaNama+", Selamat Datang di iCoffe Shop. Silakan pilih menu Coffee dibawah ini");

        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked() == true){
                    hrDefault = hrDefault + hrEspresso;
                    hrespfinal = hrespfinal + hrEspresso;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault1 = qtyDefault1 + 1;
                    qty1.setText(qtyDefault1 + "");
                }
                else if(ck1.isChecked() == false){
                    hrDefault = hrDefault - hrespfinal;
                    hrespfinal = 0;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault1 = 0;
                    qty1.setText(qtyDefault1 + "");
                }
            }
        });

        ck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck2.isChecked() == true){
                    hrDefault = hrDefault + hrCappuccino;
                    hrcapfinal = hrcapfinal + hrCappuccino;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault2 = qtyDefault2 + 1;
                    qty2.setText(qtyDefault2 + "");
                }
                else if(ck2.isChecked() == false){
                    hrDefault = hrDefault-hrcapfinal;
                    hrcapfinal = 0;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault2 = 0;
                    qty2.setText(qtyDefault2 + "");
                }
            }
        });

        ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck3.isChecked() == true){
                    hrDefault = hrDefault + hrcaffeLatte;
                    hrcaffinal = hrcaffinal + hrcaffeLatte;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault3 = qtyDefault3 + 1;
                    qty3.setText(qtyDefault3 + "");
                }
                else if(ck3.isChecked() == false){
                    hrDefault = hrDefault - hrcaffinal;
                    hrcaffinal = 0;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault3 = 0;
                    qty3.setText(qtyDefault3 + "");
                }
            }
        });

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (plus1.hasOnClickListeners() == true){
                 ck1.setChecked(true);
                 hrDefault = hrDefault + hrEspresso;
                 hrespfinal = hrespfinal + hrEspresso;
                 txtJumlah.setText("Rp. " + hrDefault);
                 qtyDefault1= qtyDefault1 + 1;
                 qty1.setText(qtyDefault1 + "");
             }
             else if (plus1.hasOnClickListeners()==false){
                 ck1.setChecked(false);
                 hrDefault = hrDefault - hrEspresso;
                 hrespfinal = hrespfinal - hrEspresso;
                 txtJumlah.setText("Rp. " + hrDefault);
                 qtyDefault1= qtyDefault1 - 1;
                 qty1.setText(qtyDefault1 + "");
             }
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus2.hasOnClickListeners() == true){
                    ck2.setChecked(true);
                    hrDefault= hrDefault + hrCappuccino;
                    hrcapfinal= hrcapfinal + hrCappuccino;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault2= qtyDefault2 + 1;
                    qty2.setText(qtyDefault2 + "");
                }
                else if (plus2.hasOnClickListeners()==false){
                    ck2.setChecked(false);
                    hrDefault=hrDefault - hrCappuccino;
                    hrcapfinal=hrcapfinal - hrCappuccino;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault2= qtyDefault2 - 1;
                    qty2.setText(qtyDefault2 + "");
                }
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (plus3.hasOnClickListeners() == true){
                    ck3.setChecked(true);
                    hrDefault= hrDefault + hrcaffeLatte;
                    hrcaffinal= hrcaffinal + hrcaffeLatte;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault3= qtyDefault3 + 1;
                    qty3.setText(qtyDefault3 + "");
                }
                else if (plus3.hasOnClickListeners()==false){
                    ck3.setChecked(false);
                    hrDefault= hrDefault - hrcaffeLatte;
                    hrcaffinal= hrcaffinal - hrcaffeLatte;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault3= qtyDefault3 - 1;
                    qty3.setText(qtyDefault3 + "");
                }
            }
        });

        min1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(min1.hasOnClickListeners()== true && qtyDefault1>1){
                    hrDefault = hrDefault - hrEspresso;
                    hrespfinal = hrespfinal - hrEspresso;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault1 = qtyDefault1 - 1;
                    qty1.setText(qtyDefault1 + "");
                }
                else{
                    Toast.makeText(getApplicationContext(), "Jumlah Pesanan Minimal 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        min2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(min2.hasOnClickListeners()== true && qtyDefault2>1){
                    hrDefault = hrDefault - hrCappuccino;
                    hrcapfinal = hrcapfinal - hrCappuccino;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault2 = qtyDefault2 - 1;
                    qty2.setText(qtyDefault2 + "");
                }
                else{
                    Toast.makeText(getApplicationContext(), "Jumlah Pesanan Minimal 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        min3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(min3.hasOnClickListeners()== true && qtyDefault3>1){
                    hrDefault = hrDefault - hrcaffeLatte;
                    hrcaffinal = hrcaffinal - hrcaffeLatte;
                    txtJumlah.setText("Rp. " + hrDefault);
                    qtyDefault3 = qtyDefault3 - 1;
                    qty3.setText(qtyDefault3 + "");
                }
                else{
                    Toast.makeText(getApplicationContext(), "Jumlah Pesanan Minimal 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Jumlah yang harus dibayar adalah Rp. "+hrDefault,Toast.LENGTH_LONG).show();
            }
        });
    }
}
