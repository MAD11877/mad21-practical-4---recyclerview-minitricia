package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import sg.edu.np.mad.madpractical.R;

public class MainActivity extends AppCompatActivity {

    User user = new User("Tricia","i is dont know what to type here. please send help. i is dyinggg. i wanna drink bubble tea, please treat me :') me wanna go find sugar dadi or mami, have lifetime supply of bubble teaa!!",0,false);
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"Main Activity Created");

        Intent receivedData = getIntent();
        int myRandom = receivedData.getIntExtra("Random", 0);

        TextView name = findViewById(R.id.name_text);
        TextView desc = findViewById(R.id.description_text);
        name.setText(user.name + " " + myRandom);
        desc.setText(user.description);

        Button button = findViewById(R.id.follow_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false){
                    button.setText("Unfollow");
                    user.setFollowed(true);
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_LONG).show();
                }
                else{
                    button.setText("Follow");
                    user.setFollowed(false);
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}