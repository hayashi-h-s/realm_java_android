package com.haya.realmjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyAplication";

    EditText name, age;
    TextView index;
    Button saveButton;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        saveButton = findViewById(R.id.saveButton);
        index = findViewById(R.id.index);

        Log.d(TAG, "onCreate: View Initialization done");

            realm.beginTransaction();
        realm.deleteAll();
        realm.commitTransaction();

    }
}