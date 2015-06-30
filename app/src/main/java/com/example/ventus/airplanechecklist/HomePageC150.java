package com.example.ventus.airplanechecklist;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomePageC150 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listC150 = getListView();
        ArrayAdapter<C150ListType> listAdapter = new ArrayAdapter<C150ListType>(
                this,
                android.R.layout.simple_list_item_1,
                C150ListType.listTypes);
        listC150.setAdapter(listAdapter);

    }


}
