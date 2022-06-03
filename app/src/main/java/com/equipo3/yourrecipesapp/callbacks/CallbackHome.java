package com.equipo3.yourrecipesapp.callbacks;

import com.equipo3.yourrecipesapp.models.Category;
import com.equipo3.yourrecipesapp.models.Recipe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallbackHome implements Serializable {

    public String status = "";
    public List<Recipe> featured = new ArrayList<>();
    public List<Category> category = new ArrayList<>();
    public List<Recipe> recent = new ArrayList<>();
    public List<Recipe> videos = new ArrayList<>();

}
