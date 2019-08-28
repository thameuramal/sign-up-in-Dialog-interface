import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText email , password;
Button connex ;
TextView newcompte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        connex=findViewById(R.id.login);
        newcompte=findViewById(R.id.creecompte);
        connex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog();
            }
        });
    }

    private void openDialog() {
       NewCompte creeCompte= new NewCompte();
        creeCompte.show(getSupportFragmentManager(),"exemple dialoge");
    }
}
