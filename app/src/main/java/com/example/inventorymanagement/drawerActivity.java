package com.example.inventorymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.inventorymanagement.Fragment.InventoryFragment;
import com.example.inventorymanagement.Fragment.SettingsFragment;
import com.example.inventorymanagement.Fragment.StatementFragment;
import com.example.inventorymanagement.Fragment.TransactionFragment;
import com.example.inventorymanagement.Fragment.add;
import com.example.inventorymanagement.Fragment.cartFragment;
import com.example.inventorymanagement.Fragment.homepage;
import com.example.inventorymanagement.Fragment.overviewFragment;
import com.example.inventorymanagement.Fragment.resourcesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class drawerActivity extends AppCompatActivity {
    //DrawerLayout dr;
    NavigationView nv;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        dr=findViewById(R.id.drawer);
        nv=findViewById(R.id.nav);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.showOverflowMenu();

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,dr,toolbar,R.string.openDrawer,R.string.closeDrawer);
        dr.addDrawerListener(toggle);
        toggle.syncState();
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.homepage)
                {
                    loadFragment(new homepage());
                }
                else if(id==R.id.overview)
                {
                    loadFragment(new overviewFragment());
                    Toast.makeText(drawerActivity.this,"overview",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.Inventory)
                {
                    Toast.makeText(drawerActivity.this,"Inventory",Toast.LENGTH_SHORT).show();

                    loadFragment( new InventoryFragment() );
                }
                else if(id==R.id.Transaction)
                {
                    //loadFragment( new StatementFragment());
                    Toast.makeText(drawerActivity.this,"Transaction",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(drawerActivity.this,"Statement",Toast.LENGTH_SHORT).show();

                    //loadFragment( new TransactionFragment());
                }
                dr.closeDrawer(GravityCompat.START);
                return true;
            }
        });





//    @Override
//    public void onBackPressed() {
//        if(dr.isDrawerOpen(GravityCompat.START))
//        {
//            dr.closeDrawer(GravityCompat.START);
//        }
//        else {
//            super.onBackPressed();
//        }
//    }

//    private void loadFragment(Fragment fragment) {
//
//    }
//    private void loadFragment(Fragment fragment,boolean flag) {
//        FragmentManager fm=getSupportFragmentManager();
//        FragmentTransaction ft= fm.beginTransaction();
//        if(flag)
//            ft.add(R.id.container,fragment);//container id jahan pr load karna he fragment
//        else
//            ft.replace(R.id.container,fragment);
//        ft.commit();
//    }
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.container,fragment);//container id jahan pr load karna he fragment
        ft.commit();
    }
}