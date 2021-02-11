package com.sae.taller.ejemplo2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    //Propiedades o variables
    val contador:Int = 0
    val estatura:Float = 1.89f
    val nombre:String = "Lalo Landa"
    val igURL:String = "http://www.instagram.com/lalo"
    val githubURL:String = "https://github.com/paquito"
    val emailURL:String = "mailto:f.mandujano@saei.mx"




    //funciones o métodos
    fun suma( A:Float, B:Float):Float
    {
        return A+B
    }

    fun cambiarNombre( nuevoNombre:String )
    {
        val textview:TextView = findViewById(R.id.titulo)
        textview.text = nuevoNombre
    }




    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //comentario
        //Log.d( "MiApp", "Resultado " + suma( 99.9f, 0.1f)     )
        //cambiarNombre(nombre)

        //referencia a los botones
        //val btnIg:Button = findViewById(R.id.buttonIG)
        //val btnEmail:Button = findViewById(R.id.buttonEmail)
        //val btnGithub:Button = findViewById(R.id.buttonGithub)

        //modificar el comportamiento al hacer click
        /*
        btnIg.setOnClickListener {
            Log.d("MiApp", "Abriendo instagram del usuario")

            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(igURL)))
        }

        btnEmail.setOnClickListener {
            Log.d("MiApp", "Abriendo correo")
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(emailURL)))
        }

         */




    }
}