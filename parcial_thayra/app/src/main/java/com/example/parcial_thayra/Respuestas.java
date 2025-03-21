package com.example.parcial_thayra;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Respuestas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        // Obtener referencias a los TextView
        TextView txtRespuesta1 = findViewById(R.id.txt_respuesta1);
        TextView txtRespuesta2 = findViewById(R.id.txt_respuesta2);
        TextView txtRespuesta3 = findViewById(R.id.txt_respuesta3);
        TextView txtRespuesta4 = findViewById(R.id.txt_respuesta4);
        TextView txtRespuesta5 = findViewById(R.id.txt_respuesta5);
        TextView txtRespuesta6 = findViewById(R.id.txt_respuesta6);
        TextView txtRespuesta7 = findViewById(R.id.txt_respuesta7);
        TextView txtRespuesta8 = findViewById(R.id.txt_respuesta8);

        // Mostrar respuestas en los TextView
        txtRespuesta1.setText("Pregunta 1: C");
        txtRespuesta2.setText("Pregunta 2: C");
        txtRespuesta3.setText("Pregunta 3: C");
        txtRespuesta4.setText("Pregunta 4: B");
        txtRespuesta5.setText("Pregunta 5: C");
        txtRespuesta6.setText("Pregunta 6: A");
        txtRespuesta7.setText("Pregunta 7: C");
        txtRespuesta8.setText("Pregunta 8: B");
    }
}
🔹 activity_respuestas.xml (Diseño de la pantalla de respuestas)
Si no lo tienes, créalo en res/layout/activity_respuestas.xml con el siguiente código:

xml
        Copiar
Editar
        <LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp">

    <TextView android:id="@+id/txt_respuesta1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 1:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 2:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 3:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 4:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta5"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 5:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta6"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 6:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta7"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 7:"
android:textSize="18sp"
android:padding="8dp" />

    <TextView android:id="@+id/txt_respuesta8"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Pregunta 8:"
android:textSize="18sp"
android:padding="8dp" />

</LinearLayout>