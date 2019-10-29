package latv.itics.tesoem.edu.calculadoralatv02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity {

     EditText opcionsuma;
     Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        opcionsuma = (EditText) findViewById(R.id.add);
        siguiente = (Button) findViewById(R.id.botonaction);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Check();
            }
        });



    }
 public void Check () {
     if (opcionsuma.getText().toString().equals("1")) {
         Intent siguiente = new Intent(MenuActivity.this, sumaActivity.class);
         startActivity(siguiente);
         Toast.makeText(this, "Seleccionaste opcion Suma", Toast.LENGTH_SHORT).show();
     }


     if (opcionsuma.getText().toString().equals("2")) {
         Intent siguiente = new Intent(MenuActivity.this, restaActivity.class);
         startActivity(siguiente);
         Toast.makeText(this, "Seleccionaste opcion Resta", Toast.LENGTH_SHORT).show();
     }


     if (opcionsuma.getText().toString().equals("3")) {
         Intent siguiente = new Intent(MenuActivity.this, multiplicacionActivity.class);
         startActivity(siguiente);
         Toast.makeText(this, "Seleccionaste opcion Multiplicacion", Toast.LENGTH_SHORT).show();
     }


     if (opcionsuma.getText().toString().equals("4")) {
         Intent siguiente = new Intent(MenuActivity.this, divisionActivity.class);
         startActivity(siguiente);
         Toast.makeText(this, "Seleccionaste opcion Division", Toast.LENGTH_SHORT).show();
     }
 }

     public void acercade (View v){
         Intent acerca = new Intent(MenuActivity.this, acercadeActivity.class);
         startActivity(acerca);
         finish();
     }




 }

