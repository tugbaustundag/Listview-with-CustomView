package com.tugbaustundag.listview_with_customview;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemView extends LinearLayout {
    private TextView mTitleTextView;
    private TextView mDescriptionTextView;

    public static ItemView inflate(ViewGroup parent) {
        ItemView itemView = (ItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return itemView;
    }

    public ItemView(Context c) {
        this(c, null);
    }

    public ItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        //Her item ın kullancagı xml layout yükledik.
        LayoutInflater.from(context).inflate(R.layout.item_view_children, this, true);
        setupChildren(context);
    }

    private void setupChildren(Context context) {
        //Item larda bulunan  Yuvarlak objeyi item_view_children xmlde CircleView sınfını yükleyerek olusturdun

        //item_view_children xml inde bulunan  LinearLayout icine Java programlamayla TextView'ler tanımladık

        //LinearLayout'u tanımladık
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearMain);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //LinearLayout' a margin değerleri atadık.
        layoutParams.setMargins(30, 20, 30, 0);
        layout.setLayoutParams(layoutParams);

        //LinearLayout icine TextView view elementleri ekledim
        mTitleTextView = new TextView(context);
        mDescriptionTextView = new TextView(context);
        layout.addView(mTitleTextView);
        layout.addView(mDescriptionTextView);
    }

    public void setItem(Item item) {
        //LinearLayout a ekledğim TextView elementlerine , Item sınıfında tuttugumuz icerikleri atadık...
        mTitleTextView.setText(item.getTitle());
        mDescriptionTextView.setText(item.getDescription());
    }
}
