package libwy.symbio.com.puxian;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wilbyang on 20/11/15.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.StoryViewHolder>{


    private final Context context;

    public class StoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cv;
        TextView title;
        TextView summary;
        ImageView storyPhoto;
        Story story;

        StoryViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            title = (TextView)itemView.findViewById(R.id.title);
            summary = (TextView)itemView.findViewById(R.id.summary);
            storyPhoto = (ImageView)itemView.findViewById(R.id.story_photo);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(story.getUrl()));
            RVAdapter.this.context.startActivity(i);
        }
    }

    List<Story> stories;

    RVAdapter(Context context, List<Story> persons){
        this.context = context;
        this.stories = persons;
    }
    @Override
    public int getItemCount() {
        return stories.size();
    }

    @Override
    public StoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        StoryViewHolder pvh = new StoryViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(StoryViewHolder storyViewHolder, int i) {

        storyViewHolder.title.setText(stories.get(i).getTitle());
        storyViewHolder.summary.setText(stories.get(i).getSummary());
        storyViewHolder.story = stories.get(i);
        //storyViewHolder.storyPhoto.setImageResource(stories.get(i).getImageUrl());
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
