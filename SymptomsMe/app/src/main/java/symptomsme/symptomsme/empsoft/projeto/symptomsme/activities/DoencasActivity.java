package symptomsme.symptomsme.empsoft.projeto.symptomsme.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import symptomsme.symptomsme.empsoft.projeto.symptomsme.R;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.adapters.DoencaAdapter;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;

public class DoencasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doencas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Doenca> doencas = (ArrayList<Doenca>) getIntent().getExtras().getSerializable("doencas");

        ListView mListDoencas = (ListView) findViewById(R.id.listViewDoencas);

        mListDoencas.setAdapter(new DoencaAdapter(this,doencas));

       }

}
