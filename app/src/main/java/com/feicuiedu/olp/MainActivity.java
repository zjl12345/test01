package com.feicuiedu.olp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import onlineproject01.vidioplayer.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyClass mClass = new MyClass();
        String  a = MyClass.txt1;
        mClass.txt1 = "bbb";
    }


}
