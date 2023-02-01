package edu.ucne.tepresto.ui.persona

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.tepresto.data.local.entity.PersonaEntity
import edu.ucne.tepresto.data.repository.PersonaRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonaViewModel @Inject constructor(
    private val personaRepository: PersonaRepository
) : ViewModel() {

    fun insertar(
        nombres: String,
        telefono: String,
        celular: String,
        email: String,
        direccion: String
    ) {

        val persona = PersonaEntity(
            nombres = nombres,
            telefono = telefono,
            celular = celular,
            email = email,
            direccion = direccion
        )

        viewModelScope.launch {
            personaRepository.insert(persona)
        }
    }
}