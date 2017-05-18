package com.example.aldiandika.automobile;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Crew on 5/4/2017.
 */

public class RecyclerAdapterH extends RecyclerView.Adapter<RecyclerAdapterH.ViewHolder> {

    private int lastPosition = -1;


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView item;


        public ViewHolder(View itemView) {
            super(itemView);
            item = (ImageView) itemView.findViewById(R.id.item);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int posisi = getAdapterPosition();

//                    Context context = v.getContext();
//                    Intent i = new Intent(context,DialogBox.class);
//                    context.startActivity(i);
//                    Snackbar.make(v, "Click detected on item " + posisi,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                }

            });
        }
    }



    @Override
    public RecyclerAdapterH.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_home, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterH.ViewHolder holder, int position) {
        holder.item.setImageResource(R.drawable.main_card);
        setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(),
                    android.R.anim.fade_in);
            animation.setDuration(1000);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
    @Override
    public int getItemCount() {
        return 5;
//        return pos;
    }
}
