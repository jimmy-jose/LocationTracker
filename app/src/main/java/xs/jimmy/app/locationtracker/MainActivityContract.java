package xs.jimmy.app.locationtracker;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

public class MainActivityContract {

    interface View {

    }

    interface ViewModel{

        /**
         * Method to notify start of activity
         */
        void start();
        /**
         * Method to notify that the location permission is granted
         */
        void locationPermissionGranted();

        /**
         * @return isPermissionGranted live data to observe on to
         */
        MutableLiveData<Boolean> getIsPermissionGranted();

        void setIsPermissionGranted(boolean isPermissionGranted);

        void setText(String locationText);
    }

}
