package com.example.android.rainfallflood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        final EditText editText = (EditText) findViewById(R.id.deforst);
        double value = Double.valueOf((editText.getText().toString())).doubleValue();
        EditText r = (EditText) findViewById(R.id.exponant);
        double rvalue = Double.valueOf((r.getText().toString())).doubleValue();

        CheckBox zerhour = (CheckBox) findViewById(R.id.zerohour);
        boolean haszerohour = zerhour.isChecked();
        CheckBox halfhour = (CheckBox) findViewById(R.id.halfhour);
        boolean hashalfhour = halfhour.isChecked();
        CheckBox twohour = (CheckBox) findViewById(R.id.twohour);
        boolean hastwohour = twohour.isChecked();
        CheckBox twelvwhour = (CheckBox) findViewById(R.id.twelvehour);
        boolean hastwelevehour = twelvwhour.isChecked();
        CheckBox twentyhour = (CheckBox) findViewById(R.id.twentyhour);
        boolean hastwentyhour = twentyhour.isChecked();

        CheckBox ridge = (CheckBox) findViewById(R.id.ridge);
        boolean hasridge = ridge.isChecked();
        CheckBox plane = (CheckBox) findViewById(R.id.plane);
        boolean hasplane = plane.isChecked();
        CheckBox steep = (CheckBox) findViewById(R.id.steep);
        boolean hassteep = steep.isChecked();
        CheckBox backed = (CheckBox) findViewById(R.id.backed);
        boolean hasbacked = backed.isChecked();

        CheckBox perennial = (CheckBox) findViewById(R.id.perennial);
        boolean hasper = perennial.isChecked();
        CheckBox nonper = (CheckBox) findViewById(R.id.nonperennial);
        boolean hasnonper = nonper.isChecked();
        CheckBox anti = (CheckBox) findViewById(R.id.antiquated);
        boolean hasanti = anti.isChecked();
        CheckBox priver = (CheckBox) findViewById(R.id.priver);
        boolean haspriver = priver.isChecked();
        CheckBox nriver = (CheckBox) findViewById(R.id.npriver);
        boolean hasnriver = nriver.isChecked();

        CheckBox summer = (CheckBox) findViewById(R.id.summer);
        boolean hassummer = summer.isChecked();
        CheckBox monoon = (CheckBox) findViewById(R.id.monsoon);
        boolean hasmonsoon = monoon.isChecked();
        CheckBox mstarting = (CheckBox) findViewById(R.id.monsoonstarting);
        boolean hasmstarting = mstarting.isChecked();
        CheckBox no = (CheckBox) findViewById(R.id.noI);
        boolean hasno = no.isChecked();


        double price = calculatePrice(haszerohour, hashalfhour, hastwohour, hastwelevehour, hastwentyhour, hasridge, hasplane, hassteep, hasbacked, hasper, hasnonper, hasanti,
                haspriver,hasnriver,hassummer, hasmonsoon, hasmstarting, hasno, value, rvalue);


        display(price);



    }

    private double calculatePrice(boolean zero, boolean half, boolean two, boolean tweleve, boolean twenty, boolean ridge, boolean plane, boolean steep, boolean backed,
                                  boolean per, boolean nonper, boolean anti,boolean priver,boolean nriver , boolean summer, boolean monsoon, boolean mstarting, boolean noi, double value, double rvalue) {
        double k = 1;
        double v = 1;
        double g = 1;
        double i = 1;
        double e = 2.718;
        //FOR TIME
        if (zero == true) {
            k *= 0;
        }
        if (half == true) {
            k *= 0.25;
        }
        if (two == true) {
            k *= 0.5;
        }
        if (tweleve == true) {
            k *= 0.75;
        }
        if (twenty == true) {
            k *= 1;
        }
//For TERRAIN
        if (ridge == true) {
            v *= 0;
        }
        if (plane == true) {
            v *= 0.5;
        }
        if (steep == true) {
            v *= 0.75;
        }
        if (backed == true) {
            v *= 1;
        }
//For Glacier
        if (per == true) {
            g *= 1;
        }
        if (nonper == true) {
            g *= 1.5;
        }
        if (anti == true) {
            g *= 2;
        } if (priver == true) {
            g *= 1.5;
        } if (nriver == true) {
            g *= 2;
        }

//For Infrastructure
        if (summer == true) {
            i *= 1;
        }
        if (monsoon == true) {
            i *= 2;
        }
        if (mstarting == true) {
            i *= 1.5;
        }
        if (noi == true) {
            i *= 1;
        }

        rvalue = Math.pow(e, rvalue);


        return k * v * g * i * value * rvalue;
    }


    private void display(double number) {
        TextView quantityTextView = (TextView) findViewById(R.id.order);
        quantityTextView.setText("" + number);
    }

    public void reset(View v) {

        EditText editText = (EditText) findViewById(R.id.deforst);
        editText.setText("");
        EditText edit = (EditText) findViewById(R.id.exponant);
        edit.setText("");
        TextView quantityTextView = (TextView) findViewById(R.id.order);
        quantityTextView.setText("");


        CheckBox zerhour = (CheckBox) findViewById(R.id.zerohour);
        zerhour.setChecked(false);
        CheckBox halfhour = (CheckBox) findViewById(R.id.halfhour);
        halfhour.setChecked(false);
        CheckBox twohour = (CheckBox) findViewById(R.id.twohour);
        twohour.setChecked(false);
        CheckBox twelvwhour = (CheckBox) findViewById(R.id.twelvehour);
        twelvwhour.setChecked(false);
        CheckBox twentyhour = (CheckBox) findViewById(R.id.twentyhour);
        twentyhour.setChecked(false);
        CheckBox ridge = (CheckBox) findViewById(R.id.ridge);
        ridge.setChecked(false);
        CheckBox plane = (CheckBox) findViewById(R.id.plane);
        plane.setChecked(false);
        CheckBox steep = (CheckBox) findViewById(R.id.steep);
        steep.setChecked(false);
        CheckBox backed = (CheckBox) findViewById(R.id.backed);
        backed.setChecked(false);

        CheckBox perennial = (CheckBox) findViewById(R.id.perennial);
        perennial.setChecked(false);
        CheckBox nonper = (CheckBox) findViewById(R.id.nonperennial);
        nonper.setChecked(false);
        CheckBox anti = (CheckBox) findViewById(R.id.antiquated);
        anti.setChecked(false);
        CheckBox priver = (CheckBox) findViewById(R.id.priver);
        priver.setChecked(false);
        CheckBox nriver = (CheckBox) findViewById(R.id.npriver);
        nriver.setChecked(false);

        CheckBox summer = (CheckBox) findViewById(R.id.summer);
        summer.setChecked(false);
        CheckBox monoon = (CheckBox) findViewById(R.id.monsoon);
        monoon.setChecked(false);
        CheckBox mstarting = (CheckBox) findViewById(R.id.monsoonstarting);
        mstarting.setChecked(false);
        CheckBox no = (CheckBox) findViewById(R.id.noI);
        no.setChecked(false);


    }


}



