package demo.corsoits.com.corsoits;

import android.content.Intent;
import android.net.MailTo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import demo.corsoits.com.corsoits.fragments.FragmentCountry;
import demo.corsoits.com.corsoits.models.usermodel;

public class ProvaActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ProvaActivity";

    private Button mBtnAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova);

        Log.d(TAG,"onCreate");

        this.mBtnAction = (Button)findViewById(R.id.btnAction);
        this.mBtnAction.setOnClickListener(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.K_TXT_NUMBER);
        usermodel usermodel = (usermodel) intent.getParcelableExtra(MainActivity.K_USER_MODELS);
        TextView txtView = (TextView) findViewById(R.id.txtView1);
        txtView.setText(usermodel.getName());
        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new FragmentCountry())
                    .commit();
        }
    }


    @Override
    protected void onStart()


    {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnAction) {
            setResult(RESULT_OK);
            finish();
        }
    }
}
