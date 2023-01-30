package edu.ucne.tepresto.ui.ocupacion

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OcupacionScreen( viewModel: OcupacionViewModel = hiltViewModel()) {
    var descripcion by remember { mutableStateOf("") }
    var sueldo by remember { mutableStateOf("") }

    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Column(Modifier.align(Alignment.Center)) {
            Text(text = "Registro de Ocupaciones",
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp))
            
            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = descripcion,
                onValueChange = { descripcion = it },
                label = { Text("Descripción") }
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                value = sueldo,
                onValueChange = { sueldo = it },
                label = { Text("Salario") }
            )

            ExtendedFloatingActionButton(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text= { Text("Guardar") },
                icon = { Icon(imageVector = Icons.Filled.Save, contentDescription = "Save") },
                onClick = { viewModel.insertar(descripcion, sueldo) }
            )
        }
    }
}

