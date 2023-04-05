package silva.oliveira.maria.daianny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //criando a classe que herda os valores da classe AppCompatActivity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //variável do tipo botão que está na interface
        btnEnviar.setOnClickListener(new View.OnClickListener() { //ouvidor de clicks
            @Override
            public void onClick(View view) { //metodo acionado assim que o ouvidor for ativado
                EditText etTexto = findViewById(R.id.etDigiteAqui); //variavel do tipo texto
                String textoDigitado = etTexto.getText().toString(); //cria uma string que recebe o get do etDigiteAqui


                Intent i = new Intent(MainActivity.this,ProximoActivity.class); //variável criada para passar o texto do mainActivity para o ProximoActivity

                i.putExtra("texto", textoDigitado);


                startActivity(i); //inicia a ação
                
            }
        });
    }
}