package symptomsme.symptomsme.empsoft.projeto.symptomsme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import symptomsme.symptomsme.empsoft.projeto.symptomsme.R;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.adapters.MedicoAdapter;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Medico;

public class MedicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_medico);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.Mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Medico medico = (Medico) getIntent().getExtras().getSerializable("medico");

        TextView tvNomeMedico = (TextView)findViewById(R.id.textViewDoctorName);
        TextView tvEnderecoT = (TextView)findViewById(R.id.textViewEnderecoT);
        TextView tvInformacoesT = (TextView)findViewById(R.id.textViewInformacoesT);

        tvNomeMedico.setText(medico.getNome());
        tvEnderecoT.setText(medico.getEndereco() + ", " + medico.getTelefone());
        tvInformacoesT.setText(medico.getInformacoes());
    }
}
