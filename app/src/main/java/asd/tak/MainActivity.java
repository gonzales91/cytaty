package asd.tak;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    Button klik;

    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        klik = (Button) findViewById(R.id.klik);
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Oto Cytat:", Toast.LENGTH_SHORT ).show();
            }
        };
        klik.setOnClickListener(l);
        klik = (Button) findViewById(R.id.klik);
        View.OnClickListener l1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a;
               String co = null;
               Random generator = new Random();
               a = generator.nextInt(7);
               switch(a) {
                   case 0:
                       co = "Ci, którzy nie pamiętaja przeszłości, są skazani na jej powtarzanie.";
                       break;
                   case 1:
                       co = "Szczęście może przyjść przypadkowo, ale o rozum musimy postarać się sami.";
                       break;
                   case 2:
                       co = "Doświadczenie jest najlepszym nauczycielem.";
                       break;
                   case 3:
                       co = "Pewnego przyjaciela poznaje się w niepewnym położeniu";
                       break;
                   case 4:
                       co = "Pycha jest zwierciadłem, które pomniejsza nasze wady, a powiększa zalety.";
                       break;
                   case 5:
                       co = "Każda chwila, która mogłaby być wykorzystana lepiej, jest stracona.";
                       break;
                   case 6:
                       co = "Wszyscy ludzie są o tyle piękni, o ile mniej poznani.";
                       break;
                   case 7:
                       co = "Otwartego prowadzą losy, opornego siłą ciągną.";
                       break;

               }
                Toast.makeText(getApplicationContext(),co, Toast.LENGTH_SHORT ).show();





            }
        };
        klik.setOnClickListener(l1);

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
