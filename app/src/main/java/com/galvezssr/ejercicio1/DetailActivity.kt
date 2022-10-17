package com.galvezssr.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.galvezssr.ejercicio1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {const val EXTRA_PROFESOR = "profe"}

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityDetailBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val profesor = intent?.getParcelableExtra<Profesor>(EXTRA_PROFESOR) ?: throw
        IllegalStateException()

        supportActionBar?.title = profesor.nombre

        binding.nombreProfesor.text = profesor.nombre
        Glide.with(binding.imageView).load(profesor.urlImg).into(binding.imageView)
    }
}