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
import android.widget.Toast;

public class LucActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.lucB1:
                Context context = getApplicationContext();
                CharSequence text = "Opening Data Driven Strength website";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.data-drivenstrength.com"));
                startActivity(intent);
                break;
            case R.id.lucB2:

            default:
                break;
        }
    }
}