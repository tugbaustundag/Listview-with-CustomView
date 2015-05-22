package com.tugbaustundag.listview_with_customview;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public class ItemListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);
        //Baslık ve acıklama iceriklerimizi listeye ekledik
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 5; i++) {
            String title = String.format("Item %d", i);
            String description = String.format("Description of Item %d", i);
            //Item sınıfında dataları gonderiyorum
            Item item = new Item(title, description);
            items.add(item);
        }
        //ve ItemAdapter sınıfımızı Adapter a set yaptık..
        setListAdapter(new ItemAdapter(getActivity(), items));
        return v;
    }
}
