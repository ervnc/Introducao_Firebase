package com.example.introducao_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference BD = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference usuarios = BD.child("usuarios");

        Usuario u1 = new Usuario("Teste", "teste1", 18);
        Usuario u2 = new Usuario("Teste2", "teste3", 17);

        usuarios.child("001").setValue(u1);
        usuarios.child("002").setValue(u2);
    }
}