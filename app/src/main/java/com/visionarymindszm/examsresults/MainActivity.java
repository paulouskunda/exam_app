package com.visionarymindszm.examsresults;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.visionarymindszm.examsresults.screens.LoginActivity;
import com.visionarymindszm.examsresults.utils.HoldVariables;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // replace with shared preference

        if (HoldVariables.pupil_id.equals("null")){
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        }

        setUpNavigation();



    }

    private void setUpNavigation(){
       BottomNavigationView mBottomNavigationView =findViewById(R.id.bottom_nav);
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(mBottomNavigationView,
                navHostFragment.getNavController());

    }
}