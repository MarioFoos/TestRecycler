package com.mlf.testrecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder
{
    private final View view;
    private final TextView name;
    private final TextView email;
    private final ImageView image;
    private final int clSkyBlue, clWhite;

    public UserViewHolder(View itemView)
    {
        super(itemView);
        view = itemView;
        name = itemView.findViewById(R.id.userName);
        email = itemView.findViewById(R.id.userEmail);
        image = itemView.findViewById(R.id.userImage);
        clWhite = ContextCompat.getColor(view.getContext(), R.color.white);
        clSkyBlue = ContextCompat.getColor(view.getContext(), R.color.skyblue);
    }
    public void bind(SimpleUser user, final OnUserClickListener listener)
    {
        view.setBackgroundColor((getAdapterPosition()%2 == 0) ? clSkyBlue : clWhite);

        name.setText(user.getName());
        email.setText(user.getEmail());
        image.setImageResource(user.getImage());

        itemView.setOnClickListener(v -> listener.onItemClick(user));
    }
}
