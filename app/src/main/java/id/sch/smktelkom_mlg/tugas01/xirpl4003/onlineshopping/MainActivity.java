package id.sch.smktelkom_mlg.tugas01.xirpl4003.onlineshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
