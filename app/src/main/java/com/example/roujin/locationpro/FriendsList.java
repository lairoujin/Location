package com.example.roujin.locationpro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FriendsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_list);
    }
    public void onclick1(View view) //这个方法是弹出一个对话框
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        final View layout = inflater.inflate(R.layout.dialog, null);//获取自定义布局
        builder.setView(layout);
        builder.setIcon(R.drawable.friend);//设置标题图标
        builder.setTitle("Add Friend");//设置标题内容

        Button button = (Button)layout.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplication(), "button", Toast.LENGTH_SHORT).show();
            }
        });
        //确认按钮
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(getApplication(), "Yes", Toast.LENGTH_SHORT).show();
            }
        });
        //取消
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        final AlertDialog dlg = builder.create();
        dlg.show();
    }


}

