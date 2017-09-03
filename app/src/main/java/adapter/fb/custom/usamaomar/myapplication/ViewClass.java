package adapter.fb.custom.usamaomar.myapplication;

/**
 * Created by usamaomar on 9/2/17.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import java.util.ArrayList;


public class ViewClass extends RelativeLayout {


    private Context context;
    private int rangeNumber;
    private int backGroundSrc;
    private int width;
    private boolean regularStyle;
    int lastX = 0;

    public ViewClass(Context context) {
        super(context);
        this.context = context;
    }

    public ViewClass(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        init();
    }


    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_range_view, this);
        LinearLayout mainLinearLayout = (LinearLayout) view.findViewById(R.id.mainLinearLayout);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(32);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);

        getWid();


        int mainWidth = width / 5;
        int firstViewWidth = width / 3;
        float mainLobsElevationsNumber = Float.valueOf(arr.size()) / 5;
        if (mainLobsElevationsNumber % 2 != 0)
            mainLobsElevationsNumber = (int) mainLobsElevationsNumber + 1;
        for (int y = 0; y < mainLobsElevationsNumber; y++) {
            LinearLayout linearLayout = new LinearLayout(context);
            for (int x = lastX; x < arr.size(); x++) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(mainWidth, mainWidth);
                ImageView indicatorButton = new ImageView(context);
                indicatorButton.setTag(x);
                indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context));
                indicatorButton.setLayoutParams(layout);
                linearLayout.addView(indicatorButton);
                float xx = indicatorButton.getScaleX();
                float yy = indicatorButton.getY();
                indicatorButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("s","S");
                    }
                });
                lastX = x;
            }
            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth*2);
            mainLinearLayout.addView(linearLayout,layout);
        }
    }


    private void getWid() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        width = metrics.widthPixels;
    }

}

