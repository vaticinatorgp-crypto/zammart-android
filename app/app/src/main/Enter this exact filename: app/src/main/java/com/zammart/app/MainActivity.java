
package com.zammart.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(20, 25, 20, 20);
        main.setBackgroundColor(Color.WHITE);

        TextView logo = new TextView(this);
        logo.setText("ZAMMART");
        logo.setTextSize(30);
        logo.setTextColor(Color.rgb(0, 110, 60));
        logo.setGravity(Gravity.CENTER);
        logo.setPadding(10, 20, 10, 20);
        main.addView(logo);

        TextView slogan = new TextView(this);
        slogan.setText("Zambia's Online Marketplace");
        slogan.setTextSize(16);
        slogan.setGravity(Gravity.CENTER);
        main.addView(slogan);

        EditText search = new EditText(this);
        search.setHint("Search products...");
        main.addView(search);

        TextView categories = new TextView(this);
        categories.setText("SHOP BY CATEGORY");
        categories.setTextSize(20);
        categories.setTextColor(Color.BLACK);
        categories.setPadding(0, 25, 0, 15);
        main.addView(categories);

        String[] items = {
            "Electronics",
            "Phones & Accessories",
            "Fashion & Clothing",
            "Home & Furniture",
            "Vehicles",
            "Food & Groceries",
            "Beauty & Health"
        };

        for (String item : items) {
            Button button = new Button(this);
            button.setText(item);
            main.addView(button);
        }

        TextView welcome = new TextView(this);
        welcome.setText("Welcome to ZAMMART!\nBuy and sell across Zambia.");
        welcome.setTextSize(17);
        welcome.setGravity(Gravity.CENTER);
        welcome.setPadding(10, 30, 10, 20);
        main.addView(welcome);

        setContentView(main);
    }
                        }
