package id.sch.smktelkom_mlg.tugas01.xirpl4003.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etTelp;
    RadioButton rbJNE;
    RadioButton rbTIKI;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rgJS;
    Button bOrder;
    Spinner spDomisili;
    TextView tvHasil1 , tvHasil2 , tvHasil3 , tvHasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTelp = (EditText) findViewById(R.id.editTextTelp);
        rgJS = (RadioGroup) findViewById(R.id.radioGroupJS);
        rbJNE = (RadioButton) findViewById(R.id.radioButtonJNE);
        rbTIKI = (RadioButton) findViewById(R.id.radioButtonTIKI);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        bOrder = (Button) findViewById(R.id.buttonOrder);
        spDomisili = (Spinner) findViewById(R.id.spinnerDomisili);
        tvHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        tvHasil3= (TextView) findViewById(R.id.textViewHasil3);


        bOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doProcess();
                doClick();


            }
        });
    }

    private void doClick()
    {
        String hasil = null;

        if(rbJNE.isChecked())
        {
            hasil = rbJNE.getText().toString();

        }
        else if(rbTIKI.isChecked())
        {
            hasil = (rbTIKI.getText().toString());
        }
        if (hasil == null)
        {
            tvHasil3.setText("Belum memilih Jasa pengantar");
        }

        else
        {
            tvHasil3.setText("dengan Jasa pengantar : " +hasil);
        }
        String check = "Orderan Anda :  ";
        int startlen = check.length();
        if(cb1.isChecked()) check += cb1.getText() + " ";
        if(cb2.isChecked()) check += cb2.getText() + " ";
        if(cb3.isChecked()) check += cb3.getText() + " ";
        if(cb4.isChecked()) check += cb4.getText() + " ";

        if(check.length() == startlen) hasil += "Tidak ada pilihan";
        tvHasil3.setText("Menggunakan Jasa pengantar  " +hasil+"."+ check + "." + spDomisili.getSelectedItem().toString()+".");
    }



    private void doProcess()
    {
        if(isValid())
        {
            String Nama = etNama.getText().toString();
            int Telepon = Integer.parseInt(etTelp.getText().toString());
            tvHasil2.setText(Nama+" Telah Order melalui via online oleh "+ Telepon);

        }
    }

    private boolean isValid()
    {
        boolean valid = true;

        String Nama = etNama.getText().toString();
        String Telepon = etTelp.getText().toString();

        if(Nama.isEmpty())
        {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        }
        else if(etNama.length()<3)
        {
            etNama.setError("Nama Minimal 3 Karakter");
            valid = false;
        }

        else
        {
            etNama.setError(null);
        }
        if (Telepon.isEmpty())
        {
            etTelp.setError("Telepon Belum Diisi");
            valid = false ;
        }

        else
        {
            etTelp.setError(null);
        }
        return valid;
    }

}

}
}
