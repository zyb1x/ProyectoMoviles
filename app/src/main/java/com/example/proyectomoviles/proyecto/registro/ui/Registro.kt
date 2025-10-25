package com.example.proyectomoviles.proyecto.registro.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.proyectomoviles.R
import com.example.proyectomoviles.proyecto.registro.viewmodel.RegistroViewModel
import com.example.proyectomoviles.ui.theme.LightGreen
import com.example.proyectomoviles.ui.theme.MediumGreen

@Composable
fun RegistroScreen(viewModel: RegistroViewModel) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxguardar, btonRegresar, imgFondo) = createRefs()

        val nombre: String by viewModel.nombre.observeAsState(initial = "")
        val correo: String by viewModel.correo.observeAsState(initial = "")
        val contrasenia: String by viewModel.contrasenia.observeAsState(initial = "")
        val confirmarContrasenia: String by viewModel.confirmarContrasenia.observeAsState(initial = "")
        val domicilio: String by viewModel.domicilio.observeAsState(initial = "")
        val telefono: String by viewModel.telefono.observeAsState(initial = "")
        val registroEnable: Boolean by viewModel.registroEnable.observeAsState(initial = false)

        fun Modifier.textFieldTamaño() = this
            .fillMaxWidth()
            .height(60.dp)

        Image(
            painter = painterResource(id = R.drawable.logo_carita),
            contentDescription = "Fondo de pantalla",
            modifier = Modifier
                .size(130.dp)
                .constrainAs(imgFondo) {
                    top.linkTo(parent.top, margin = 50.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(800.dp)
                .constrainAs(boxguardar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 55.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(200.dp))

                OutlinedTextField(
                    value = nombre,
                    onValueChange = { viewModel.onNombreChanged(it) },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Nombre(s)") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = correo,
                    onValueChange = { viewModel.onCorreoChanged(it) },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Correo") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = contrasenia,
                    onValueChange = { viewModel.onContraseniaChanged(it) },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Contraseña") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = confirmarContrasenia,
                    onValueChange = { viewModel.onConfirmarContraseniaChanged(it) },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Confirmar Contraseña") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = domicilio,
                    onValueChange = { viewModel.onDomicilioChanged(it) },  //wtf mejor junto latas ya me buguie
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Domicilio") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = telefono,
                    onValueChange = { viewModel.onTelefonoChanged(it) },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(fontSize = 19.sp),
                    label = { Text("Teléfono") }
                )

                Spacer(modifier = Modifier.height(25.dp))

                Button(
                    onClick = { /* viewModel.onRegisterSelected() */ },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(48.dp)
                        .align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MediumGreen,
                        contentColor = LightGreen
                    ),

                    enabled = registroEnable

                ) {
                    Text(text = "Registrarse", fontSize = 18.sp)
                }
            }
        }

        Button(
            onClick = { /* logica par regresar */ },
            modifier = Modifier
                .width(159.dp)
                .height(45.dp)
                .constrainAs(btonRegresar) {
                    start.linkTo(parent.start, margin = 25.dp)
                    bottom.linkTo(parent.bottom, margin = 30.dp)
                },
            colors = ButtonDefaults.buttonColors(
                containerColor = LightGreen,
                contentColor = MediumGreen
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "◀ Iniciar Sesión", fontSize = 15.sp)
        }



    }
}


