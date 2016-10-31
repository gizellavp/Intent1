package id.sch.smktelkom_mlg.learn.intent1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAMA = "Nama";
    public static final String UMUR = "Umur";
    EditText etNama;
    EditText etUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etNama = (EditText) findViewById(R.id.editTextUmur);
        findViewById(R.id.buttonhitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    goHasil();
                }

            }private void goHasil()
            {
                String nama = etNama.getText();
                String umurStr = etUmur.getText();

                int umur = umurStr.isEmpty()?0:Integer.parseInt(umurStr);

                Intent intent = new Intent(MainActivity.this, HasilActivity.class);
                intent.putExtra(NAMA, nama);
                intent.putExtra(UMUR, umur);

                startActivity(intent));
    }
        });

    }


}
