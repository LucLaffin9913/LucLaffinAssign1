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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class LucActivity extends AppCompatActivity {
    protected Button lucB2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lucB2 = (Button) findViewById(R.id.lucB2);
        lucB2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText inputText = (EditText) findViewById(R.id.lucET);
                String text = inputText.getText().toString();
                Intent intent2 = new Intent(view.getContext(), LaffinActivity.class);
                intent2.putExtra("inputText", text);
                startActivity(intent2);


            }
        });
    }

    public void buttonClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.lucB1:
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toast_text);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.data-drivenstrength.com"));
                startActivity(intent);
                break;

            case R.id.lucB2:
                CharSequence text2 = getString(R.string.snackbar_text);
                Snackbar.make(view, text2, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            default:
                break;
        }
    }
}