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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.proyectomoviles.R
import com.example.proyectomoviles.ui.theme.LightGreen
import com.example.proyectomoviles.ui.theme.MediumGreen

@Composable

fun DatosUsuario() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxguardar, btonRegresar, imgFondo) = createRefs()


        var nombre by remember {
            mutableStateOf("")
        }

        var correo by remember {
            mutableStateOf("")
        }

        var contrasenia by remember {
            mutableStateOf("")
        }

        var confirmarContrasenia by remember {
            mutableStateOf("")
        }

        var domicilio by remember {
            mutableStateOf("")
        }

        var telefono by remember {
            mutableStateOf("")
        }


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
            modifier = Modifier.fillMaxWidth().height(900.dp)
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
                    .padding(horizontal = 55.dp), //espacio de los costados
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Spacer(modifier = Modifier.height(200.dp))

                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = { Text("Nombre(s)") }
                )


                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = correo,
                    onValueChange = { correo = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = { Text("Correo") }
                )


                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = contrasenia,
                    onValueChange = { contrasenia = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = { Text("Contraseña") }
                )


                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = confirmarContrasenia,
                    onValueChange = { confirmarContrasenia = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = { Text("Confirmar Contraseña"
                        //aqui va color
                    )}
                )


                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = domicilio,
                    onValueChange = { domicilio = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = {
                        Text("Domicilio") }
                )


                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = telefono,
                    onValueChange = { telefono = it },
                    modifier = Modifier.textFieldTamaño(),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 19.sp
                    ),
                    label = {
                        Text("Teléfono") }
                )

                Spacer(modifier = Modifier.height(25.dp))

                Button(
                    onClick = { /* logica del boton */ },
                    modifier = Modifier.textFieldTamaño()
                        .align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MediumGreen,
                        contentColor = LightGreen
                    )

                ) {
                    Text(text = "Registrarse", fontSize = 18.sp)
                }
                @Composable
                fun LogoAplicacion2(){
                    Image(
                        painter = painterResource(id = R.drawable.logo_carita),
                        contentDescription = "Logo de la aplicacion",
                        modifier = Modifier.size(150.dp)
                    )
                }
            }
        }

        Button(
            onClick = { /* logica del boton */ },
            modifier = Modifier
                .width(159.dp)
                .height(45.dp)
                .constrainAs(btonRegresar) {
                    start.linkTo(parent.start, margin = 25.dp)
                    bottom.linkTo(parent.bottom, margin = 70.dp)
                },colors = ButtonDefaults.buttonColors(
                containerColor = LightGreen,
                contentColor = MediumGreen),
                shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "◀ Iniciar Sesión", fontSize = 15.sp)
        }




    }
}

