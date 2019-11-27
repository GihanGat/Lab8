package ca.davidpellegrini.scorekeepersolution;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.widget.Toast;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

       // SwitchPreference switchPreference = (SwitchPreference) findPreference("");
    }
}
