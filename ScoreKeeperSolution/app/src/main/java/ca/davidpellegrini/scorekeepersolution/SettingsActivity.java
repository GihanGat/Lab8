package ca.davidpellegrini.scorekeepersolution;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;


public class SettingsActivity extends Activity {


    @Override
    public void onCreate(Bundle sIS){
        super.onCreate(sIS);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
    }


}