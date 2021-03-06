package dgu.donggukeas_client.model.firebase;

/**
 * Created by hanseungbeom on 2017. 11. 19..
 */

public class StudentWifi {
    private String studentId;
    private String wifiInfo;
    private String updatedTime;

    public StudentWifi(String studentId, String wifiInfo,String updatedTime) {
        this.studentId = studentId;
        this.wifiInfo = wifiInfo;
        this.updatedTime = updatedTime;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getWifiInfo() {
        return wifiInfo;
    }

    public void setWifiInfo(String wifiInfo) {
        this.wifiInfo = wifiInfo;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
