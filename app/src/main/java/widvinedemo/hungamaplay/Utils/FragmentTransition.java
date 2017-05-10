package widvinedemo.hungamaplay.Utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import widvinedemo.hungamaplay.Presentation.Activity.HomeBaseActivity;
import widvinedemo.hungamaplay.R;

/**
 * Created by rahul.kalamkar on 10-05-2017.
 */
public class FragmentTransition {
    Context context;
    public FragmentTransition(Context context) {
        this.context = context;
    }

    @SuppressLint("NewApi")
    public void showFragment(Fragment fragmentToShow, String mBackstackFragmentName) {
        // get fragment manager
        FragmentManager fm = ((HomeBaseActivity)context).getSupportFragmentManager();

// add
        FragmentTransaction ft = fm.beginTransaction();
        //ft.add(R.id.main_container, new YourFragment());
        ft.add(R.id.main_container, fragmentToShow, mBackstackFragmentName);
        ft.addToBackStack(mBackstackFragmentName);
        ft.commit();
/*
// replace
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.main_container, new YourFragment());
        ft.commit();

// remove
        Fragment fragment = fm.findFragmentById(R.id.your_placehodler);
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(fragment);
        ft.commit();*/
    }
}
