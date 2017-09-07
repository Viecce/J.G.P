package com.p.g.j.lenovo.jgp;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.p.g.j.lenovo.jgp.util.HandleBottomNavigationView;

public class MyAccount extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;             //toolbar实例
    private Button toolBarButton;       //toolbar上按钮实例
    private ImageView headProtrait;     //头像照片实例
    private TextView userName;          //用户名TextView实例
    private TextView userId;            //用户ID TextView实例
    private Button message;             //消息按钮实例
    private Button history;             //历史按钮实例
    private Button collect;             //收藏按钮实例
    private Button setting;             //设置按钮实例
    private Button feedback;            //反馈按钮实例
    private Button logout;              //注销按钮实例
    private BottomNavigationView bottomNavigationView;   //底部BottomNavigationView实例
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount);
        toolbar=(Toolbar)findViewById(R.id.myAccountToolBar);    //32行-43行为各实例绑定ID
        toolBarButton=(Button)findViewById(R.id.myAccountToolBarButton);
        headProtrait=(ImageView)findViewById(R.id.myAccountHeadProtrait);
        userName=(TextView)findViewById(R.id.myAccountUserName);
        userId=(TextView)findViewById(R.id.myAccountUserId);
        message=(Button)findViewById(R.id.myAccountMessage);
        history=(Button)findViewById(R.id.myAccountHistory);
        collect=(Button)findViewById(R.id.myAccountCollect);
        setting=(Button)findViewById(R.id.myAccountSetting);
        feedback=(Button)findViewById(R.id.myAccountFeedback);
        logout=(Button)findViewById(R.id.myAccountLogout);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigationView);
        setSupportActionBar(toolbar);
        toolbar.setTitle("");            //去掉toolbar的标题
        setSupportActionBar(toolbar);
        toolBarButton.setOnClickListener(this);        //48-54行为设置各按钮点击事件
        message.setOnClickListener(this);
        history.setOnClickListener(this);
        collect.setOnClickListener(this);
        setting.setOnClickListener(this);
        feedback.setOnClickListener(this);
        logout.setOnClickListener(this);
        HandleBottomNavigationView.handle(bottomNavigationView);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.myAccountToolBarButton:{
                break;
            }
            case R.id.myAccountMessage:{

                break;
            }
            case R.id.myAccountHistory:{

                break;
            }
            case R.id.myAccountCollect:{

                break;
            }
            case R.id.myAccountSetting:{

                break;
            }
            case R.id.myAccountFeedback:{

                break;
            }
            case R.id.myAccountLogout:{

                break;
            }
        }
    }
}
