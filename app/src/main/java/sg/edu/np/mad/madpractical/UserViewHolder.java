package sg.edu.np.mad.madpractical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name;
    TextView description;

    public UserViewHolder(View itemView){
        super(itemView);

        image = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.textView);
        description = itemView.findViewById(R.id.textView2);
    }
}
