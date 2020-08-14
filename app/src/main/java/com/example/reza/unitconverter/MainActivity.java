
package com.example.reza.unitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import static androidx.core.view.GravityCompat.START;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

private MaterialToolbar toolbar;
private DrawerLayout drawerLayout;
private NavigationView navigationView;
private SwitchCompat switchCompat;

private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        toolbar=findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);
        drawerLayout=findViewById(R.id.id_drawer_layout);
        navigationView=findViewById(R.id.navigationview_id);
        frameLayout=findViewById(R.id.content_frame);
        initializeDefaultFragment(savedInstanceState,0);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.OpenAppDrawer,R.string.CloseAppDrawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
       navigationView.setNavigationItemSelectedListener(this);

    }

    private void closeDrawer(){
        if (drawerLayout.isDrawerOpen(START)){
            drawerLayout.closeDrawer(START);
        }
    }

    private void initializeDefaultFragment(Bundle savedInstanceState, int itemIndex){
        if (savedInstanceState == null){
            MenuItem menuItem = navigationView.getMenu().getItem(itemIndex).setChecked(true);
            onNavigationItemSelected(menuItem);
        }
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;
        switch (item.getItemId())
        {
            case R.id.id_temperature:
                fragment=new TemperatureFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Temperature Converter");
                closeDrawer();
                break;
            case R.id.id_length:
                fragment=new LengthFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Length Converter");
                closeDrawer();
                break;
            case R.id.id_weight:
                fragment=new WeightFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Weight Converter");
                closeDrawer();
                break;
            case R.id.id_speed:
                fragment=new SpeedFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Speed Converter");
                closeDrawer();
                break;
            case R.id.id_currency:
                fragment=new CurrencyFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Currency Converter");
                closeDrawer();
                break;

            case R.id.id_covid_info:
                fragment=new CovidFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Covid-19 Info");
                closeDrawer();
                break;

            case R.id.id_calculator:

                fragment= new CalculatorFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Calculator");
                closeDrawer();
                break;

            case R.id.id_setting:
                fragment=new SettingFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Setting");
                closeDrawer();
                break;
            case R.id.id_feedback:
                fragment=new FeedbackFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("Feedback");
                closeDrawer();
                break;

            case R.id.id_about:
                fragment=new AboutFragment();
                item.setCheckable(true);
                getSupportActionBar().setTitle("About");
                closeDrawer();
        }

        if (fragment!=null)
        {
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content_frame,fragment);
            fragmentTransaction.commit();
        }

        return true;
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}