package tipcalculator.huji.ac.il.postpcex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }
    public void onBtnClick(View v){
        EditText edTxt = (EditText) findViewById(R.id.edtBillAmount);
        CheckBox chbox = (CheckBox) findViewById(R.id.chkRound);
        TextView txtView = (TextView) findViewById(R.id.txtTipResult);
        if(!chbox.isChecked())
            txtView.setText((Double.parseDouble(edTxt.getText().toString())* 0.12) + getResources().getString(R.string.currency));
        else
            txtView.setText(Math.round((Double.parseDouble(edTxt.getText().toString())* 0.12)) + getResources().getString(R.string.currency));
    }
}
