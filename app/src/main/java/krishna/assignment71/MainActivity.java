package krishna.assignment71;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinput = et1.getText().toString();
                if (userinput==null){
                    Log.e("MainActivity","userinput is null");
                    et1.setError("Enter a search ");
                    Toast.makeText(MainActivity.this,"input field null", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    intent.putExtra(SearchManager.QUERY, userinput);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "search result", Toast.LENGTH_SHORT).show();
                    Log.e("MainActivity", "" + userinput);
                }
            }
        });
    }
}


