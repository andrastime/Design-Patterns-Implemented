package iterator;

public class Office {
    int officeNo;

    public Office(int officeNo){
        this.officeNo = officeNo;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public int getOfficeFloor(){
        return officeNo/100;
    }
}
