package com.example.eva.hilosjaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText IngresoLibro;
    private TextView autor,titulo;
    private Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IngresoLibro = (EditText) findViewById(R.id.bookInput);
        titulo = (TextView) findViewById(R.id.titleText);
        autor = (TextView) findViewById(R.id.authorText);
        buscar = (Button) findViewById(R.id.BTNbuscar);
    }

    public void searchBooks(){
        String queryString = IngresoLibro.getText().toString();
        new FetchBook(titulo, autor).execute((Runnable) IngresoLibro);
            }

}
