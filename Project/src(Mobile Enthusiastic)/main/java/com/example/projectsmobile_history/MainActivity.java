/* package com.example.projectsmobile_history;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listview);





    final ArrayList<String> arrayList=new ArrayList<>();


        arrayList.add("android");
                arrayList.add("is");
                arrayList.add("great");
                arrayList.add("and I love it");
                arrayList.add("It");
                arrayList.add("is");
                arrayList.add("better");
                arrayList.add("then");
                arrayList.add("many");
                arrayList.add("other");
                arrayList.add("operating system.");
                arrayList.add("android");
                arrayList.add("is");
                arrayList.add("great");
                arrayList.add("and I love it");
                arrayList.add("It");
                arrayList.add("is");
                arrayList.add("better");
                arrayList.add("then");
                arrayList.add("many");
                arrayList.add("other");
                arrayList.add("operating system.");

                ArrayAdapter arrayAdapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

                listView.setAdapter(arrayAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
                {
                @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
                {
                    Toast.makeText(MainActivity.this,"clicked item:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
                }
        });
}
} */
package com.example.projectsmobile_history;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    String list_item[] = { "Apple", "Huawei", "Samsung","Sony","Google","OnePlus","Exit" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, list_item);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
               /* if(position==0)
                {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } */
                if(position==0)
                {
                    startActivity(new Intent(getApplicationContext(),Apple.class));
                }
                else if(position==1)
                {
                    startActivity(new Intent(getApplicationContext(),Huawei.class));
                }
                else if(position==2)
                {
                    startActivity(new Intent(getApplicationContext(),Samsung.class));
                }
                else if(position==3)
                {
                    startActivity(new Intent(getApplicationContext(),Sony.class));
                }
                else if(position==4)
                {
                    startActivity(new Intent(getApplicationContext(),Google.class));
                }
                else if(position==5)
                {
                    startActivity(new Intent(getApplicationContext(),OnePlus.class));
                }
                else if(position==6)
                {
                    finish();
                }
            }
        });
    }

}
