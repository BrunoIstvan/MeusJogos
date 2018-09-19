package bicmsystems.com.br.meusjogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import bicmsystems.com.br.meusjogos.adapter.JogoAdapter
import bicmsystems.com.br.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)
        rvMeusJogos.adapter = JogoAdapter(this, jogos(), { jogo ->

            //Toast.makeText(this, "Jogo clicado: ${jogo.titulo}", Toast.LENGTH_LONG).show()

            //val intent = Intent(this@ListaJogosActivity, DetalheJogoActivity::class.java)
            val intent = Intent(this@ListaJogosActivity, DetalheActivity::class.java)
            //val intent = Intent(this@ListaJogosActivity, DetalheJogoActivity::class.java)
            //intent.putExtra("TITULO", jogo.titulo)
            //intent.putExtra("RESOURCEID", jogo.resourceId)
            //intent.putExtra("ANOLANCAMENTO", jogo.anoLancamento)
            //intent.putExtra("DESCRICAO", jogo.descricao)

            intent.putExtra("JOGO", jogo)

            startActivity(intent)

        })

        //Grid
        //val layoutManager = GridLayoutManager(this, 2)
        //Grade escalonável
        /*
        val layoutManager = StaggeredGridLayoutManager(
                        2, StaggeredGridLayoutManager.VERTICAL)
        */
        //Lista na horizontal
        /*
        val layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        */

        val layoutManager = LinearLayoutManager(this)
        rvMeusJogos.layoutManager = layoutManager
    }

    private fun jogos(): List<Jogo> {

        return listOf(

                Jogo(R.drawable.god_of_war,
                        "God of War",
                        2018,
                        "God of War é um jogo eletrônico."),
                Jogo(R.drawable.call_of_duty_3,
                        "Call of Duty 3",
                        2007,
                        "Nota 8"),
                Jogo(R.drawable.call_of_duty_5,
                        "Call of Duty 5",
                        2010,
                        "Jogo Nota 9"),
                Jogo(R.drawable.call_of_duty_modern_warfare,
                        "Call of Duty - Modern Warfare",
                        2012,
                        "Jogo Nota 10"),
                Jogo(R.drawable.call_of_duty_infinite_warfare,
                        "Call of Duty - Infinite Warfare",
                        2016,
                        "Jogo Nota 7"),
                Jogo(R.drawable.uncharted_drakes_fortune,
                        "Uncharted - Drakes Fortune",
                        2009,
                        "Jogo Nota 9"),
                Jogo(R.drawable.uncharted_2,
                        "Uncharted 2 - Among Thieves",
                        2012,
                        "Jogo Nota 9"),
                Jogo(R.drawable.uncharted_3,
                        "Uncharted 3 - Drake's Deception",
                        2014,
                        "Jogo Nota 10"),
                Jogo(R.drawable.call_of_duty_ghosts,
                        "Call of Duty - Ghosts",
                        2014,
                        "Jogo Nota 9"),
                Jogo(R.drawable.killzone_2,
                        "Killzone 2",
                        2010,
                        "Jogo Nota 8"),
                Jogo(R.drawable.killzone_3,
                        "Killzone 3",
                        2014,
                        "Jogo Nota 10"),
                Jogo(R.drawable.god_of_war3,
                        "God of War 3",
                        2011,
                        "Jogo Nota 9"),
                Jogo(R.drawable.mortal_kombat_x,
                        "Mortal Kombat",
                        2013,
                        "A jogar"),
                Jogo(R.drawable.darkness_2,
                        "Darkness 2",
                        2014,
                        "A jogar")


        )

    }

}
