package br.com.mobile.manualdexadrez

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*

class PecasXadrezActivity : DebugActivity() {

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pecas_xadrez)


        supportActionBar?.title = "Peças"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}