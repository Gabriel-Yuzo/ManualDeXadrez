package br.com.mobile.manualdexadrez

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()


        botao_login.setOnClickListener {onClickLogin() }

    }

    fun onClickLogin(){
        val valorUsuario = campo_usuario.text.toString()
        val valorSenha = campo_senha.text.toString()

        if (valorUsuario != "gabriel") {
            return Toast.makeText(context, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show()
        }

        if (valorSenha != "123456") {
            return Toast.makeText(context, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show()
        }


        val intent = Intent(context, TelaInicialActivity::class.java)


        startActivity(intent)

    }
}

