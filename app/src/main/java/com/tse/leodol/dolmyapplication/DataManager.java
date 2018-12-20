package com.tse.leodol.dolmyapplication;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager INSTANCE;

    private List<String> nameList;

    public DataManager(){
        nameList = new ArrayList<>();
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public void addItem(String texte) {
        this.nameList.add(texte);
    }
}
