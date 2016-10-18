package thebestapp.uniara.com.br.atividade07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        int altura = Integer.parseInt(altu);
//        final Integer largura = Integer.parseInt(larg);
//
        Button redirecionar = (Button)findViewById(R.id.botao);
        final EditText alturaStr = (EditText)findViewById(R.id.alturaEdit);
        final EditText larguraStr = (EditText) findViewById(R.id.larguraEdit);




        redirecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String altu = alturaStr.getText().toString();
                String larg = larguraStr.getText().toString();

                int altura = Integer.parseInt(altu);
                int largura = Integer.parseInt(larg);

                Intent intent  = new Intent(v.getContext(),Imagem.class);
                intent.putExtra("altura",altura);
                intent.putExtra("largura",largura);
                startActivity(intent);
    
            }
        });

    }
}
