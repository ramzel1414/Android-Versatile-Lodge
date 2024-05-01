package com.example.versatile_lodge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.squareup.picasso.Picasso;

public class fragment4 extends Fragment {

    private TextView nameTextView, emailTextView;
    private ImageView profileImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment4, container, false);

        nameTextView = view.findViewById(R.id.name);
        emailTextView = view.findViewById(R.id.email);
        profileImageView = view.findViewById(R.id.profile_image);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Retrieve the signed-in account
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(requireContext());
        if (account != null) {
            // Set the name and email
            nameTextView.setText(account.getDisplayName());
            emailTextView.setText(account.getEmail());

            // Load profile image using Picasso library
            if (account.getPhotoUrl() != null) {
                Picasso.get().load(account.getPhotoUrl()).into(profileImageView);
            } else {
                // Set a default image if no profile image available
                profileImageView.setImageResource(R.drawable.baseline_account_circle_24);
            }
        }

    }
}