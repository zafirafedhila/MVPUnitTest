package com.zafproject.mvpunittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {
    MainPresenter presenter;
    @BindView(R.id.btncalculate)

    Button btncalculate;
    @BindView(R.id.edt_a)
    EditText edtA;
    @BindView(R.id.edt_b)
    EditText edtB;
    @BindView(R.id.tvresult)
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initPresenter();
        onAttachView();

    }

    private void initPresenter() {
        presenter = new MainPresenter();

    }

    @OnClick(R.id.btncalculate)
    public void onViewClicked() {
        presenter.calculate(edtA, edtB);
    }


    @Override
    public void Success(String result) {
        tvresult.setText(result);


    }

    @Override
    public void Error() {
        Toast.makeText(this, "hahaha", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);

    }

    @Override
    public void onDetachView() {
        presenter.onDettach();


    }

    @Override
    protected void onStart() {
        onAttachView();
        super.onStart();
    }
}
