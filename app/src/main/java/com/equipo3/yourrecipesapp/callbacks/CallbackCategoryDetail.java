package com.equipo3.yourrecipesapp.callbacks;

import com.equipo3.yourrecipesapp.models.Category;
import com.equipo3.yourrecipesapp.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class CallbackCategoryDetail {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public Category category = null;
    public List<Recipe> posts = new ArrayList<>();

}
