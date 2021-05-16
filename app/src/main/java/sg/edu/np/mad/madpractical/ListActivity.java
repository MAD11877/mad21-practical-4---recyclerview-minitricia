package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sg.edu.np.mad.madpractical.R;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "List Activity";
    RecyclerView recyclerView;
    AlertDialog.Builder builder;
    static List<User> usersList = new ArrayList<>();

    private static int randInt(){
        Random n = new Random();
        return(n.nextInt());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        for (int i = 0; i < 20; i++){
            usersList.add(new User("Name" + randInt(),
                    "Description " + randInt(),
                    i,
                    randInt() % 2 == 1
            ));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        UserAdapter adapter = new UserAdapter(usersList);
        LinearLayoutManager mLayoutManager =  new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
