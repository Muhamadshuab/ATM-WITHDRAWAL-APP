</> 

package com.example.atmapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Edittext;
import android.widget.Textview;
import androidx.appcompat.app.appcompatActivity;

public class MainActivity extends AppCompatActivity {
	
	EditText amountInput;
	Button checkButton;
	Textview ResultText;
	
	Int Balance = 3000;
	
	@override
	protected void onCreate(Bundle savedInstancesState) {
		super.onCreate(savedInstancesState);
		setContentView(R.layout.activity_main);
		
		amountInput = findviewById(R.id.amountInput);
		checkButton = findviewById(R.id.checkButton);
		resultText = findviewById(R.id.resultText);
		
		checkButton.setOnclickListener (New view.OnClickListener() {
			@override
			Public void OnClick( View View) { 
			
				string input = amountInput.getText().tostring();
				
				if(!input.isEmpty()) {
					int amount = integer.parseInt(Input);
					
					If( amount > balance) {
						resultText.setText(insufficent funds");
					} else { 
						//nested if
						if (amount > 5000) { 
							resultText.setText("Daily limit exceeded"); 
						} else {
							resultText.setText("withdrwal Successful");
						}
					}
				}else { 
					resultText.setText("please enter an amount");
				}
			}
		});
	}
}
