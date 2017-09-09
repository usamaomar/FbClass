package adapter.fb.custom.usamaomar.myapplication;

/**
 * Created by usamaomar on 9/2/17.
 */

import android.content.Context;
import android.content.pm.ProviderInfo;
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
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class ViewClass extends RelativeLayout {


    private Context context;
    private int rangeNumber;
    private int backGroundSrc;
    private int width;
    private boolean regularStyle;
    int lastX = 0;
    private ArrayList<MainModel> arrayList;

    public ViewClass(Context context) {
        super(context);
        this.context = context;
    }

    public ViewClass(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;

    }


    public void setArrayModel(ArrayList<MainModel> arrayList) {
        this.arrayList = arrayList;
        init();
    }


    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_range_view, this);
        LinearLayout mainLinearLayout = (LinearLayout) view.findViewById(R.id.mainLinearLayout);


        getWid();
        int mainWidth = width / 4;
        int firstViewWidth = width / 3;
        RelativeLayout relativeLayout;
        float mainLobsElevationsNumber = Float.valueOf(arrayList.size()) / 5;
        if (mainLobsElevationsNumber % 2 != 0)
            mainLobsElevationsNumber = (int) mainLobsElevationsNumber + 1;
        for (int y = 1; y <= mainLobsElevationsNumber; y++) {
            int deRandomType = getRandomType();
            relativeLayout = new RelativeLayout(context);
            int numArraySize = arrayList.size();
            int lastXSize = lastX;
            int calc = numArraySize - lastXSize;
            if (calc >= 5) {
                //type ONE  1
                if (deRandomType == 1) {
                    for (int x = 0; x < 5; x++) {
                        // ImageView indicatorButton = new ImageView(context);
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX));
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
                                Log.e("Object", "Object" + c);
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 2) {
                    for (int x = 0; x < 2; x++) {
                        // ImageView indicatorButton = new ImageView(context);
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX));
                        indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                        if (x > 0) {
                            indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                            indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                        } else {
                            indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
                            indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * 2));
                        }
                        relativeLayout.addView(indicatorButton);
                        indicatorButton.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Object c = view.getTag();
                                Log.e("Object", "Object" + c);
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 3) {
                    for (int x = 0; x < 4; x++) {
                        // ImageView indicatorButton = new ImageView(context);
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX));
                        indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                        indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
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
            } else if (calc == 2) {
                //type Regular  2
                for (int x = 0; x < calc; x++) {
                    // ImageView indicatorButton = new ImageView(context);
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX));
                    indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                    if (x > 0) {
                        indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                    } else {
                        indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * 2));
                    }
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            Log.e("Object", "Object" + c);
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            } else {
                //type Regular  3
                for (int x = 0; x < calc; x++) {
                    // ImageView indicatorButton = new ImageView(context);
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX));
                    indicatorButton.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                    indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                    indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            Log.e("Object", "Object" + c);
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            }

            int yz = (int) (y - mainLobsElevationsNumber);
            if (yz == 0) {
                int yzo = arrayList.size() - lastX;
                if (yzo > 0) {
                    mainLobsElevationsNumber++;
                }
            }

            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth * 2);
            layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), 0);
            mainLinearLayout.addView(relativeLayout, layout);
        }
    }

    private int getRandomType() {
        int[] numbers = {1, 2};
        int max = numbers.length;
        int random = (int) (Math.random() * max);
        return numbers[random];
    }

    private RelativeLayout myCustomView(MainModel mainModel) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        LayoutParams lps = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        TextView textView = new TextView(context);
        textView.setText(String.format(Locale.getDefault(), "%s %s", mainModel.getName(), mainModel.getId()));
        Glide.with(context).load(mainModel.getImage()).crossFade().into(imageView);
        relativeLayout.addView(textView, lps);
        relativeLayout.addView(imageView, lp);
        return relativeLayout;
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

