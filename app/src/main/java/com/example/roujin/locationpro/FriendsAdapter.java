package com.example.roujin.locationpro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by roujin on 2016/10/20.
 */
public class FriendsAdapter extends ArrayAdapter<Friends> {
    private int resourceId;

    public FriendsAdapter(Context context, int textViewResourceId, List<Friends> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Friends friends = getItem(position); //获取当前项的Friends实例；
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView friendsImage = (ImageView) view.findViewById(R.id.FriendIamge);
        TextView friendsName = (TextView) view.findViewById(R.id.name);
        Button friendsDelete = (Button) view.findViewById(R.id.delete);
        friendsImage.setImageResource(friends.getImageID());
        friendsName.setText(friends.getName());
        friendsDelete.setText("-");
        return view;
    }
}
