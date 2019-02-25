package frasedodia.wton.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textoNovaFase;
    private String[] frases = {
            "Se a vida te der limões, mande ela enfiar no rabo",
            "de vagar se vai a pé",
            "mas vale um pássaro na mão do que uma sogra chata morando com você",
            "cavalo dado não se aceita",
            "Deus ajuda quem cedo nasce rico",
            "É dando que se fica pobre",
            "Escreveu não leu, virou presidente do Brasil",
            "Um dia é da caça o outro também",
            "Quem com ferro fere, provavelmente vai pra cadeia",
            "Caiu na rede, penalty pro Corinthians"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = (Button) findViewById(R.id.botaoID);
        textoNovaFase = (TextView) findViewById(R.id.fraseID);



        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int aleatorio = randomico.nextInt(frases.length);

                textoNovaFase.setText(frases[aleatorio]);
            }
        });
    }
}
