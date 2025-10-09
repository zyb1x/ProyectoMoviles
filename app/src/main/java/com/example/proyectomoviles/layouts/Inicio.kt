package com.example.proyectomoviles.layouts



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectomoviles.R
import com.example.proyectomoviles.ui.theme.LightGreen
import com.example.proyectomoviles.ui.theme.MediumGreen
import com.example.proyectomoviles.ui.theme.ProyectoMovilesTheme


@Composable
fun LogoAplicacion(){
    Image(
        painter = painterResource(id = R.drawable.logo_carita),
        contentDescription = "Logo de la aplicacion",
        modifier = Modifier.size(150.dp)
    )

}

@Composable //texto de bienvenido
fun TextoBienvenido(){
    Text(text = "Bienvenidx",
        color = MediumGreen,
        fontSize = 45.sp,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun TextoCarita(){
    Text(text = ":)",
        modifier = Modifier
            .rotate(90f),
        color = MediumGreen,
        fontSize = 50.sp,
        fontWeight = FontWeight.SemiBold)
}

@Composable //Boton de iniciar sesion
fun IniciarSesionBtn(){
    ProyectoMovilesTheme {
    Button(onClick = { /*Accion del boton */}, modifier = Modifier
        .width(140.dp)
        .height(45.dp),

        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MediumGreen,
            contentColor = LightGreen
        )){
        Text(text = "Iniciar Sesión",
            fontSize = 15.sp)
    }
}}


@Composable //Boton de registrarse
fun RegistrarseBtn(){
    ProyectoMovilesTheme {
    Button(onClick = {}, modifier = Modifier
        .width(140.dp)
        .height(45.dp),
    shape = RoundedCornerShape(10.dp),
    colors = ButtonDefaults.buttonColors(
        containerColor = LightGreen,
        contentColor = MediumGreen)) {
        Text(text = "Registrarse",
            fontSize = 15.sp)
    }

}}

/*@Preview boton delineado
@Composable
fun BotonDelineado(){
    OutlinedButton(onClick = {} ) {
        Text("Aqui va texto")
    }
}*/

@Preview(name = "Claro")
//@Preview(name = "Oscuro", uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable //funcion para acomodar
fun BotonesOrdenados(){
    ProyectoMovilesTheme {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        LogoAplicacion()
        Spacer(modifier = Modifier.height(60.dp))
        TextoBienvenido()
        Spacer(modifier = Modifier.height(60.dp))
        TextoCarita()
    }

        Row(
            modifier = Modifier
                .padding(top = 600.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {

            IniciarSesionBtn()
            Spacer(modifier = Modifier.width(20.dp))
            RegistrarseBtn()
        }

}}