package demo.corsoits.com.corsoits;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import demo.corsoits.com.corsoits.models.usermodel;

public class MainActivity extends AppCompatActivity {

    // region Statics

    public static final String K_TXT_NUMBER = "kTextNumber";
    public static final String K_USER_MODELS = "kUserModels";
    public static final Integer K_REQUEST_1 = 1000;

    // endregion

    // region Variables

    private TextView mTextView;
    private EditText mEdit;
    private Button mBtnAction;

    // endregion

    // region Lifecycle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mTextView = (TextView)findViewById(R.id.textView3);
        this.mEdit = (EditText)findViewById(R.id.editTextNumber);
        this.mBtnAction = (Button) findViewById(R.id.btnAction);

        this.mBtnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBtnActionPressed();
            }
        });
    }

    // endregion

    // region OnActivityResult

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == K_REQUEST_1) {
            if (resultCode == RESULT_OK) {
                Log.d("", "");
            }
        }
    }


    // endregion

    // region Private methods

    private void onBtnActionPressed() {

        usermodel user = new usermodel("Luca",32);

        String txtNumber = mEdit.getText().toString();
        Intent intent = new Intent(this, ProvaActivity.class);
        intent.putExtra(K_TXT_NUMBER, txtNumber);
        intent.putExtra(K_USER_MODELS, user);
//        startActivity(intent);
        startActivityForResult(intent, K_REQUEST_1);
    }

    // endregion
}
