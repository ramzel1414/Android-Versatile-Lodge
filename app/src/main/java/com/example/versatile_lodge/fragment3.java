package com.example.versatile_lodge;


import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment3, container, false);

    }
    
    //an Android Fragment Class that is always next to onCreateView() a function for configuring UI components
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // #1 INITIALIZING

        // Initializing Buttons
        Button bookButton = view.findViewById(R.id.bookButton);

        // #2 CLICK LISTENER

        // Set click listener for the Book Room button
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBookRoomModal();
            }
        });

    }

    // #3 FUNCTIONS OR METHODS THAT ACTUALLY DO THE TASK outside onViewCreated()

    // Method to show the book room modal
    private void showBookRoomModal() {
        // Inflate the edit room modal layout
        View bookRoomModalView = getLayoutInflater().inflate(R.layout.book_room_modal, null);

        // Create and configure the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setView(bookRoomModalView);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Get reference to the back button
        Button backButton = bookRoomModalView.findViewById(R.id.backBookButton);

        // Set click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dismiss the dialog when back button is clicked
                dialog.dismiss();
            }
        });

        // Show the dialog
        dialog.show();
    }
}