package me.elb1to.login_ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Alert extends DialogFragment {

    private final String val;

    public Alert(String val) {
        this.val = val;
    }

    @NonNull @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(val).setPositiveButton("Close", (dialog, which) -> dialog.cancel());

        return builder.create();
    }
}
