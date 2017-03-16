package pk.com.lib.map.modle;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pukai on 16/12/21.
 */
public class FiveTrace implements Parcelable {
    private long time;
    private double latitude;
    private double longitude;
    private float bearing;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public float getBearing() {
        return bearing;
    }

    public void setBearing(float bearing) {
        this.bearing = bearing;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.time);
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeFloat(this.bearing);
    }

    public FiveTrace() {
    }

    protected FiveTrace(Parcel in) {
        this.time = in.readLong();
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.bearing = in.readFloat();
    }

    public static final Creator<FiveTrace> CREATOR = new Creator<FiveTrace>() {
        @Override
        public FiveTrace createFromParcel(Parcel source) {
            return new FiveTrace(source);
        }

        @Override
        public FiveTrace[] newArray(int size) {
            return new FiveTrace[size];
        }
    };
}
