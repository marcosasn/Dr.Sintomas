package symptomsme.symptomsme.empsoft.projeto.symptomsme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import symptomsme.symptomsme.empsoft.projeto.symptomsme.R;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.database.DBSPopulater;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.database.DataBaseStorage;
import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;

public class SintomaActivity extends AppCompatActivity {

    private DataBaseStorage mDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sintoma);

        mDb = new DataBaseStorage(getApplicationContext());

        if(mDb.getAllDoencas().size() == 0){
            DBSPopulater populater = new DBSPopulater(getApplicationContext());
            populater.populateBD();
        }
        final EditText etSintomas = (EditText) findViewById(R.id.et_sintoma);

        ImageButton btPesquisar = (ImageButton) findViewById(R.id.bt_pesquisar);

        btPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etSintomas.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Digite algum sintoma",Toast.LENGTH_LONG).show();
                }

                else{

                    String[] sintomas = (etSintomas.getText().toString()).split(",");
                    ArrayList<Doenca> doencas = mDb.getDoencasBySintomas(sintomas);

                    if(doencas.size() == 0)
                        Toast.makeText(getApplicationContext(),"Nenhuma doença encontrada",Toast.LENGTH_LONG).show();
                    else{
                        Intent i = new Intent(getApplicationContext(), DoencasActivity.class);
                        i.putExtra("doencas",doencas);

                        startActivity(i);
                    }
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
