// Generated by view binder compiler. Do not edit!
package com.example.islamiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.islamiapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHadeethBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final RecyclerView rvAhadeeth;

  @NonNull
  public final View viewLowerLine;

  @NonNull
  public final View viewUpperLine;

  private FragmentHadeethBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline,
      @NonNull RecyclerView rvAhadeeth, @NonNull View viewLowerLine, @NonNull View viewUpperLine) {
    this.rootView = rootView;
    this.guideline = guideline;
    this.rvAhadeeth = rvAhadeeth;
    this.viewLowerLine = viewLowerLine;
    this.viewUpperLine = viewUpperLine;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHadeethBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHadeethBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_hadeeth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHadeethBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.rv_ahadeeth;
      RecyclerView rvAhadeeth = ViewBindings.findChildViewById(rootView, id);
      if (rvAhadeeth == null) {
        break missingId;
      }

      id = R.id.view_lower_line;
      View viewLowerLine = ViewBindings.findChildViewById(rootView, id);
      if (viewLowerLine == null) {
        break missingId;
      }

      id = R.id.view_upper_line;
      View viewUpperLine = ViewBindings.findChildViewById(rootView, id);
      if (viewUpperLine == null) {
        break missingId;
      }

      return new FragmentHadeethBinding((ConstraintLayout) rootView, guideline, rvAhadeeth,
          viewLowerLine, viewUpperLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
