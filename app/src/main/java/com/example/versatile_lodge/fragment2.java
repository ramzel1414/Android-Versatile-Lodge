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


public class fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    // an Android Fragment Class that is always next to onCreateView() a function for configuring UI components
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // #1 INITIALIZING

        // Initializing Buttons
        Button addButton = view.findViewById(R.id.addButton);
        Button editButton = view.findViewById(R.id.editButton);
        Button deleteButton = view.findViewById(R.id.deleteButton);

        // #2 CLICK LISTENER

        // Set click listener for the Add Room button
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the add room modal when the Add Room button is clicked (already declared in the xml)
                showAddRoomModal();
            }
        });

        // Set click listener for the Edit button
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the edit room modal when the Edit button is clicked (already declared in the xml)
                showEditRoomModal();
            }
        });

        // Set click listener for the Delete button
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the add room modal when the Add Room button is clicked (already declared in the xml)
                showDeleteRoomModal();
            }
        });
    }

    // #3 FUNCTIONS OR METHODS THAT ACTUALLY DO THE TASK outside onViewCreated()

    // Method to show the add room modal
    private void showAddRoomModal() {
        // Inflate the edit room modal layout
        View addRoomModalView = getLayoutInflater().inflate(R.layout.add_room_modal, null);

        // Create and configure the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setView(addRoomModalView);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Get reference to the back button
        Button backButton = addRoomModalView.findViewById(R.id.backAddButton);

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

    // Method to show the edit room modal
    private void showEditRoomModal() {
        // Inflate the edit room modal layout
        View editRoomModalView = getLayoutInflater().inflate(R.layout.edit_room_modal, null);

        // Create and configure the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setView(editRoomModalView);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Get reference to the back button
        Button backButton = editRoomModalView.findViewById(R.id.backEditButton);

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

    // Method to show the delete room modal
    private void showDeleteRoomModal() {
        // Inflate the edit room modal layout
        View deleteRoomModalView = getLayoutInflater().inflate(R.layout.delete_room_modal, null);

        // Create and configure the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setView(deleteRoomModalView);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Get reference to the back button
        Button backButton = deleteRoomModalView.findViewById(R.id.backDeleteButton);

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
