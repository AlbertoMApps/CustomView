package appexperts.alberto.com.customview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    MyView myView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn1);
        editText = (EditText) findViewById(R.id.et1);
        myView = (MyView) findViewById(R.id.myView1);
    }

    public void onClick(View view){
        String inputText = editText.getText().toString();
        Toast.makeText(getBaseContext(), inputText, Toast.LENGTH_SHORT).show();
        if (inputText!=null) {
            int temp = Integer.parseInt(inputText);
            myView.setTemp(temp);
        } else {
            Log.d("Error","Error of format, please insert a number");
        }
    }
}
