package silva.oliveira.maria.daianny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximo);

        Intent i = getIntent(); //variável criada onde está armazenado a intenção
        String textodigitado = i.getStringExtra("texto"); //acrescenta o valor da chave
        TextView tvTexto = findViewById(R.id.tvTexto); //recebe o ID da tvTexto que está na interface
        tvTexto.setText(textodigitado); //coloca o texto no tvTexto

    }
}