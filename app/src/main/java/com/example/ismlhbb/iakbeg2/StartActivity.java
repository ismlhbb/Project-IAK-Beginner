package com.example.ismlhbb.iakbeg2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {
    EditText editNama;
    ImageView arrowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        editNama=(EditText)findViewById(R.id.name);
        arrowImage=(ImageView)findViewById(R.id.arrowimage);

        arrowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editNama.length()==0){
                    Toast.makeText(getApplicationContext(),"Silakan Isi Nama Kamu",Toast.LENGTH_SHORT).show();
                }
                else{
                    //mendapatkan value editnama
                    String nama = editNama.getText().toString();
                    Intent i = new Intent(getApplicationContext(), OrderActivity.class);


                    //kirim data
                    i.putExtra("name", nama);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Yakin ingin keluar ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog quit =builder.create();
        quit.show();
    }
}
