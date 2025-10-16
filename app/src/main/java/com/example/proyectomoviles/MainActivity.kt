package com.example.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectomoviles.layouts.BotonesOrdenados
import com.example.proyectomoviles.layouts.DatosUsuario
import com.example.proyectomoviles.layouts.IniciarSesionBtn
import com.example.proyectomoviles.layouts.InicioDeSesionPreview
import com.example.proyectomoviles.layouts.LogoAplicacion
import com.example.proyectomoviles.ui.theme.ProyectoMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //InicioDeSesionPreview()
             DatosUsuario()
            //BotonesOrdenados()

            }
        }
    }




