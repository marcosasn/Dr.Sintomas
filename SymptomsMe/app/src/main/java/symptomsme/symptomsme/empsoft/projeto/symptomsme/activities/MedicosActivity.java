package symptomsme.symptomsme.empsoft.projeto.symptomsme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import symptomsme.symptomsme.empsoft.projeto.symptomsme.R;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.adapters.DoencaAdapter;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.adapters.MedicoAdapter;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Medico;

public class MedicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_medicos);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.Mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Medico> medicos = (ArrayList<Medico>) getIntent().getExtras().getSerializable("medicos");

        ListView mListMedicos = (ListView) findViewById(R.id.listViewMedicos);
        final MedicoAdapter medicoAdapter = new MedicoAdapter(this, medicos);
        mListMedicos.setAdapter(medicoAdapter);

        mListMedicos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Medico medico = (Medico) medicoAdapter.getItem(position);
                Intent i = new Intent(getApplicationContext(), MedicoActivity.class);
                i.putExtra("medico",medico);
                startActivity(i);
            }
        });
    }
}
