package com.example.nk31001905.tabproject;

/**
 * Created by nk31001905 on 12/May/15.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Edwin on 15/02/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

    Tab1 tab1;
    Tab2 tab2;
    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        tab1=new Tab1();
        tab2 = new Tab2();

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;


    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            //Tab1 tab1 = new Tab1();

            return tab1;
        }
        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            //Tab2 tab2 = new Tab2();
            return tab2;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip

    public void refreshContent(){
        tab1.displayVariants();
        tab2.displayVariants();

    }
    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
