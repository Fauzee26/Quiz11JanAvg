package fauzi.hilmy.quiz11janavg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMTK, etBahasa, etKejuruan, etEnglish;
    Button btnHasil;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMTK = (EditText)findViewById(R.id.etMTK);
        etBahasa = (EditText)findViewById(R.id.etBahasa);
        etKejuruan = (EditText)findViewById(R.id.etKejuruan);
        etEnglish = (EditText)findViewById(R.id.etEnglish);
        btnHasil = (Button)findViewById(R.id.btnHasil);
        lblHasil = (TextView)findViewById(R.id.lblHasil);

        //aksi ketika button di klik
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nBahasa = etBahasa.getText().toString();
                String nMTK = etMTK.getText().toString();
                String nInggris = etEnglish.getText().toString();
                String nKejuruan = etKejuruan.getText().toString();

                int aBahasa = Integer.parseInt(nBahasa);
                int aMTK = Integer.parseInt(nMTK);
                int aInggris = Integer.parseInt(nInggris);
                int aKejuruan = Integer.parseInt(nKejuruan);

                int rataRata = (aBahasa + aMTK + aInggris + aKejuruan) / 4;

                if( rataRata >= 0 && rataRata <= 40){
                    //memberi warning berupa error
                    lblHasil.setText("Nilai D");
                }else if (rataRata >= 41 && rataRata <= 65){
                    //kondisi ktika lebarnya kosong
                    lblHasil.setText("Nilai C");
                }else if (rataRata >= 66 && rataRata <= 80){
                    //kondisi ktika lebarnya kosong
                    lblHasil.setText("Nilai B");
                }else if (rataRata >= 81 && rataRata <= 100){
                    //kondisi ktika lebarnya kosong
                    lblHasil.setText("Nilai A");
                }else{
                    lblHasil.setText("Your Average Is Overload :D");
                }
            }
        });
    }
}
