package com.example.tugasproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText l,t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("MULIYADI.B");
        toolbar.setSubtitle("13020160050");
        toolbar.setLogo(R.drawable.layan1);

        l = (EditText)findViewById(R.id.txt_lebar);
        t = (EditText)findViewById(R.id.txt_tinggi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(l.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Lebar Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(t.length()==0){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if(l.length()==0){
                    Toast.makeText(getApplication(),"Lebar Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isilebar = l.getText().toString();
                    String isitinggi = t.getText().toString();
                    double l = Double.parseDouble(isilebar);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(l,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }



    public double LuasSegitiga(double l, double t){return l*t*1/2;}
}
