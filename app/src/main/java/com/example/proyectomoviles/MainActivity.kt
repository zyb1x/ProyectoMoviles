package com.example.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectomoviles.layouts.DatosUsuario
import com.example.proyectomoviles.layouts.InicioDeSesionPreview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InicioDeSesionPreview()
             //DatosUsuario()
            //BotonesOrdenados()

            }
        }
    }




