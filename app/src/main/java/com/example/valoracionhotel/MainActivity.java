package com.example.valoracionhotel;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de RatingBar
    RatingBar rbPersonal, rbInstalaciones, rbServicios, rbLimpieza, rbConfort, rbCalidadPrecio, rbUbicacion;

    // Declaración de TextView para las valoraciones
    TextView txtValoracionPersonal;
    TextView txtValoracionInstalaciones;
    TextView txtValoracionServicios;
    TextView txtValoracionLimpieza;
    TextView txtValoracionConfort;
    TextView txtValoracionCalidadPrecio;
    TextView txtValoracionUbicacion;

    // Declaración de TextView para la valoración media
    TextView txtValoracionMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancia de RatingBar
        rbPersonal = findViewById(R.id.rbPersonal);
        rbInstalaciones = findViewById(R.id.rbInstalaciones);
        rbServicios = findViewById(R.id.rbServicios);
        rbLimpieza = findViewById(R.id.rbLimpieza);
        rbConfort = findViewById(R.id.rbConfort);
        rbCalidadPrecio = findViewById(R.id.rbCalidadPrecio);
        rbUbicacion = findViewById(R.id.rbUbicacion);

        // Instancia de TextView para las valoraciones
        txtValoracionPersonal = findViewById(R.id.txtValoracionPersonal);
        txtValoracionInstalaciones = findViewById(R.id.txtValoracionInstalaciones);
        txtValoracionServicios = findViewById(R.id.txtValoracionServicios);
        txtValoracionLimpieza = findViewById(R.id.txtValoracionLimpieza);
        txtValoracionConfort = findViewById(R.id.txtValoracionConfort);
        txtValoracionCalidadPrecio = findViewById(R.id.txtValoracionCalidadPrecio);
        txtValoracionUbicacion = findViewById(R.id.txtValoracionUbicacion);

        // Instancia de TextView para la valoración media
        txtValoracionMedia = findViewById(R.id.txtValoracionMedia);

        // Listener para cada RatingBar
        rbPersonal.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(1));
        rbInstalaciones.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(2));
        rbServicios.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(3));
        rbLimpieza.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(4));
        rbConfort.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(5));
        rbCalidadPrecio.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(6));
        rbUbicacion.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> setValoraciones(7));

        // Vinculación y Listener para el Button Nueva Valoración
        findViewById(R.id.btnNuevaValoracion).setOnClickListener(v -> reiniciarValoraciones());
    }

    // Método para asignar el contenido a los TextView de cada RatingBar
    protected void setValoraciones (int valoracionId){

        switch (valoracionId){
            case 1:
                txtValoracionPersonal.setText(String.format("%d", (int)rbPersonal.getRating()));
                break;
            case 2:
                txtValoracionInstalaciones.setText(String.format("%d", (int)rbInstalaciones.getRating()));
                break;
            case 3:
                txtValoracionServicios.setText(String.format("%d", (int)rbServicios.getRating()));
                break;
            case 4:
                txtValoracionLimpieza.setText(String.format("%d", (int)rbLimpieza.getRating()));
                break;
            case 5:
                txtValoracionConfort.setText(String.format("%d", (int)rbConfort.getRating()));
                break;
            case 6:
                txtValoracionCalidadPrecio.setText(String.format("%d", (int)rbCalidadPrecio.getRating()));
                break;
            case 7:
                txtValoracionUbicacion.setText(String.format("%d", (int)rbUbicacion.getRating()));
                break;
        }
        txtValoracionMedia.setText(String.format("%.2f", calcularValoracionMedia()));
    }

    // Método para calcular la valoración media
    protected float calcularValoracionMedia(){
        float valoracionMedia;
        valoracionMedia = (rbPersonal.getRating()
                            + rbInstalaciones.getRating()
                            + rbServicios.getRating()
                            + rbLimpieza.getRating()
                            + rbConfort.getRating()
                            + rbCalidadPrecio.getRating()
                            + rbUbicacion.getRating())
                            / 7;
        return valoracionMedia;
    }

    // Método para devolver todas las valoraciones a 0
    protected void reiniciarValoraciones(){
        rbPersonal.setRating(0);
        rbInstalaciones.setRating(0);
        rbServicios.setRating(0);
        rbLimpieza.setRating(0);
        rbConfort.setRating(0);
        rbCalidadPrecio.setRating(0);
        rbUbicacion.setRating(0);

        txtValoracionMedia.setText("0.0");
    }
}