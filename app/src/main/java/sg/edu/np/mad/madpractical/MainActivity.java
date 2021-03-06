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

    private User user;
    private TextView name;
    private TextView desc;

    //User user = new User("Tricia","i is dont know what to type here. please send help. i is dyinggg. i wanna drink bubble tea, please treat me :') me wanna go find sugar dadi or mami, have lifetime supply of bubble teaa!!",0,false);
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"Main Activity Created");

        this.name = findViewById(R.id.name_text);
        this.desc = findViewById(R.id.description_text);

        int id = getIntent().getIntExtra("id", 0);
        User info = ListActivity.usersList.get(id);

        this.setUser(info);

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

    private void setUser(User user){
        this.user = user;
        this.name.setText(user.getName());
        this.desc.setText(user.getDescription());
        this.user.setFollowed(this.user.isFollowed());
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