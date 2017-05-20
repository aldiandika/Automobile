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

public class RecyclerAdapterMar extends RecyclerView.Adapter<RecyclerAdapterMar.ViewHolder> {

    private int lastPosition = -1;

    private int[] poto = { R.drawable.kompresor,
            R.drawable.kompresor,
            R.drawable.ban,
            R.drawable.ban,};

    private String[] nama = {"Kompresor Pompa Ban Mobil Motor Elektrik",
            "Kompresor Pompa Ban Mobil Motor Elektrik",
            "Ban Mobil Accelera Alpha 195/65 R15",
            "Ban Mobil Accelera Alpha 195/65 R15"};

    private String[] harga = {"Rp 120.000",
            "Rp 120.000",
            "Rp 492.050",
            "Rp 492.050"};

    private String[] toko = {"Oto Pedia",
            "Oto Pedia",
            "tkbgroupindonesia",
            "tkbgroupindonesia"};

    private String[] lokasi = {"Jakarta",
            "Jakarta",
            "Jakarta",
            "Jakarta"};


    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView ketBrg;
        public TextView ketHrg;
        public TextView ketTok;
        public TextView ketLoc;
        public ImageView img_market;


        public ViewHolder(View itemView) {
            super(itemView);
            img_market = (ImageView) itemView.findViewById(R.id.img_market);
            ketBrg = (TextView) itemView.findViewById(R.id.ket_brg);
            ketHrg = (TextView)itemView.findViewById(R.id.ket_hrg);
            ketTok = (TextView) itemView.findViewById(R.id.ket_tok);
            ketLoc = (TextView)itemView.findViewById(R.id.ket_loc);

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
    public RecyclerAdapterMar.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_itemmarket, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterMar.ViewHolder holder, int position) {
        holder.img_market.setImageResource(poto[position]);
        holder.ketBrg.setText(nama[position]);
        holder.ketHrg.setText(harga[position]);
        holder.ketTok.setText(toko[position]);
        holder.ketLoc.setText(lokasi[position]);
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
        return nama.length;
//        return pos;
    }
}
