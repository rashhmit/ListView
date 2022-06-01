package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    ListView l1;
    String lang[] =
            {"Android","Java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails"};
    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<>(this,R.layout.activity_listview,R.id.text_view,lang);
        l1.setAdapter(arrayAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(getApplicationContext(),
                        "Selected View is "+lang[i],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}


