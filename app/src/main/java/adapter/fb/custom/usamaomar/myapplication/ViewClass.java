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
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        arr.add(22);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);

        getWid();
        int mainWidth = width / 4;
        int firstViewWidth = width / 3;
        RelativeLayout relativeLayout;
        float mainLobsElevationsNumber = Float.valueOf(arr.size()) / 5;
        if (mainLobsElevationsNumber % 2 != 0)
            mainLobsElevationsNumber = (int) mainLobsElevationsNumber + 1;
        for (int y = 0; y < mainLobsElevationsNumber; y++) {
            relativeLayout = new RelativeLayout(context);
            int numArraySize = arr.size();
            int lastXSize =lastX;
            int calc = numArraySize  - lastXSize;
           if (calc > 5) {//type ONE
                for (int x = 0; x < 5; x++) {
                    ImageView indicatorButton = new ImageView(context);
                    indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                    if (x % 5 != 0) {// after first view
                        if (x == 1) {
                            indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                            indicatorButton.setY(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                        } else if (x == 2) {
                            indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                            indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * ((Math.abs(x - 1)) % 5)));
                        } else if (x == 3) {
                            indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                            indicatorButton.setX((((mainWidth + (int) Util.convertDpToPixel(1, context)) * 3)));
                        } else if (x == 4) {
                            indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                            indicatorButton.setX(((((mainWidth) + (int) Util.convertDpToPixel(1, context)) * 3)));
                            indicatorButton.setY(((mainWidth + (int) Util.convertDpToPixel(1, context))));
                        }
                    } else {
                        indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                    }
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            Log.e("Object", "Object");
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
             } else {//type Regular
                for (int x = 0; x < calc; x++) {
                    ImageView indicatorButton = new ImageView(context);
                    indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                    indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                    indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * ((Math.abs(x - 1)) % 5)));
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            Log.e("Object", "Object");
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            }
            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth * 2);
            layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), 0);
            mainLinearLayout.addView(relativeLayout, layout);
        }
    }

    private LinearLayout.LayoutParams params(int mainWidth, int minHigh) {
        LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(mainWidth, minHigh);
        layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context));
        return layout;
    }

    private void getWid() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        width = metrics.widthPixels;
    }
}

