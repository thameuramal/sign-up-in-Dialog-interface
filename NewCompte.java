import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class NewCompte extends AppCompatDialogFragment {
    EditText nom , prenom ,telephone, cin,password , mail;
    ExempleDialogListener exempleDialogListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();

        View view=inflater.inflate(R.layout.comptelayout,null);
        builder.setView(view)
                .setTitle("NewCompte")
                .setNegativeButton("canncel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("okcree", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String prenom1=prenom.getText().toString();
                        String nom1=nom.getText().toString();
                        String cin1=cin.getText().toString();
                        String telephone1=telephone.getText().toString();
                        String password1=password.getText().toString();
                        String  mail1= mail.getText().toString();
                        exempleDialogListener.applyTexts(nom1,prenom1,telephone1,cin1,password1,mail1);

                    }
                });
        password = view.findViewById(R.id.motdepasse);
        mail = view.findViewById(R.id.email1);
        cin = view.findViewById(R.id.cin);
        telephone = view.findViewById(R.id.tele);
        nom = view.findViewById(R.id.nom);
        prenom= view.findViewById(R.id.prenom);
        password = view.findViewById(R.id.motdepasse);
        return  builder.create();

    }
    public  void onAttach(Context context) {

        super.onAttach(context);

        exempleDialogListener= (ExempleDialogListener) context;
    }
    public interface  ExempleDialogListener{
        void applyTexts(String nom , String prenom ,String telepohone,String cin, String password, String email );

    } }
