package com.phuhmtech.toaster

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}