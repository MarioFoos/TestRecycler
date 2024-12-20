package com.mlf.testrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserViewHolder>
{
    private final ArrayList<SimpleUser> items;
    private final int layout;
    private final OnUserClickListener itemClickListener;

    public UserRecyclerAdapter(ArrayList<SimpleUser> items, int layout, OnUserClickListener listener)
    {
        this.items = items;
        this.layout = layout;
        this.itemClickListener = listener;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new UserViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position)
    {
        holder.bind(items.get(position), itemClickListener);
    }
    @Override
    public int getItemCount()
    {
        return items.size();
    }
}
