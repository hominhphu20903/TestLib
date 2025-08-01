package com.phuhmtech.toaster

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showMessage(context: Context, message: String) {
        Toast.makeText(context, message + "lutech", Toast.LENGTH_LONG).show()
    }
}