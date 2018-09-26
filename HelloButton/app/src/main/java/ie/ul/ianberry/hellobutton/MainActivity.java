package ie.ul.ianberry.hellobutton;

//import android.annotation.SuppressLint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    private TextView mMessageTextView;

    //@SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // This method is called when the app starts
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code you add goes after the line above.


        mMessageTextView = findViewById(R.id.message_textview);

        Button resetButton = findViewById(R.id.rest_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();
            }
        });

    }
    //Log.d("HB","This a log cat log");

    public void handleDecrement(View view) {
        mCounter -= 1;
        updateView();
    }

    public void handleIncrement(View view) {
        mCounter += 1;
        updateView();
    }

    private void updateView() {
        mMessageTextView.setText(getString(R.string.message_format, mCounter));


        if (mCounter > 10) {
            mMessageTextView.setVisibility(View.INVISIBLE);
        } else
            mMessageTextView.setVisibility(View.VISIBLE);

    }


}