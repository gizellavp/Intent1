package id.sch.smktelkom_mlg.learn.intent1;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR);
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int tahunLahir = yearNow - umur;

        TextView tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil.setText(nama + "lahir pada tahun"+ tahunLahir);
        setTitle("Hasil");
        setTitle("Input");
        findViewById(R.id.buttonBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onBackPressed();
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
