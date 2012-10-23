package com.example.testing;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends Activity 
	implements View.OnClickListener{
	Button btn;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu); 
        int i = 0;
        return true;
    }
    
    public void onClick(View view){
    	Intent intent = new Intent(view.getContext(), SetlocationActivity.class);
    	startActivityForResult(intent,0);
    }
    
    public void launchSetLoc(){
    	btn.setText(new Date().toString());
    }
}
