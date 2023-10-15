public class CustomerDetailsTest {
    public static void main(String [] args){
        CustomerDetails CustomerDetailsObj1=new CustomerDetails("onkar", 123, "distance", 3.5f);
        CustomerDetails CustomerDetailsObj2=new CustomerDetails("suresh", 345, "near", 0.75f);
        CustomerDetailsObj1.showCustomerDetails();
        CustomerDetailsObj2.showCustomerDetails();
        CustomerDetailsObj1.increaseEyeNumber(0.5);
        CustomerDetailsObj1.showCustomerDetails();

    }
}


class CustomerDetails{
    private String name;
    private int custID;
    private String eyeNumberType;
    private double eyeNumber;

    public CustomerDetails(String name, int custID, String eyeNumberType, double eyeNumber) {
        this.name = name;
        this.custID = custID;
        this.eyeNumberType = eyeNumberType;
        this.eyeNumber = eyeNumber;
    }

    public void showCustomerDetails(){
        System.out.println("CUSTOMER NAME:"+ name);
        System.out.println("CUSTOMER ID:"+ custID);
        System.out.println("CUSTOMER EYE NUMBER TYPE:"+ eyeNumberType);
        System.out.println("FINAL CUSTOMER EYE NUMBER:"+ eyeNumber);
        System.out.println("========================================");
    }

    public double increaseEyeNumber(double increasedEyeNum){
        eyeNumber+=increasedEyeNum;
        System.out.println("The eye number of "+name+ " is increased by:"+increasedEyeNum);
        return eyeNumber;
    }

    public double decreaseEyeNumber(double decreasedEyeNum){
        eyeNumber+=decreasedEyeNum;
        System.out.println("The eye number of "+name+ " is decreased by:"+decreasedEyeNum);
        return eyeNumber;
    }

}

class EyeWear{

}

class Lenses{

}

class Specks extends EyeWear{
    Lenses lensesObj1=new Lenses();

    void vision(PowerLenseNum PowerLenseNumObj,Frames framesObj){

    }


}

class PowerLenseNum{
    
}
class Frames{

}