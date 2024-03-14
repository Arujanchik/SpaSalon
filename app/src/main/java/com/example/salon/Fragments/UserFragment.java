package com.example.salon.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.salon.R;
import com.example.salon.User;
import com.example.salon.activity.LoginActivity;
import com.example.salon.activity.MainActivity;

public class UserFragment extends Fragment {

    private TextView textViewUserName;
    private TextView textViewUserEmail;
    private ImageView imageViewUserProfile;
    private Button buttonLogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        textViewUserName = view.findViewById(R.id.text_view_user_name);
        textViewUserEmail = view.findViewById(R.id.text_view_user_email);
        imageViewUserProfile = view.findViewById(R.id.image_view_user_profile);
        buttonLogout = view.findViewById(R.id.button_logout);

        User currentUser = new User("Иван Иванов", "ivan@example.com", R.drawable.ic_profile);

        textViewUserName.setText(currentUser.getName());
        textViewUserEmail.setText(currentUser.getEmail());
        imageViewUserProfile.setImageResource(currentUser.getProfileImageId());


        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
