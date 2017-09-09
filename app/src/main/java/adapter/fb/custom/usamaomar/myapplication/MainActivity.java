package adapter.fb.custom.usamaomar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ViewClass rangeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rangeView = (ViewClass) findViewById(R.id.rangeView);
        String[] arra = {"usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go", "usama", "ok", "go"};
        String[] Image = {"https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg", "https://static.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg", "http://drop.ndtv.com/albums/COOKS/corngallery/creolespicedcornthumb_640x480.jpg", "http://cep.com.vn/uploads/images/fast-food-1.jpg"};
        ArrayList<MainModel> arrayList = new ArrayList<>();
        for (int x = 0; x < arra.length; x++) {
            MainModel mainModel = new MainModel();
            mainModel.setName(arra[x]);
            mainModel.setImage(Image[x]);
            mainModel.setId(x);
            arrayList.add(mainModel);
        }
        rangeView.setArrayModel(arrayList, new ViewClass.onItemClick() {
            @Override
            public void clickedItem(MainModel mainModel) {
                Toast.makeText(MainActivity.this, "selected " + mainModel.getId(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void bottomItem() {
                Log.e("s","s");
            }
        });

    }
}
