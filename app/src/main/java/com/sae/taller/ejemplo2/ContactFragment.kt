package com.sae.taller.ejemplo2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//para importar las propiedades definidas en el xml
import kotlinx.android.synthetic.main.fragment_contact.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val myView:View
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_contact, container, false)

        myView.btnEmail.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse( resources.getString( R.string.contact_email  ) )))

        }

        myView.btnTwitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse( resources.getString( R.string.contact_tw) )))
        }

        myView.btnFabebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse( resources.getString( R.string.contact_fb) )))
        }

        myView.btnInstagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse( resources.getString( R.string.contact_ig) )))
        }

        myView.btnClubhouse.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse( resources.getString( R.string.contact_clubhouse) )))
        }

        myView.btnTelephone.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse(resources.getString(R.string.contact_phone))))
        }

        return myView
    }


}