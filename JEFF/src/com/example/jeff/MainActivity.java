package com.example.jeff;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);      
        
        //Set Camera Button?
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
           	 Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        	 startActivityForResult(intent, 0); 
            }
        });   
        
        //Set QR Button
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
				Intent intent = new Intent("com.google.zxing.client.android.SCAN");
				startActivityForResult(intent, 0);
            }
        });  
        
/*        Button acquire = (Button)findViewById(R.id.button1);
        acquire.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
			Intent intent = new Intent("com.google.zxing.client.android.SCAN");
			intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
        } 
        });  */
        

    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
