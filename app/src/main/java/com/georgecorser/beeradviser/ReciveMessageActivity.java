package com.georgecorser.beeradviser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReciveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra("message");
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText)findViewById(R.id.message2);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, FindBeerActivity.class);
        intent.putExtra(EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }

}
