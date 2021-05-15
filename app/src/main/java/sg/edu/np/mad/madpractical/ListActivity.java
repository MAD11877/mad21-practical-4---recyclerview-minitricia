package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import sg.edu.np.mad.madpractical.R;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "List Activity";
    ImageView imageView;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        builder = new AlertDialog.Builder(this);
        imageView = findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("MADness")
                        .setCancelable(false)
                        .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        .setNegativeButton("View", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                final int random = new Random().nextInt();
                                Bundle bundle = new Bundle();
                                bundle.putInt("Random", random);
                                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                                intent.putExtras(bundle);
                                Log.v(TAG, "Passing Random Number" + random);

                                startActivity(intent);
                            }
                        });

                AlertDialog alert = builder.create();
                alert.setTitle("Profile");
                alert.show();

            }
        });
    }
}
