package widvinedemo.hungamaplay.Presentation.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import widvinedemo.hungamaplay.R;

/**
 * Created by rahul.kalamkar on 10-05-2017.
 */
public class HomeTvShowFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_tvshow, null);

        return rootView;
    }
}
