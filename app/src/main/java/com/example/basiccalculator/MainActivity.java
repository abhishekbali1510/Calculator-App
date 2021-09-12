package com.example.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText myScreen;
    String stck="";
    String postfix="";

    public int evaluate(String pos)
    {   int i=0,j=0;
        int [] newStck = new int[100];
        int place=0;
        while(i<pos.length())
        {
            if(pos.charAt(i)=='.')
            {
                place=0;
            }
            else if(pos.charAt(i)=='+'||pos.charAt(i)=='-'||pos.charAt(i)=='*'||pos.charAt(i)=='/')
            {
                if(pos.charAt(i)=='+')
                {
                    newStck[j-2]=newStck[j-1]+newStck[j-2];
                }
                else if(pos.charAt(i)=='-')
                {
                    newStck[j-2]=newStck[j-2]-newStck[j-1];
                }
                else if(pos.charAt(i)=='*')
                {
                    newStck[j-2]=newStck[j-1]*newStck[j-2];
                }
                else if(pos.charAt(i)=='/')
                {
                    newStck[j-2]=newStck[j-2]/newStck[j-1];
                }
                j--;
            }
            else
            {
                int x=Integer.parseInt(String.valueOf(pos.charAt(i)));
                if(place==0)
                {
                    newStck[j++]= x;

                }
                else
                {

                    newStck[j-1]=newStck[j-1]*10+x;

                }
                place++;
            }
            i++;
        }
        return newStck[j-1];
    }
    public String reverse(String rev)
    {
        char[] revArr=rev.toCharArray();
        char tmp;
        int i=0,length=rev.length();
        while(i<rev.length()/2)
        {
            tmp=revArr[i];
            revArr[i]=revArr[length-i-1];
            revArr[length-i-1]=tmp;
            i++;
        }

       rev=String.valueOf(revArr);

        return rev;
    }
    public int prec(char c)
    {
        if(c=='+'||c=='-')
            return 1;
        else if(c=='*'||c=='/')
            return 2;
        else return 0;
    }
    public void push(char c)
    {
        if(stck.isEmpty())
        {
            stck=stck+c;
        }
        else if(prec(c)>prec(stck.charAt(stck.length()-1)))
        {
            stck=stck+c;

        }
        else
        {
            postfix=postfix+stck.charAt(stck.length()-1);
            stck=stck.substring(0,stck.length()-1);
            push(c);

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        TextView myScreen=(TextView) findViewById(R.id.myscreen);
        myScreen.setText("0");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("1");
                else
                    myScreen.setText(s+"1");
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("2");
                else
                    myScreen.setText(s+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("3");
                else
                    myScreen.setText(s+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("4");
                else
                    myScreen.setText(s+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("5");
                else
                    myScreen.setText(s+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("6");
                else
                    myScreen.setText(s+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("7");
                else
                    myScreen.setText(s+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("8");
                else
                    myScreen.setText(s+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("9");
                else
                    myScreen.setText(s+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s=="0")
                    myScreen.setText("0");
                else
                    myScreen.setText(s+"0");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/')
                    myScreen.setText(s);
                else
                    myScreen.setText(s+"+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/')
                    myScreen.setText(s);
                else
                    myScreen.setText(s+"-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/')
                    myScreen.setText(s);
                else
                    myScreen.setText(s+"*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myScreen.getText().toString();
                if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/')
                    myScreen.setText(s);
                else
                    myScreen.setText(s+"/");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myScreen.setText("0");
                postfix="";
                stck="";
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=myScreen.getText().toString();
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
                    {
                        postfix=postfix+".";
                        push(s.charAt(i));
                    }
                    else
                        postfix=postfix+s.charAt(i);
                }
                stck=reverse(stck);
                postfix=postfix+stck;
                int num=evaluate(postfix);
                String rslt=Integer.toString(num);
                myScreen.setText(rslt+"");
                postfix="";
                stck="";


            }



        });

    }

}