package com.example.proyectomoviles.proyecto.login.layouts.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectomoviles.R
import com.example.proyectomoviles.proyecto.login.layouts.viewmodel.LoginViewModel
import kotlinx.coroutines.launch


@Composable
fun InicioDeSesionScreen(viewModel: LoginViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {

        LoginContent(Modifier.align(Alignment.Center),viewModel)
    }
}


@Composable
fun LoginContent(modifier: Modifier, viewModel: LoginViewModel) {

   // var email by remember { mutableStateOf("") }
    //var password by remember { mutableStateOf("") }
    val email : String by viewModel.email.observeAsState(initial = "")
    val password : String by viewModel.password.observeAsState(initial = "")
    val loginEnable : Boolean by viewModel.loginEnable.observeAsState(initial = false)
    val isLoading: Boolean by viewModel.isLoading.observeAsState(initial = false)
    val coroutineScope = rememberCoroutineScope()

    if (isLoading) {
        Box(Modifier.fillMaxSize()) {
            CircularProgressIndicator(Modifier.align(Alignment.Center))
        }

    } else {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            HeaderImage()
            Spacer(modifier = Modifier.height(32.dp))


            EmailField(email,{viewModel.onLoginChanged(it, password)}

            )
            Spacer(modifier = Modifier.height(16.dp))


            PasswordField(password) {viewModel.onLoginChanged(email, it)}
            Spacer(modifier = Modifier.height(24.dp))


            LoginButton(loginEnable) {
                coroutineScope.launch {
                    viewModel.onLoginSelected()}
                }
            }

            Spacer(modifier = Modifier.height(24.dp))


            LoginDivider()
            Spacer(modifier = Modifier.height(24.dp))


            RegisterButton()
        }

    }




@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.logo_carita),
        contentDescription = "Imagen de perfil",
        modifier = Modifier.clip(RoundedCornerShape(50))
    )
}

@Composable
fun EmailField(email: String, onTextFieldChanged: (String) -> Unit) {
    TextField(
        value = email, onValueChange = { onTextFieldChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Usuario / Correo", color = Color(0xFFA9A99E)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        shape = RoundedCornerShape(12.dp),
        colors = TextFieldDefaults.colors(

            unfocusedTextColor = Color.Black,
            unfocusedContainerColor = Color(0xFFE8E8D8),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
//Te amo Vianney, vuelve te extraño!
@Composable
fun PasswordField(password: String, onTextFieldChanged: (String) -> Unit) {
    TextField(
        value = password, onValueChange = {onTextFieldChanged(it)},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Contraseña", color = Color(0xFFA9A99E)) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        shape = RoundedCornerShape(12.dp),
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Black,
            unfocusedContainerColor = Color(0xFFE8E8D8),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun LoginButton(loginEnable: Boolean, onLoginSelected: () -> Unit) {
    Button(
        onClick = { onLoginSelected() },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6A8A61),
            contentColor = Color.White
        ), enabled = loginEnable
    ) {
        Text("Iniciar Sesión", fontSize = 18.sp)
    }
}

@Composable
fun RegisterButton() {
    OutlinedButton(
        onClick = { /* TODO: Lógica para ir a la pantalla de registro */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color(0xFFE8E8D8)
        ),
        border = null
    ) {
        Text("Registrarse", fontSize = 18.sp, color = Color(0xFF6A8A61))
    }
}

@Composable
fun LoginDivider() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Divider(
            modifier = Modifier.weight(1f),
            color = Color.LightGray,
            thickness = 1.dp
        )
        Text(
            text = "o",
            modifier = Modifier.padding(horizontal = 18.dp),
            color = Color.Gray
        )
        Divider(
            modifier = Modifier.weight(1f),
            color = Color.LightGray,
            thickness = 1.dp
        )
    }
}


/*@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InicioDeSesionPreview() {

    InicioDeSesionScreen()
} */