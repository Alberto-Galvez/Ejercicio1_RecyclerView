package com.galvezssr.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galvezssr.ejercicio1.databinding.MainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = MainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recycler.adapter = AdapterProfesor(listOf(
            Profesor("Pedro Jurado", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.guns.com%2Fwordpress%2F2016%2F09%2FPepe-4.jpg&f=1&nofb=1&ipt=3172b07a738ded03a13f490a276de16c314e8f6c990e5ccc8eab780726e7a0fe&ipo=images", 987665432, "pjurado@gmail.com"),
            Profesor("Pepe Perez", "https://loremflickr.com/320/240", 985476321, "ppe@gmail.com"),
            Profesor("Antonio Gomex", "https://loremflickr.com/320/240", 978645132, "agox@gmail.com")
        )) { profesor ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PROFESOR, profesor)
            startActivity(intent)
        }

        /* Despues de pasarle la lista al adapter y la dibuje, establecemos una lamda con la que escuchar cuando hagamos click en uno de los
        * items del recycler */


    }
}