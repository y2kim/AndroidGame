package com.androidgame.kcy.games;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
/**
 * Created by user on 2017-10-09.
 */

public class PuzzleView extends View {

    private static final String TAG = "Sudoku";
    private static final String SELX = "selX";
    private static final String SELY = "selY";
    private static final String VIEW_STATE = "viewState";
    private static final int ID = 42;

    private  Game game;
    private float width; // width of one tile
    private float height; // height of one tile
    private int selX; // X index of selection
    private int selY; // Y index of selection
    private final Rect selRect = new Rect();

    public PuzzleView(Context context) {
        super(context);
        this.game = (Game) context;
        setFocusable(true);
        setFocusableInTouchMode(true);
       // setId(ID);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        width = w / 9f;
        height = h / 9f;
        getRect(selX, selY, selRect);
        Log.d(TAG, "onSizeChanged: width " + width + ", height " + height);
        super.onSizeChanged(w, h, oldw, oldh);
    }

    private void getRect(int x, int y, Rect rect) {
        rect.set((int) (x * width), (int) (y * height),
                (int) (x * width + width), (int) (y * height + height));
    }
}
