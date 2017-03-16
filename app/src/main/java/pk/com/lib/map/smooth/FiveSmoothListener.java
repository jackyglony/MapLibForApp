package pk.com.lib.map.smooth;


import pk.com.lib.map.modle.FiveLatLng;

/**
 * Created by pukai on 16/12/27.
 */
public interface FiveSmoothListener {
    /**
     * 平滑移动过程中的回调
     *
     * @param distance   移动的当前距离
     * @param fiveLatLng 当前移动到的点
     */
    void move(double distance, FiveLatLng fiveLatLng, int index);

    /**
     * 平滑移动结束后的回调
     */
    void smoothFinish();
}
