package osdar.com.mvpexample;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import io.swagger.client.model.Category;
import nucleus.manager.RequiresPresenter;
import nucleus.view.NucleusActivity;
import osdar.com.mvpexample.presenters.MainPresenter;
import osdar.com.mvpexample.util.ServerAPI;

@RequiresPresenter(MainPresenter.class)
public class MainActivity extends NucleusActivity<MainPresenter> {


//    private ArrayAdapter<ServerAPI.Item> adapter;
    private ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
//        listView.setAdapter(adapter = new ArrayAdapter<>(this, R.layout.item));
        adapter = new ArrayAdapter<String>(this,R.layout.item);
        listView.setAdapter(adapter);
    }

    /**
     *
     * retrofit api
     *
     */
//    public void onItemsNext(ServerAPI.Item[] items) {
//        adapter.clear();
//        adapter.addAll(items);
//    }
//
//    public void onItemsError(Throwable throwable) {
//        Log.d("throwable",throwable.getMessage());
//        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_LONG).show();
//    }


    /**
     *
     * swagger api
     *
     * @param items
     */
    public void onItemsNext(List<Category> items) {
        adapter.clear();
        for (Category c:items
             ) {
            adapter.add(c.getTitleAr());
        }
    }

    public void onItemsError(Throwable throwable) {
        Log.d("throwable",throwable.getMessage());
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_LONG).show();
    }
}
