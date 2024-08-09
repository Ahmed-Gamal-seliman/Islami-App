// Generated by view binder compiler. Do not edit!
package com.example.islamiapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.islamiapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout flFragment;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final BottomNavigationView mainBottomNavBar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout flFragment,
      @NonNull ConstraintLayout main, @NonNull BottomNavigationView mainBottomNavBar) {
    this.rootView = rootView;
    this.flFragment = flFragment;
    this.main = main;
    this.mainBottomNavBar = mainBottomNavBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fl_fragment;
      FrameLayout flFragment = ViewBindings.findChildViewById(rootView, id);
      if (flFragment == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.main_bottom_nav_bar;
      BottomNavigationView mainBottomNavBar = ViewBindings.findChildViewById(rootView, id);
      if (mainBottomNavBar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, flFragment, main,
          mainBottomNavBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
