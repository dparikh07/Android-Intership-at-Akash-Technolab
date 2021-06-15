package com.example.projectsmobile_history;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sony extends AppCompatActivity {
    private Button b1,b2;
    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        img1=(ImageView)findViewById(R.id.imageView);



        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                startActivity(link);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Sony.this,xperia5III.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Sony.this,XperiaPRO.class);
                startActivity(i2);
            }
        });

    }
}