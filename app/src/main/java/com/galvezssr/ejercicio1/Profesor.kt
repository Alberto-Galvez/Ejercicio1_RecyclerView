package com.galvezssr.ejercicio1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Profesor(val nombre: String, val urlImg: String, val telefono: Int, val email: String): Parcelable
