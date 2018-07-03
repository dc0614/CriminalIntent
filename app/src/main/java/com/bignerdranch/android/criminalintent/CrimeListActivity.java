package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/*
 @author: Diana Copeland
 Challenge for Chapter 8
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
