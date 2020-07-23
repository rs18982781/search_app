package com.example.searchapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] Names = new String[]{
            "Myra", "Miksha", "Eshita", "Tiya", "Mahika","Aaditri","Eeshani ","Aarohi","Eesha","Archana","Devaki","Leela","Kshipra","Nandini","Pavana","Richa","Sadhana","Shruti","Upasna","Vaishanavi","Vedanti","Aaradhya","Aashirya","Qasim"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] names = getResources().getStringArray(R.array.names);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, names);
        editText.setAdapter(adapter);
        editText.setThreshold(1);


    }
}
