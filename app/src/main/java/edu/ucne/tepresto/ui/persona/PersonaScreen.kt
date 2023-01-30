package edu.ucne.tepresto.ui.persona

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.hilt.navigation.compose.hiltViewModel
import edu.ucne.tepresto.ui.ocupacion.OcupacionViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonaScreen( ) {
    var nombre by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }

    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Column(Modifier.align(Alignment.Center)) {
            Text(text = "Registro de Personas",
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp)
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = nombre,
                onValueChange = {nombre = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                label = { Text("Nombres") }
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = telefono,
                onValueChange = {telefono = it  },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                label = { Text("Telefono") }
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = celular,
                onValueChange = {celular = it  },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                label = { Text("Celular") }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = email,
                onValueChange = {email = it  },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                label = { Text("Email") }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = direccion,
                onValueChange = {direccion = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                label = { Text("Dirección") }
            )

            ExtendedFloatingActionButton(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text= { Text("Guardar") },
                icon = { Icon(imageVector = Icons.Filled.Save, contentDescription = "Save") },
                onClick = {  }
            )
        }
    }
}
