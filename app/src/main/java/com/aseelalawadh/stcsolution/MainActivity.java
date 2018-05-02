package com.aseelalawadh.stcsolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text_solution);
        String input ="joinUs";
        char [] word = input.toCharArray();
        int length = input.length();
        textView.setText(word.length +"");
        for (int i=0; i<length; i++){
            for (int j=i+1 ; j<length; j++){
                if (word[j] < word[i]){
                    char temp = word[i];
                    word[i] = word[j] ;
                    word[j] = temp ;
                }
            }
        }

        String email = String.valueOf(word);
        email = email+"@stcs.com.sa";
        textView.setText(email);
    }
}

