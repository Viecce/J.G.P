package com.p.g.j.lenovo.jgp.util;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.p.g.j.lenovo.jgp.MyAccount;
import com.p.g.j.lenovo.jgp.R;

/**
 * Created by cartoon on 2017/9/7.
 * 处理底部BottomNavigationView选择事件
 * 通过在case编写具体代码实现item的功能
 */

public class HandleBottomNavigationView {
    public static void handle(BottomNavigationView bottomNavigationView){
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.homePage: {

                                break;
                            }
                            case R.id.search:{

                                break;
                            }
                            case R.id.me:{


                                break;
                            }
                        }
                        return true;
                    }
                });
    }
}
