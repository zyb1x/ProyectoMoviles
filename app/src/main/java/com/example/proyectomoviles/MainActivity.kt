package com.example.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectomoviles.proyecto.inicio.ui.BotonesOrdenados
import com.example.proyectomoviles.proyecto.login.layouts.ui.InicioDeSesionScreen
import com.example.proyectomoviles.proyecto.login.layouts.viewmodel.LoginViewModel
import com.example.proyectomoviles.proyecto.registro.ui.RegistroScreen
import com.example.proyectomoviles.proyecto.registro.viewmodel.RegistroViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

          //  InicioDeSesionScreen(LoginViewModel())
           //  RegistroScreen(RegistroViewModel())
            BotonesOrdenados()

            }
        }
    }




