package com.example.calculate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    TextView tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9,tv_0,tv_com;
    EditText editText,edit;
    String op="";
    ImageButton iv;
    ActionBar actionBar;
    int sum=0;
    Double sumd;
    boolean calcued=false;
    boolean isPutOp=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=findViewById(R.id.iv);
        edit=findViewById(R.id.edit);
        editText=findViewById(R.id.editText);
        tv_0=findViewById(R.id.tv_0);
        tv_1=findViewById(R.id.tv_1);
        tv_2=findViewById(R.id.tv_2);
        tv_3=findViewById(R.id.tv_3);
        tv_4=findViewById(R.id.tv_4);
        tv_5=findViewById(R.id.tv_5);
        tv_6=findViewById(R.id.tv_6);
        tv_7=findViewById(R.id.tv_7);
        tv_8=findViewById(R.id.tv_8);
        tv_9=findViewById(R.id.tv_9);
        tv_com=findViewById(R.id.tv_com);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp=editText.getText().toString();
                tmp=tmp.replaceAll(" ","");
                if(tmp.length()==0){
                    Toast.makeText(MainActivity.this, "지울 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Log.e("tmp",tmp.charAt(tmp.length()-1)+"");
                }
                String str="";
                switch (tmp.charAt(tmp.length()-1)){
                    case '+': case'-':case '×': case '÷':
                        isPutOp=false;
                        for(int i=0;i<tmp.length()-1;i++){
                            str+=String.valueOf(tmp.charAt(i));
                        }
                        editText.setText(str);
                        break;
                    case '=':
                        Toast.makeText(MainActivity.this, "지울 수 없습니다.", Toast.LENGTH_SHORT).show();
                        break;
                        default:
                            if(tmp.length()==1){
                                tmp="0";
                                editText.setText(tmp);
                                break;
                            }else{
                                for(int i=0;i<tmp.length()-1;i++){
                                    str+=String.valueOf(tmp.charAt(i));
                                }
                                editText.setText(str);
                                break;

                            }

                }
            }
        });
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.tv_0:
                if (calcued) {
                    editText.setText("0");
                    calcued = false;
                } else {
                    switch (editText.getText().toString().charAt(editText.getText().toString().length()-1)){
                        case '0': case '+': case'-':case '×': case '÷':case' ':
                            break;
                            default:
                                editText.setText(editText.getText().toString() + "0");
                                break;
                    }
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("0");
                    } else {
                        editText.setText(editText.getText().toString() + "0");
                    }
                }
                break;
            case R.id.tv_1:
                if (calcued) {
                    editText.setText("1");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("1");
                    } else {
                        editText.setText(editText.getText().toString() + "1");
                    }
                }
                break;
            case R.id.tv_2:
                if (calcued) {
                    editText.setText("2");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("2");
                    } else {
                        editText.setText(editText.getText().toString() + "2");
                    }
                }
                break;
            case R.id.tv_3:
                if (calcued) {
                    editText.setText("3");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("3");
                    } else {
                        editText.setText(editText.getText().toString() + "3");
                    }
                }
                break;
            case R.id.tv_4:
                if (calcued) {
                    editText.setText("4");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("4");
                    } else {
                        editText.setText(editText.getText().toString() + "4");
                    }
                }
                break;
            case R.id.tv_5:
                if (calcued) {
                    editText.setText("5");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("5");
                    } else {
                        editText.setText(editText.getText().toString() + "5");
                    }
                }
                break;
            case R.id.tv_6:
                if (calcued) {
                    editText.setText("6");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("6");
                    } else {
                        editText.setText(editText.getText().toString() + "6");
                    }
                }
                break;
            case R.id.tv_7:
                if (calcued) {
                    editText.setText("7");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("7");
                    } else {
                        editText.setText(editText.getText().toString() + "7");
                    }
                }
                break;
            case R.id.tv_8:
                if (calcued) {
                    editText.setText("8");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("8");
                    } else {
                        editText.setText(editText.getText().toString() + "8");
                    }
                }
                break;
            case R.id.tv_9:
                if (calcued) {
                    editText.setText("9");
                    calcued = false;
                } else {
                    if (editText.getText().toString().equals("0")) {
                        editText.setText("9");
                    } else {
                        editText.setText(editText.getText().toString() + "9");
                    }
                }
                break;
            case R.id.tv_com:
                if (calcued) {
                    editText.setText("0.");
                    calcued = false;
                    break;
                } else {
                    if(editText.getText().toString().length()==0){
                        editText.setText("0.");
                        calcued = false;
                        break;
                    }
                    switch (editText.getText().toString().charAt(editText.getText().toString().length()-1)){
                        case '+': case'-':case '×': case '÷':
                            break;
                        case ' ':
                            break;
                            default:
                                editText.setText(editText.getText().toString() + ".");
                                break;
                    }
                }
                break;
            case R.id.btn_Add:
                if (calcued) {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(edit.getText().toString() + " + ");
                        op = "+";
                        calcued = false;
                        isPutOp = true;
                    }
                } else {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(editText.getText().toString() + " + ");
                        op = "+";
                        isPutOp = true;
                    }

                }
                break;
            case R.id.btn_Sub:
                if (calcued) {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(edit.getText().toString() + " - ");
                        op = "-";
                        calcued = false;
                        isPutOp = true;
                    }
                } else {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(editText.getText().toString() + " - ");
                        op = "-";
                        isPutOp = true;
                    }
                }
                break;
            case R.id.btn_Mul:
                if (calcued) {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(edit.getText().toString() + " × ");
                        op = "*";
                        calcued = false;
                        isPutOp = true;
                    }
                } else {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(editText.getText().toString() + " × ");
                        op = "*";
                        isPutOp = true;
                    }
                }
                break;
            case R.id.btnDev:
                if (calcued) {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(edit.getText().toString() + " ÷ ");
                        op = "/";
                        calcued = false;
                        isPutOp = true;
                    }
                } else {
                    if (isPutOp) {
                        break;
                    } else {
                        editText.setText(editText.getText().toString() + " ÷ ");
                        op = "/";
                        isPutOp = true;
                    }
                }
                break;
            case R.id.tv_null:
                op = "";
                editText.setText("");
                edit.setText("");
                isPutOp=false;
                calcued=false;
                break;
            case R.id.btnRes:
                Log.e("isPutOp=", isPutOp + "");
                if (isPutOp) {//연산자가 입력되어있으면 계산을 수행하고 아니면 나간다
                    calcued = true;
                    isPutOp = false;
                } else {
                    calcued = false;
                    break;
                }
                String[] num = new String[2];
                String a = "";
                switch (op) {
                    case "+":
                        a = editText.getText().toString();
                        if (editText.getText().toString().contains("+")) {
                            a = a.replaceAll(" ", "");
                            num = a.split("\\+");
                        } else {
                            break;
                        }
                        if (num.length == 1) {
                            Toast.makeText(this, "계산식을 확인해주세요", Toast.LENGTH_SHORT).show();
                            isPutOp = true;
                            calcued = false;
                            break;
                        }
                        if(num[0].contains(".")||num[1].contains(".")){
                            sumd = Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
                            editText.append(" = ");
                            edit.setText(sumd + "");
                        } else{
                            sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
                            editText.append(" = ");
                            edit.setText(sum + "");
                        }
                        break;
                    case "-":
                        a = editText.getText().toString();
                        if (editText.getText().toString().contains("-")) {
                            a = a.replaceAll(" ", "");
                        } else {
                            break;
                        }
                        num = a.split("-");
                        if (num.length == 1) {
                            Toast.makeText(this, "계산식을 확인해주세요", Toast.LENGTH_SHORT).show();
                            isPutOp = true;
                            calcued = false;
                            break;
                        }

                        if(num[0].contains(".")||num[1].contains(".")){
                            sumd = Double.parseDouble(num[0]) - Double.parseDouble(num[1]);
                            editText.append(" = ");
                            edit.setText(sumd + "");
                        } else{
                            sum = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
                            editText.append(" = ");
                            edit.setText(sum + "");
                        }
                        break;
                    case "*":
                        a = editText.getText().toString();
                        if (editText.getText().toString().contains("×")) {
                            a = a.replaceAll(" ", "");
                        } else {
                            break;
                        }
                        num = a.split("×");
                        if (num.length == 1) {
                            Toast.makeText(this, "계산식을 확인해주세요", Toast.LENGTH_SHORT).show();
                            isPutOp = true;
                            calcued = false;
                            break;
                        }

                        if(num[0].contains(".")||num[1].contains(".")){
                            sumd = Double.parseDouble(num[0]) * Double.parseDouble(num[1]);
                            editText.append(" = ");
                            edit.setText(sumd + "");
                        } else{
                            sum = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
                            editText.append(" = ");
                            edit.setText(sum + "");
                        }
                        break;
                    case "/":
                        a = editText.getText().toString();
                        if (editText.getText().toString().contains("÷")) {
                            a = a.replaceAll(" ", "");
                        } else {
                            break;
                        }
                        num = a.split("÷");
                        if (num.length == 1) {
                            Toast.makeText(this, "계산식을 확인해주세요", Toast.LENGTH_SHORT).show();
                            isPutOp = true;
                            calcued = false;
                            break;
                        }

                        if(num[0].contains(".")||num[1].contains(".")){
                            sumd = Double.parseDouble(num[0]) / Double.parseDouble(num[1]);
                            editText.append(" = ");
                            edit.setText(sumd + "");
                        } else{
                            sum = Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
                            editText.append(" = ");
                            edit.setText(sum + "");
                        }
                        break;
                }
        }
    }
}
