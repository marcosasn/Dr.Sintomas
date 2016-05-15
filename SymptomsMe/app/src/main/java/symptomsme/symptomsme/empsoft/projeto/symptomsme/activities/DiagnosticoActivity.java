package symptomsme.symptomsme.empsoft.projeto.symptomsme.activities;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.Window;
        import android.widget.TextView;

        import symptomsme.symptomsme.empsoft.projeto.symptomsme.R;
        import symptomsme.symptomsme.empsoft.projeto.symptomsme.entities.Doenca;

public class DiagnosticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_diagnostico);


        Doenca doenca = (Doenca) getIntent().getExtras().getSerializable("doenca");

        final Toolbar toolbar = (Toolbar) findViewById(R.id.Mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(doenca.getName());


        TextView descricaoTv = (TextView) findViewById(R.id.textViewDescription);
        descricaoTv.setText(doenca.getDescription());

        TextView causasTv = (TextView) findViewById(R.id.textViewCausasT);
        causasTv.setText(doenca.getCausas());

        String[] sintomas = doenca.getSintomas().split(",");

        String sintomasFormatted = "";

        for(int i = 0; i < sintomas.length - 1; i++){
            sintomasFormatted = sintomasFormatted + sintomas[i] + "\n";
        }

        sintomasFormatted = sintomasFormatted + sintomas[sintomas.length - 1];

        TextView sintomasTv = (TextView) findViewById(R.id.textViewSintomasL);
        sintomasTv.setText(sintomasFormatted);

        TextView prevencoesTv = (TextView) findViewById(R.id.textViewPrevencoesL);
        prevencoesTv.setText(doenca.getPrevencao());


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