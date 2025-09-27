public class Student {
    private int studentId;   // 학번
    private String name;     // 이름
    private String major;    // 전공
    private long phone;      // 전화번호 (숫자로만 저장)

    // 생성자
    public Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    // Getter & Setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    // 전화번호 포맷 변환 메소드
    public String getFormattedPhone() {
        String phoneStr = Long.toString(phone);
        // 앞자리 0 복구
        phoneStr = "0" + phoneStr;
        // 010-xxxx-xxxx 형태로 변환
        return phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);
    }
}
