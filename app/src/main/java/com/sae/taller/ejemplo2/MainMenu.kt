package com.sae.taller.ejemplo2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.main_menu.*
import kotlinx.android.synthetic.main.main_menu.view.*

/*
    Esto es el controlador de la pantalla del menú principal
 */
class MainMenu : Fragment()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val vista : View

        vista = inflater.inflate(R.layout.main_menu, container, false)


        //asignar la acción del botón
        vista.btnLogros.setOnClickListener {
            Log.d("MiApp", "clic o tap en boton de logros")
            findNavController().navigate(R.id.action_mainMenu_to_logros)
        }

        vista.btnEducacion.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_formationFragment)
        }

        vista.btnPortfolio.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_portfolioFragment)
        }

        vista.btnTrabajos.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_placeholder_trabajos)
        }



        vista.btnContacto.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenu_to_contactFragment)
        }

        //asignar el layout a este controlador
        // Inflate the layout for this fragment
        return vista
    }

    fun suma( a: Float, b: Float ) : Float
    {
        return a + b
    }

}