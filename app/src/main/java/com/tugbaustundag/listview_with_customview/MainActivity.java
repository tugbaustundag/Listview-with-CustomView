/*
 * Copyright (C) 2015 Tuğba Üstündağ <tugba.ust2008@gmail.com><http://tugbaustundag.com>
*/
package com.tugbaustundag.listview_with_customview;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Item ları listeye ekleyen ItemListFragment sınıfına yönlendrme yaptık
        ItemListFragment itemListFragment = new ItemListFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.realtabcontent, itemListFragment);
        transaction.commit();
    }
}
