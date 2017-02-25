package com.bignerdranch.admin.myapplication;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2017/2/21.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    public Context mContext;

    public List<Card> mCards;

    static class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView cardName;
        TextView cardPassword;
        TextView cardNote;
        TextView cardAccount;
        ImageView cardImage;

        public ViewHolder(View view) {
            super(view);
            cardView= (CardView) view;
            cardName= (TextView) view.findViewById(R.id.card_name);

            cardPassword= (TextView) view.findViewById(R.id.card_password);

            cardImage= (ImageView) view.findViewById(R.id.card_copy);
            cardAccount= (TextView) view.findViewById(R.id.card_account);
        }
    }
    public CardAdapter(List<Card> cardList){
        mCards=cardList;
    }
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext ==null){
            mContext = parent.getContext();
        }
        View view= LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        final ViewHolder holder =new ViewHolder(view);
        holder.cardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {
        Card card=mCards.get(position);
        holder.cardName.setText(card.getName());
        holder.cardAccount.setText(card.getAccount());
        holder.cardPassword.setText(card.getPassword());

    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }
}
