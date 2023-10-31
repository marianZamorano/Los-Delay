package com.example.myfamilyspace

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import com.example.myfamilyspace.databinding.ActivityPantallaCrearActividadBinding
import com.example.myfamilyspace.fragment.DatePickerFragmentCrearActividad
import com.example.myfamilyspace.fragment.TimePickerFragmentHoraFinalCrearAtividad
import com.example.myfamilyspace.fragment.TimePickerFragmentHoraInicialCrearAtividad

class PantallaCrearActividad : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaCrearActividadBinding
//    private lateinit var preference: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaCrearActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.editTextFechaCrearActividad.setOnClickListener { mostrarDatePickerDialog() }
        binding.editTextHoraInicial.setOnClickListener { mostrarTimePickerDialogHoraInicial() }
        binding.editTextHoraFinal.setOnClickListener { mostrarTimePickerDialogHoraFinal() }
        binding.irAPantallaPrincipalBotonCrearActividad.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }
        binding.botonVolverAtrasCrearActividad.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalActividades::class.java)
            startActivity(intent)
        }
        binding.botonListoCrearActividad.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalActividades::class.java)
            startActivity(intent)
        }

//        managePreferences()
    }

//    private fun managePreferences() {
//        preference = PreferenceManager.getDefaultSharedPreferences(this)
//        val ID_EJEMPLO = "nuestro_id"
//        binding.botonListoCrearActividad.setOnClickListener {
//            val editor = preference.edit()
//            var savedData = onOptionsItemSelected()
//            editor.putString(ID_EJEMPLO, savedData)
//            editor.apply()
//
//        }
//        binding.buttonShow.setOnClickListener {
//            // para obtener los datos podemos darle un valor predeterminado por si este dato no se encuentra almacenado
//            val data = preference.getString(ID_EJEMPLO,"No hay nada")
//            binding.textSavedData.text = "Dato guardado $data"
//        }
//    }

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