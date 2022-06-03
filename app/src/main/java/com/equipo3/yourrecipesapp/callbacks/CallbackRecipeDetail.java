package com.equipo3.yourrecipesapp.callbacks;

import com.equipo3.yourrecipesapp.models.Images;
import com.equipo3.yourrecipesapp.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class CallbackRecipeDetail {

    public String status = "";
    public Recipe post = null;
    public List<Images> images = new ArrayList<>();
    public List<Recipe> related = new ArrayList<>();

}