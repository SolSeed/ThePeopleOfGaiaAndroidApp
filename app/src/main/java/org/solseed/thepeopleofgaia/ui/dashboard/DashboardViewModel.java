package org.solseed.thepeopleofgaia.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Choose a service:\n2019-09-28\n2019-10-05\n2019-10-12\n2019-10-19\n2019-10-26\n2019-11-02");
    }

    public LiveData<String> getText() {
        return mText;
    }
}