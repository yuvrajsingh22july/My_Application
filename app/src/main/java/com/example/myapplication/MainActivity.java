package com.example.myapplication;

import android.os.bundle;
import android.util.Log;
import android.view.veiw;

public class MainActivity extends AppCompatActivity {

    private String tag;

    public void clickbtn(veiw view){
        Log.i(tag:"this", msg:"clickbtn: This is a message");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
