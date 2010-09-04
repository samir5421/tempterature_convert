package com.webs.samirapplications.temperature_convert;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;



public class TemperatureConverter extends Activity {
    /** Called when the activity is first created. */
	
	EditText in;
	double temp = 0;
	double ans = 0;
	TextView txtanswer;
	Button toFa;
	Button toCe;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toFa = (Button)findViewById(R.id.toFa);
        toCe = (Button)findViewById(R.id.toCe);
        txtanswer = (TextView)findViewById(R.id.txtanswer);
        in = (EditText)findViewById(R.id.temp);
      	toFa.setOnClickListener(new Button.OnClickListener() 
      	{ 
      		public void onClick (View v)
      		{ calculateFa();} 
      		
       	});
      	toCe.setOnClickListener(new Button.OnClickListener() 
      	{ 
      		public void onClick (View v)
      		{ calculateCe();} 
      		
       	});
    }
    private void calculateFa() 
	{
		temp=Double.parseDouble(in.getText().toString());
		ans = temp * (9.00/5.00) + 32;
		String answerf = ans + " degrees Fahrenheit";
		txtanswer.setText(answerf);
	}
    private void calculateCe() 
	{
		temp=Double.parseDouble(in.getText().toString());
		ans = (temp - 32)*(5.00/9.00);
		String answerc = ans + " degrees Celsius";
		txtanswer.setText(answerc);
	}
}
