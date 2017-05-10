package widvinedemo.hungamaplay.Presentation.Activity;

import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.lang.reflect.Field;

import widvinedemo.hungamaplay.R;
import widvinedemo.hungamaplay.Utils.BottomNavigationViewHelper;

public class HomeBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_base);
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        toolbar.setLogo(R.mipmap.home_header_logo);
        toolbar.setTitle(getResources().getString(R.string.empty));
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        new BottomNavigationViewHelper().removeShiftMode(bottomNavigationView);

    }
}
