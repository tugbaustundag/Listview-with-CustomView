package com.tugbaustundag.listview_with_customview;

/**
 * Listenen her bir içeriği Item sınıfında tuttum.
 */
public class Item {
    private String mTitle;
    private String mDescription;
    
    public Item(String title, String description) {
        super();
        mTitle = title;
        mDescription = description;
    }
    public String getTitle() {
        return mTitle;
    }
    public String getDescription() {
        return mDescription;
    }

}
