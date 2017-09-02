package adapter.fb.custom.usamaomar.myapplication;

/**
 * Created by usamaomar on 9/2/17.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;


public class ViewClass extends RelativeLayout {


    private Context context;
    private int rangeNumber;
    private int backGroundSrc;
    private int width;
    private boolean regularStyle;

    public ViewClass(Context context) {
        super(context);
        this.context = context;
    }

    public ViewClass(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        init();
        //getAttrs(attributeSet);
    }

    private void setRangeNumberXml(int rangeNumber) {
        this.rangeNumber = rangeNumber;
        init();
    }

    public void setRangeNumber(int rangeNumber) {
        this.rangeNumber = rangeNumber;
        init();
    }

    public void setbackGroundSrcXml(int backGroundSrc) {
        this.backGroundSrc = backGroundSrc;
        init();
    }

    public void setbackGroundSrc(int backGroundSrc) {
        this.backGroundSrc = backGroundSrc;
        init();
    }

    private void getAttrs(AttributeSet attributeSet) {
        TypedArray a = context.obtainStyledAttributes(attributeSet, R.styleable.rangeView);
        String rangeNumber = a.getString(R.styleable.rangeView_range_number);
        String indicatorSrc = a.getString(R.styleable.rangeView_indicator_src);
        a.recycle();
        if (rangeNumber != null) {
            this.rangeNumber = Integer.parseInt(rangeNumber);
            setRangeNumberXml(Integer.parseInt(rangeNumber));
        }
        if (indicatorSrc != null) {
            this.backGroundSrc = Integer.parseInt(indicatorSrc);
            setbackGroundSrcXml(Integer.parseInt(indicatorSrc));
        }
    }

    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_range_view, this);
        LinearLayout rootLinearLayout = view.findViewById(R.id.rootLinearLayout);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(32);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(32);
        arr.add(22);
        arr.add(51);
        arr.add(32);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(32);
        arr.add(22);
        arr.add(51);
        arr.add(32);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(32);
        arr.add(22);
        arr.add(51);
        arr.add(32);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(32);
        arr.add(22);
        arr.add(51);
        getWid();



        int mainWidth = width/5;
        int firstViewWidth = width/3;
        int mainLobsElevationsNumber = arr.size()/5;
        for (int y = 0; y < mainLobsElevationsNumber; y++) {
              LinearLayout linearLayout = new LinearLayout(context);
            for (int x = 0; x < mainWidth; x++) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(mainWidth, mainWidth);
                ImageView indicatorButton = new ImageView(context);
                indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                layout.setMargins((int) Util.convertDpToPixel(1, context),(int) Util.convertDpToPixel(1, context),(int) Util.convertDpToPixel(1, context),(int) Util.convertDpToPixel(1, context));
                indicatorButton.setLayoutParams(layout);
                linearLayout.addView(indicatorButton);
            }
            rootLinearLayout.addView(linearLayout);
        }
    }




    private void getWid() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        width = metrics.widthPixels;
    }

}

