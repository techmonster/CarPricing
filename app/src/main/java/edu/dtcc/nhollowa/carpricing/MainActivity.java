package edu.dtcc.nhollowa.carpricing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//             Make     model    body type
    Spinner spinner1, spinner2, spinner3;
    TextView text;
    String item = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text = (TextView) findViewById(R.id.displayView);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,
                R.array.array1,R.layout.spinner_layout );
        initializeAdapter(adapter1, spinner1);

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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {

        //Clear display when selecting from a box previously selected
        if(parent.getSelectedItem().equals("Select Maker")){
            spinner2.setVisibility(View.GONE);
            spinner3.setVisibility(View.GONE);
            clearText();
        }
        if(parent.getSelectedItem().equals("Select Model")){
            spinner3.setVisibility(View.GONE);
            clearText();
        }
        if(parent.getSelectedItem().equals("Select Body")){
            clearText();
        }

        if (parent.getSelectedItem().equals("Ford")) {

            clearText();

            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,
                    R.array.ford_array, R.layout.spinner_layout);
            initializeAdapter(adapter2, spinner2);
        }
        if (parent.getSelectedItem().equals("Chevy")) {

            clearText();

            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,
                    R.array.chevy_array, R.layout.spinner_layout);
            initializeAdapter(adapter2, spinner2);
        }
        if (parent.getSelectedItem().equals("Audi")) {
            item = "";
            text.setText(item);

            ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,
                    R.array.audi_array, R.layout.spinner_layout);
            initializeAdapter(adapter2, spinner2);
        }
        if (parent.getSelectedItem().equals("Mustang")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.mustang_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);
        }
        if (parent.getSelectedItem().equals("Escape")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.escape_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("Fusion")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.fusion_body_array,R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("3")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.three_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("4")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.four_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("7")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.seven_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("Malibu")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.malibu_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("Camaro")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.camaro_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);

        }
        if (parent.getSelectedItem().equals("Tahoe")) {
            ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,
                    R.array.tahoe_body_array, R.layout.spinner_layout);
            initializeAdapter(adapter3, spinner3);
        }

        if (parent.getSelectedItem().equals("1LS")) {
                item = "$23,705";
                toastMessage(item);
                text = (TextView)findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("ZL1")) {
                item = "$55,505";
                toastMessage(item);
                 text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Z28")) {
                item = "$72,305";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("L")) {
                item = "$21,625";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("1LT")) {
                item = "$25,020";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Premier")) {
                item = "$30,920";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("LS")) {
                item = "$48,195";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("LT")) {
                item = "$53,225";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("LTZ")) {
                item = "$62,935";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("A3")) {
                item = "$30,900";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("S3")) {
                item = "$42,500";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("A4")) {
                item = "$37,300";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("S4")) {
                item = "$49,200";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("A7")) {
                item = "$68,300";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("S7")) {
                item = "$82,900";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("RS 7")) {
                item = "$108,900";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("V6 Fastback")) {
                item = "$24,145";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("GT Premium")) {
                item = "$41,895";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Shelby GT350 R")) {
                item = "$61,295";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("S")) {
                item = "$23,600";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("SE")) {
                item = "$25,100";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Titanium")) {
                item = "$29,100";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("FS")) {
                item = "$22,120";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Hybrid SE")) {
                item = "$25,990";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }
            if (parent.getSelectedItem().equals("Energi Platinum")) {
                item = "$41,120";
                toastMessage(item);
                text = (TextView) findViewById(R.id.displayView);
                assert text != null;
                text.setText(item);
            }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

    private void initializeAdapter(ArrayAdapter adapter, Spinner spinArray){
        adapter.setDropDownViewResource(R.layout.spinner_layout);
        spinArray.setAdapter(adapter);
        spinArray.setVisibility(View.VISIBLE);
        spinArray.setOnItemSelectedListener(this);
    }

    private void clearText(){
        item = "";
        text.setText(item);
    }

    private void toastMessage(String price){
        Toast.makeText(getApplicationContext(), price,
                Toast.LENGTH_SHORT).show();
    }
}
