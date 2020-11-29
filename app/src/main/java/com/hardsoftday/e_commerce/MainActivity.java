package com.hardsoftday.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.e_commerce.adapter.ProductAdapter;
import com.hardsoftday.e_commerce.adapter.ProductCategoryAdapter;
import com.hardsoftday.e_commerce.model.ProductCategory;
import com.hardsoftday.e_commerce.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Most Popular"));
        productCategoryList.add(new ProductCategory(2, "All Body Products"));
        productCategoryList.add(new ProductCategory(3, "Skin Care"));
        productCategoryList.add(new ProductCategory(4, "Hair"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "African Mango Shower Gel", "350 ml", "$ 32.00", R.drawable.prod1));
        productsList.add(new Products(3, "Tio Nacho", "250 ml", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(4, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(5, "African Mango Shower Gel", "350 ml", "$ 32.00", R.drawable.prod1));
        productsList.add(new Products(6, "Tio Nacho", "250 ml", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(7, "Tio Pedro", "150 ml", "$ 45.00", R.drawable.prod2));

        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList) {
        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }

    private void setProdItemRecycler(List<Products> productsList) {
        prodItemRecycler = findViewById(R.id.productRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);
    }


}