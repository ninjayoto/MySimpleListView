package app.com.ninja.android.mysimplelistview;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    private static final String[] COLLECTION = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday".split(" ");
//    or just
// private static final String[] COLLECTION = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, COLLECTION)) ;

    }
    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {

        //something useful goes here , like:

        String text = parent.getItemAtPosition(position).toString();

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this, Details.class));
    }
}
