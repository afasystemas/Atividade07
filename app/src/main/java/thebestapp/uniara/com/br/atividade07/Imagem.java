package thebestapp.uniara.com.br.atividade07;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Imagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem);

        Intent intent = getIntent();
        int altura = intent.getIntExtra("altura", 1);
        int largura = intent.getIntExtra("largura", 1);

//        Toast.makeText(this," valor 1 = "+altura,Toast.LENGTH_SHORT).show();

        ImageView minhaImagem = (ImageView)findViewById(R.id.minhaimagem);

        minhaImagem.setImageResource(R.drawable.image);

        minhaImagem.getLayoutParams().width = largura;
        minhaImagem.getLayoutParams().height = altura;


//
//        setContentView(minhaImagem);
    }
}
