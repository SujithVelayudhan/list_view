package com.example.sujith.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class page1 extends AppCompatActivity {
    ListView listp;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        listp=findViewById(R.id.list);
        final ArrayList<String> mobiles=new ArrayList<>();

        ArrayAdapter<String> adapt=new ArrayAdapter<>
                (this,android.R.layout.simple_list_item_1,mobiles);
        mobiles.add("Samsung");
        mobiles.add("HTC");
        mobiles.add("Iphone");
        mobiles.add("Redmi");
        mobiles.add("Moto");

        listp.setAdapter(adapt);

        listp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String itemvalue=(String)listp.getItemAtPosition(position);
                Toast.makeText(page1.this, ""+mobiles.get(position), Toast.LENGTH_SHORT).show();

//                if (itemvalue=="Samsung")
//                {
//                    Toast.makeText(page1.this, "Samsung", Toast.LENGTH_SHORT).show();
//                }
//                else if (itemvalue=="HTC")
//                {
//                    Toast.makeText(page1.this, "HTC", Toast.LENGTH_SHORT).show();
//                }
//                else if (itemvalue=="Iphone")
//                {
//                    Toast.makeText(page1.this, "Iphone", Toast.LENGTH_SHORT).show();
//                }
//                else if (itemvalue=="Redmi")
//                {
//                    Toast.makeText(page1.this, "Redmi", Toast.LENGTH_SHORT).show();
//                }
//                else if (itemvalue=="Moto")
//                {
//                    Toast.makeText(page1.this, "Moto", Toast.LENGTH_SHORT).show();
//                }
            }
        });

    }
}
