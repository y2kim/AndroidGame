package com.androidgame.kcy.games;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Sudoku"; // 스도쿠라는 이름은 항상 변하지 않음

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continueButton =(Button)findViewById(R.id.continue_button);

        Button newButton = (Button) findViewById(R.id.new_button);

        Button aboutButton =(Button) findViewById(R.id.about_button);

        Button exitButton =(Button) findViewById(R.id.exit_button);

    }
}
