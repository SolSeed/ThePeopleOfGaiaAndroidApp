package org.solseed.thepeopleofgaia.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Featured Resource: \nMillenial Gaia Statue\n\nChoose a resource:\nBells\nBowls\nCandles\nCups\nMatches\nTree Seeds");
    }

    public LiveData<String> getText() {
        return mText;
    }
}