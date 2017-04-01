package com.example.georges.firstapplication;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
import android.os.Vibrator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.text.DecimalFormat;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private GoogleApiClient client;

    String optr;
    public Double op3 = (double)0, op4 = (double)0;
    EditText Display;
    TextView SecondDisplay;
    TextView ST;
    public double op1, op2;
    Button butt0, butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9, buttC, buttE, buttA, buttS, buttM, buttD, buttDel, buttDec, buttPi, buttExp;



    MediaPlayer Help;
    MediaPlayer Stress;
    MediaPlayer Censor;
    MediaPlayer FuckOff;
    MediaPlayer Clapping;



    @Override
    protected void onPause() {
        super.onPause();
        Help.release();
        Stress.release();
        Censor.release();
        FuckOff.release();
        Clapping.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Help = MediaPlayer.create(this, R.raw.help);
        Stress = MediaPlayer.create(this, R.raw.stress);
        Censor = MediaPlayer.create(this, R.raw.censor);
        FuckOff = MediaPlayer.create(this, R.raw.fuckoff);
        Clapping = MediaPlayer.create(this, R.raw.clapping);
        final DecimalFormat nFormat = new DecimalFormat("##.##");



        TextView st = (TextView) findViewById(R.id.ScrollText);
        st.setSelected(true);


        butt0 = (Button)findViewById(R.id.butt0);
        butt1 = (Button)findViewById(R.id.butt1);
        butt2 = (Button)findViewById(R.id.butt2);
        butt3 = (Button)findViewById(R.id.butt3);
        butt4 = (Button)findViewById(R.id.butt4);
        butt5 = (Button)findViewById(R.id.butt5);
        butt6 = (Button)findViewById(R.id.butt6);
        butt7 = (Button)findViewById(R.id.butt7);
        butt8 = (Button)findViewById(R.id.butt8);
        butt9 = (Button)findViewById(R.id.butt9);
        buttC = (Button)findViewById(R.id.buttC);
        buttE = (Button)findViewById(R.id.buttE);
        buttA = (Button)findViewById(R.id.buttA);
        buttS = (Button)findViewById(R.id.buttS);
        buttM = (Button)findViewById(R.id.buttM);
        buttD = (Button)findViewById(R.id.buttD);
        buttPi = (Button)findViewById(R.id.buttPi);
        buttDec = (Button)findViewById(R.id.buttDec);
        buttExp = (Button)findViewById(R.id.buttExp);
        buttDel = (Button)findViewById(R.id.buttDel);
        Display = (EditText) findViewById(R.id.TextScreen);
        SecondDisplay = (TextView)findViewById(R.id.SecondaryTextScreen);

        try {
            butt0.setOnClickListener(this);
            butt1.setOnClickListener(this);
            butt2.setOnClickListener(this);
            butt3.setOnClickListener(this);
            butt4.setOnClickListener(this);
            butt5.setOnClickListener(this);
            butt6.setOnClickListener(this);
            butt7.setOnClickListener(this);
            butt8.setOnClickListener(this);
            butt9.setOnClickListener(this);
            buttC.setOnClickListener(this);
            buttE.setOnClickListener(this);
            buttA.setOnClickListener(this);
            buttS.setOnClickListener(this);
            buttM.setOnClickListener(this);
            buttD.setOnClickListener(this);
            buttPi.setOnClickListener(this);
            buttExp.setOnClickListener(this);
            buttDec.setOnClickListener(this);
            buttDel.setOnClickListener(this);
        }
        catch(Exception e){ }




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();}
    public void operation(){
        if(optr.equals("+")){
            op4 = Double.parseDouble(Display.getText().toString());
            Display.setText("");
            SecondDisplay.setText(Double.toString(op3) + " + " + Double.toString(op4));
            op3 = op3 + op4;
            Display.setText(Double.toString(op3));
        }
        else if(optr.equals("-")){
            op4 = Double.parseDouble(Display.getText().toString());
            Display.setText("");
            SecondDisplay.setText(Double.toString(op3) + " - " + Double.toString(op4));
            op3 = op3 - op4;
            Display.setText(Double.toString(op3));
        }
        else if(optr.equals("*")){
            op4 = Double.parseDouble(Display.getText().toString());
            Display.setText("");
            SecondDisplay.setText(Double.toString(op3) + " * " + Double.toString(op4));
            op3 = op3 * op4;
            Display.setText(Double.toString(op3));
        }
        else if(optr.equals("/")){
            op4 = Double.parseDouble(Display.getText().toString());
            Display.setText("");
            SecondDisplay.setText(Double.toString(op3) + " / " + Double.toString(op4));
            op3 = op3 / op4;
            Display.setText(Double.toString(op3));
        }

    }
    public void onClick(View arg0){
        Editable str = Display.getText();
        switch(arg0.getId()){
            case R.id.butt0:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt0.getText());
                Display.setText(str);
                break;
            case R.id.butt1:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt1.getText());
                Display.setText(str);
                break;
            case R.id.butt2:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt2.getText());
                Display.setText(str);
                break;
            case R.id.butt3:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt3.getText());
                Display.setText(str);
                break;
            case R.id.butt4:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt4.getText());
                Display.setText(str);
                break;
            case R.id.butt5:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt5.getText());
                Display.setText(str);
                break;
            case R.id.butt6:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt6.getText());
                Display.setText(str);
                break;
            case R.id.butt7:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt7.getText());
                Display.setText(str);
                break;
            case R.id.butt8:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt8.getText());
                Display.setText(str);
                break;
            case R.id.butt9:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(butt9.getText());
                Display.setText(str);
                break;
            case R.id.buttPi:
                if(op2 != 0){
                    op2 = 0;
                    Display.setText("");
                }
                str = str.append(Double.toString(Math.PI));
                Display.setText(str);
                break;
            case R.id.buttC:
                op1 = 0;
                op2 = 0;
                op3 = (double)0;
                op4 = (double)0;
                Display.setText("");
                SecondDisplay.setText("");
                break;
            case R.id.buttA:
                optr = "+";
                if(op3 == 0){
                op3 = Double.parseDouble(Display.getText().toString());
                SecondDisplay.setText(Double.toString(op3) + " + ");
                Display.setText("");
                     }
                else if(op4 != 0) {
                    op4 = (double) 0;
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " + ");
                }
                else{
                    op4 = Double.parseDouble(Display.getText().toString());
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " + ");
                    op3 = op3 + op4;
                    Display.setText(Double.toString(op3));
                }
                break;
            case R.id.buttS:
                optr = "-";
                if(op3 == 0){
                    op3 = Double.parseDouble(Display.getText().toString());
                    SecondDisplay.setText(Double.toString(op3) + " - ");
                    Display.setText("");
                }
                else if(op4 != 0) {
                    op4 = (double) 0;
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " - ");
                }
                else{
                    op4 = Double.parseDouble(Display.getText().toString());
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " - ");
                    op3 = op3 - op4;
                    Display.setText(Double.toString(op3));
                }
                break;
            case R.id.buttM:
                optr = "*";
                if(op3 == 0){
                    op3 = Double.parseDouble(Display.getText().toString());
                    SecondDisplay.setText(Double.toString(op3)+ " * ");
                    Display.setText("");
                }
                else if(op4 != 0) {
                    op4 = (double) 0;
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " * ");
                }
                else{
                    op4 = Double.parseDouble(Display.getText().toString());
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " * ");
                    op3 = op3 * op4;
                    Display.setText(Double.toString(op3));
                }
                break;
            case R.id.buttD:
                optr = "/";
                if(op3 == 0){
                    op3 = Double.parseDouble(Display.getText().toString());
                    SecondDisplay.setText(Double.toString(op3)+ " / ");
                    Display.setText("");
                }
                else if(op4 != 0) {
                    op4 = (double) 0;
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " / ");
                }
                else{
                    op4 = Double.parseDouble(Display.getText().toString());
                    Display.setText("");
                    SecondDisplay.setText(Double.toString(op3) + " / ");
                    op3 = op3 / op4;
                    Display.setText(Double.toString(op3));
                }
                break;
            case R.id.buttE:
                if(!optr.equals(null)){
                    if(op4 != 0){
                        if(optr.equals("+")) {
                            Display.setText("");
                            Display.setText(Double.toString(op3));
                        }
                        else if(optr.equals("-")) {
                            Display.setText("");
                            Display.setText(Double.toString(op3));
                        }
                        else if(optr.equals("*")) {
                            Display.setText("");
                            Display.setText(Double.toString(op3));
                        }
                        else if(optr.equals("/")) {
                            Display.setText("");
                            Display.setText(Double.toString(op3));
                        }
                    }
                    else{
                        operation();
                    }
                }
                break;
            case R.id.buttDec:
                if(op4 != 0){
                    op4 = (double)0;
                    Display.setText("");
                }
                str = str.append(buttDec.getText());
                Display.setText(str);
                break;
            case R.id.buttDel:
                if(op4 != 0){
                    op4 = (double)0;
                    Display.setText("");
                }
                String textInBox = Display.getText().toString();
                if(textInBox.length() > 0){
                    String newTextInBox = textInBox.substring(0, textInBox.length()-1);
                    Display.setText(newTextInBox);
                }
                break;
        }

    }
    private String removeTrailingZero(String formattingInput){
        if(!formattingInput.contains(".")){
            return formattingInput;
        }
        int dotPosition = formattingInput.indexOf(".");
        String newValue = formattingInput.substring(dotPosition, formattingInput.length());
        if(newValue.equals(".0")){
            return formattingInput.substring(0, dotPosition);
        }
        return formattingInput;
    }


    public void playStress(View view){Stress.start();}
    public void playHelp(View view){Help.start();}
    public void playCensor(View view){Censor.start();}
    public void playFuckOff(View view){FuckOff.start();}
    public void playClapping(View view){Clapping.start();}




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
        if (id == R.id.action_menu) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Calculator")
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
