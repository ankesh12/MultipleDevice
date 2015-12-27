package layout;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.multdev.multipledevice.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FieldPageFragment extends Fragment {

    public FieldPageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_field_page, container, false);
    }
}
