package xs.jimmy.app.locationtracker;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel implements MainActivityContract.ViewModel{
    private MutableLiveData<Boolean> isPermissionGranted;

    public MutableLiveData<String> getText() {
        return text;
    }

    private MutableLiveData<String> text = new MutableLiveData<>();
    @Override
    public void start() {
        isPermissionGranted = new MutableLiveData<>();
    }

    @Override
    public void locationPermissionGranted() {
        isPermissionGranted.setValue(true);
    }

    @Override
    public MutableLiveData<Boolean> getIsPermissionGranted() {
        if(isPermissionGranted == null)
            isPermissionGranted = new MutableLiveData<>();
        return isPermissionGranted;
    }

    @Override
    public void setIsPermissionGranted(boolean isPermissionGranted) {
        this.isPermissionGranted.setValue(isPermissionGranted);
    }

    @Override
    public void setText(String text) {
        this.text.setValue(text);
    }
}
