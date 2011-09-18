package com.clarissa.billshare;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class BillShare extends Activity {

    private Button newBillButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        String people[]={ "Clarissa", "Deepak", "Danny", "Melisa" };
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, people);

        newBillButton = (Button) findViewById(R.id.newBillButton);
        newBillButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.new_bill);
                AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.person);
                textView.setAdapter(adapter);

            }
        });
    }
}
