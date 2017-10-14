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
        continueButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame(Game.DIFFICULTY_CONTINUE);
            }
        });

        Button newButton = (Button) findViewById(R.id.new_button);
        newButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewGameDialog();
            }
        });

        Button aboutButton =(Button) findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button exitButton =(Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void startGame(int i) {
        Log.d(TAG, "clicked on " + i);
        Intent intent = new Intent(this, Game.class);
        intent.putExtra(Game.KEY_DIFFICULTY, i);
        startActivity(intent);
    }

    private void openNewGameDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.new_game_title)
                .setItems(R.array.difficulty,
                        new DialogInterface.OnClickListener() {
                            public void onClick(
                                    DialogInterface dialoginterface, int i) {
                                startGame(i);
                            }
                        }).show();
    }
}
