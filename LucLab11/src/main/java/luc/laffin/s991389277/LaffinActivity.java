/*
Luc Laffin s991389277
Assignment 1 to demonstrate the use of
Activities and how to invoke 3rd party app
 */

package luc.laffin.s991389277;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LaffinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laffin);
        TextView textView = (TextView)findViewById(R.id.lucTV3);
        textView.setText(getIntent().getStringExtra("inputText"));
    }

    public void buttonClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.lucB3:
                intent = new Intent(this, LucActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}