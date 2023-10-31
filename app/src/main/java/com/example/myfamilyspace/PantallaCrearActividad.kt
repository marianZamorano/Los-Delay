package com.example.myfamilyspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfamilyspace.databinding.ActivityPantallaCrearActividadBinding
import com.example.myfamilyspace.fragment.DatePickerFragmentCrearActividad
import com.example.myfamilyspace.fragment.TimePickerFragmentHoraFinalCrearAtividad
import com.example.myfamilyspace.fragment.TimePickerFragmentHoraInicialCrearAtividad

class PantallaCrearActividad : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaCrearActividadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaCrearActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.editTextFechaCrearActividad.setOnClickListener { mostrarDatePickerDialog() }
        binding.editTextHoraInicial.setOnClickListener { mostrarTimePickerDialogHoraInicial() }
        binding.editTextHoraFinal.setOnClickListener { mostrarTimePickerDialogHoraFinal() }
    }

    private fun mostrarTimePickerDialogHoraInicial() {
        val timePicker = TimePickerFragmentHoraInicialCrearAtividad {onTimeSelectedHoraInicial(it)}
        timePicker.show(supportFragmentManager, "timeInitial")
    }

    private fun mostrarTimePickerDialogHoraFinal() {
        val timePicker = TimePickerFragmentHoraFinalCrearAtividad {onTimeSelectedHoraFinal(it)}
        timePicker.show(supportFragmentManager, "timeFinal")
    }

    private fun onTimeSelectedHoraInicial(tiempoInicial: String){
        binding.editTextHoraInicial.setText("$tiempoInicial")
    }

    private fun onTimeSelectedHoraFinal(tiempoFinal: String){
        binding.editTextHoraFinal.setText("$tiempoFinal")
    }

    private fun mostrarDatePickerDialog() {
        val datePicker = DatePickerFragmentCrearActividad { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day: Int, month: Int, year: Int) {
        binding.editTextFechaCrearActividad.setText("$day/$month/$year")
    }
}