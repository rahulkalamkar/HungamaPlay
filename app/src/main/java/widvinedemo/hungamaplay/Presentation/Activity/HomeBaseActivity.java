package widvinedemo.hungamaplay.Presentation.Activity;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import java.lang.reflect.Field;

import widvinedemo.hungamaplay.Presentation.Fragment.HomeDownloadFragment;
import widvinedemo.hungamaplay.Presentation.Fragment.HomeMovieFragment;
import widvinedemo.hungamaplay.Presentation.Fragment.HomeMusicFragment;
import widvinedemo.hungamaplay.Presentation.Fragment.HomeTvShowFragment;
import widvinedemo.hungamaplay.R;
import widvinedemo.hungamaplay.Utils.BottomNavigationViewHelper;
import widvinedemo.hungamaplay.Utils.FragmentTransition;

public class HomeBaseActivity extends AppCompatActivity {

    private FragmentTransition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_base);

        transition = new FragmentTransition(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.home_header_logo);
        toolbar.setTitle(getResources().getString(R.string.empty));
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        new BottomNavigationViewHelper().removeShiftMode(bottomNavigationView);

        HomeMovieFragment homeMovieFragment = new HomeMovieFragment();
        transition.showFragment(homeMovieFragment, "Movie");

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_movie:
                        HomeMovieFragment homeMovieFragment = new HomeMovieFragment();
                        transition.showFragment(homeMovieFragment, "Movie");
                        break;
                    case R.id.action_tv_show:
                        HomeTvShowFragment homeTvShowFragment = new HomeTvShowFragment();
                        transition.showFragment(homeTvShowFragment, "TvShow");
                        break;
                    case R.id.action_video:
                        HomeMusicFragment homeMusicFragment = new HomeMusicFragment();
                        transition.showFragment(homeMusicFragment, "Video");
                        break;
                    case R.id.action_download:
                        HomeDownloadFragment homeDownloadFragment = new HomeDownloadFragment();
                        transition.showFragment(homeDownloadFragment, "Download");
                        break;
                }
                return false;
            }
        });
    }
}
