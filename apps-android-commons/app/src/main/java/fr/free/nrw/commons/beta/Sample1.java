package fr.free.nrw.commons.beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;
import fr.free.nrw.commons.R;

public class Sample1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample1);
    }


    @OnClick(R.id.button2)
    public void Back() {

        Intent intent = new Intent(this, fr.free.nrw.commons.AboutActivity.class);
        startActivity(intent);
    }
}
