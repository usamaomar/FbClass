package adapter.fb.custom.usamaomar.myapplication;

/**
 * Created by usamaomar on 9/2/17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.TypedArray;
import android.graphics.Color;
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
import com.sackcentury.shinebuttonlib.ShineButton;

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
    private onItemClick onItemClick;
    private LinearLayout mainLinearLayout;
    private ScrollViewExt rootScrollView;
    private int mainWidth;
    private int firstViewWidth;
    private RelativeLayout relativeLayout;
    private float mainLobsElevationsNumber;
    private Activity activity;

    public ViewClass(Context context) {
        super(context);
        this.context = context;
    }

    public ViewClass(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;

    }


    public void setArrayModel(ArrayList<MainModel> arrayList, Activity activity, onItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;
        this.activity = activity;
        init();
    }


    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_range_view, this);
        mainLinearLayout = (LinearLayout) view.findViewById(R.id.mainLinearLayout);
        rootScrollView = (ScrollViewExt) view.findViewById(R.id.rootScrollView);
        getWid();
        mainWidth = width / 4;
        firstViewWidth = width / 3;
        mainLobsElevationsNumber = Float.valueOf(arrayList.size()) / 5;
        if (mainLobsElevationsNumber % 2 != 0)
            mainLobsElevationsNumber = (int) mainLobsElevationsNumber + 1;
        addViews(arrayList);
    }


    private void addViews(final ArrayList<MainModel> arrayList) {
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
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
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
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 2) {
                    for (int x = 0; x < 2; x++) {
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                        indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                        if (x > 0) {
                            indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                        } else {
                            indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * 2));
                        }
                        relativeLayout.addView(indicatorButton);
                        indicatorButton.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Object c = view.getTag();
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 3) {
                    for (int x = 0; x < 4; x++) {
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                        indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                        relativeLayout.addView(indicatorButton);
                        indicatorButton.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Object c = view.getTag();
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 4) {
                    for (int x = 0; x < 1; x++) {
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                        indicatorButton.setLayoutParams(params((mainWidth * 4), (mainWidth * 2)));
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                        relativeLayout.addView(indicatorButton);
                        indicatorButton.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Object c = view.getTag();
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 5) {
                    for (int x = 0; x < 5; x++) {
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                        if (x % 5 != 0) {// after first view
                            if (x == 1) {
                                indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                                indicatorButton.setY(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                                indicatorButton.setX(((((mainWidth) + (int) Util.convertDpToPixel(1, context)) * 2)));
                            } else if (x == 2) {
                                indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                                // indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * ((Math.abs(x - 1)) % 5)));
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
                            indicatorButton.setX(((((mainWidth) + (int) Util.convertDpToPixel(1, context)) * 2)));
                        }
                        relativeLayout.addView(indicatorButton);
                        indicatorButton.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Object c = view.getTag();
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                } else if (deRandomType == 6) {
                    for (int x = 0; x < 5; x++) {
                        RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                        if (x % 5 != 0) {// after first view
                            if (x == 1) {
                                indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                                indicatorButton.setY(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));//first second view
                            } else if (x == 2) {
                                indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                                indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * 2));//big view
                            } else if (x == 3) {
                                indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                                indicatorButton.setX((((mainWidth + (int) Util.convertDpToPixel(1, context)))));//last first view
                            } else if (x == 4) {
                                indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                                indicatorButton.setX(((((mainWidth) + (int) Util.convertDpToPixel(1, context)))));// last second view
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
                                onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                            }
                        });
                        indicatorButton.setTag(lastX);
                        lastX++;
                    }
                }
            } else if (calc == 2) {
                //type Regular  2
                for (int x = 0; x < calc; x++) {
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                    indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth * 2)));
                    if (x > 0) {
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                    } else {
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * 2));
                    }
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            } else if (calc == 1) {
                //type Regular  3
                for (int x = 0; x < 1; x++) {
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                    indicatorButton.setLayoutParams(params((mainWidth * 4), (mainWidth * 2)));
                    indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (1) % 5));
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            } else if (calc == 3) {
                //type Regular  3
                for (int x = 0; x < calc; x++) {
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                    indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                    if (x == 2) {
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                        indicatorButton.setLayoutParams(params((mainWidth * 2), (mainWidth)));
                    } else {
                        indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                    }
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
                        }
                    });
                    indicatorButton.setTag(lastX);
                    lastX++;
                }
            } else {
                //type Regular  3
                for (int x = 0; x < calc; x++) {
                    RelativeLayout indicatorButton = myCustomView(arrayList.get(lastX), lastX);
                    indicatorButton.setLayoutParams(params(mainWidth, mainWidth));
                    indicatorButton.setX(((mainWidth + (int) Util.convertDpToPixel(1, context)) * (x % 5)));
                    relativeLayout.addView(indicatorButton);
                    indicatorButton.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Object c = view.getTag();
                            onItemClick.clickedItem(arrayList.get((Integer) view.getTag()), (Integer) view.getTag());
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

            if (deRandomType == 3) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth);
                layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), 0);
                mainLinearLayout.addView(relativeLayout, layout);
            } else if (calc == 3 || calc == 4) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth);
                layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), 0);
                mainLinearLayout.addView(relativeLayout, layout);
            } else {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(width, mainWidth * 2);
                layout.setMargins((int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), (int) Util.convertDpToPixel(1, context), 0);
                mainLinearLayout.addView(relativeLayout, layout);
            }
        }


        rootScrollView.setScrollViewListener(new ScrollViewExt.ScrollViewListener() {
            @Override
            public void onScrollChanged(ScrollViewExt scrollView, int x, int y, int oldx, int oldy) {
                View view = (View) scrollView.getChildAt(scrollView.getChildCount() - 1);
                int diff = (view.getBottom() - (scrollView.getHeight() + scrollView.getScrollY()));
                // if diff is zero, then the bottom has been reached
                if (diff == 0) {
                    onItemClick.bottomItem();
                }
            }
        });


    }


    public void notifyArrayList(ArrayList<MainModel> arrayList) {
        this.arrayList.addAll(arrayList);
        mainLobsElevationsNumber = Float.valueOf(arrayList.size()) / 5;
        if (mainLobsElevationsNumber % 2 != 0)
            mainLobsElevationsNumber = (int) mainLobsElevationsNumber + 1;
        addViews(this.arrayList);
    }


    private int getRandomType() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int max = numbers.length;
        int random = (int) (Math.random() * max);
        return numbers[random];
    }


    public interface onItemClick {
        void clickedItem(MainModel mainModel, int position);

        void bottomItem();
    }


    private RelativeLayout myCustomView(final MainModel mainModel, final int position) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutParams imageViewParam = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        ////
        LayoutParams shineButtonParamFirst = new RelativeLayout.LayoutParams((int) Util.convertDpToPixel(25, context), (int) Util.convertDpToPixel(24, context));
        shineButtonParamFirst.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        shineButtonParamFirst.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        shineButtonParamFirst.addRule(RelativeLayout.LEFT_OF);//shine image
        shineButtonParamFirst.setMargins(0, 0, (int) Util.convertDpToPixel(0, context), (int) Util.convertDpToPixel(1, context));
        ////
        LayoutParams shineButtons = new RelativeLayout.LayoutParams((int) Util.convertDpToPixel(24, context), (int) Util.convertDpToPixel(24, context));
        shineButtons.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        shineButtons.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        shineButtons.addRule(RelativeLayout.LEFT_OF);//regular image
        ////
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(context).load(mainModel.getImage()).crossFade().into(imageView);
        ////
        final ImageView image = new ImageView(context);
        image.setBackgroundResource(R.drawable.vector_like_empty);
        ////
        final ImageView imageWhite = new ImageView(context);
        imageWhite.setBackgroundResource(R.drawable.vector_like_empty);
        ////
        final ShineButton shineButton = new ShineButton(context);
        shineButton.init(activity);
        shineButton.enableFlashing(true);
        shineButton.setAllowRandomColor(false);
        shineButton.setBigShineColor(context.getResources().getColor(R.color.white));
        shineButton.setClickAnimDuration(200);
        shineButton.enableFlashing(false);
        shineButton.setAnimDuration(1500);
        shineButton.setShineCount(8);
        shineButton.setShineTurnAngle(10);
        shineButton.setShapeResource(R.raw.heart);
        shineButton.setSmallShineColor(context.getResources().getColor(R.color.white));
        shineButton.setSmallShineOffAngle(20);

//        if (mainModel.isLikeState()){
//            image.setVisibility(GONE);
//            shineButton.setBtnFillColor(context.getResources().getColor(R.color.white));
//            shineButton.setChecked(true);
//        }else {
//            image.setVisibility(VISIBLE);
//            shineButton.setBtnFillColor(context.getResources().getColor(R.color.trans));
//            shineButton.setChecked(false);
//        }

        image.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mainModel.isLikeState()) {//change to liked
                    shineButton.performClick();
                    mainModel.setLikeState(true);
                    arrayList.set(position, mainModel);
                    //shineButton.setBtnFillColor(Color.WHITE);
                    shineButton.setChecked(true);
                } else {
                    shineButton.performClick();
                    shineButton.performClick();
                    mainModel.setLikeState(true);
                    arrayList.set(position, mainModel);
                    //shineButton.setBtnFillColor(context.getResources().getColor(R.color.black));
                    shineButton.setChecked(false);
                }
            }
        });
        ////
        relativeLayout.addView(imageView, imageViewParam);
        relativeLayout.addView(shineButton, shineButtonParamFirst);
        relativeLayout.addView(imageWhite, shineButtonParamFirst);
        relativeLayout.addView(image, shineButtons);
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

