package com.acc;

public class CustomerDetailsTest {
    public static void main(String [] args){
        CustomerDetails CustomerDetailsObj1=new CustomerDetails("onkar", 123, "distance", 3.5f);
        CustomerDetails CustomerDetailsObj2=new CustomerDetails("suresh", 345, "near", 0.75f);
        /*CustomerDetailsObj1.showCustomerDetails();
        CustomerDetailsObj2.showCustomerDetails();
        CustomerDetailsObj1.increaseEyeNumber(0.5);
        CustomerDetailsObj1.showCustomerDetails();*/
        
        Specks specksObj1=new Specks();
        PowerLenseNum powerLenseNumobj1=new PowerLenseNum("distance", 3.25f, 3.5f, "Anti Glare");
        Frames framesObj1=new Frames("Fibre", "Green", 250.0f, "Rimless");
        specksObj1.vision(CustomerDetailsObj1,powerLenseNumobj1, framesObj1);

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
    
    

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCustID() {
		return custID;
	}



	public void setCustID(int custID) {
		this.custID = custID;
	}



	public String getEyeNumberType() {
		return eyeNumberType;
	}



	public void setEyeNumberType(String eyeNumberType) {
		this.eyeNumberType = eyeNumberType;
	}



	public double getEyeNumber() {
		return eyeNumber;
	}



	public void setEyeNumber(double eyeNumber) {
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

class Specks extends EyeWear{  //Is-A relationship
    Lenses lensesObj1=new Lenses();  //Has-A relationship

    void vision(CustomerDetails customerDetailsObj,PowerLenseNum PowerLenseNumObj,Frames framesObj){
    	int price=100;
    	if(PowerLenseNumObj.getLeftEyeNum()>=0 && PowerLenseNumObj.getRightEyeNum()<=5) {
    		price+=300;
    	}
    	else if(PowerLenseNumObj.getLeftEyeNum()>=6 && PowerLenseNumObj.getRightEyeNum()<=10) {
    		price+=700;
    	}
    	if(PowerLenseNumObj.getFeature().equals("Anti Glare")) {
    		price+=350;
    	}
    	else if(PowerLenseNumObj.getFeature().equals("Blue Cut")) {
    		price+=400;
    	}
    	else if(PowerLenseNumObj.getFeature().equals("Anti Fog")) {
    		price+=250;
    	}
    	if(framesObj.getMaterial().equals("Fibre")) {
    		price+=400;
    	}
    	else if(framesObj.getMaterial().equals("metal")) {
    		price+=300;
    	}
    	if(framesObj.getStyle().equals("Rimless")) {
    		price+=200;

    	}
    	else if(framesObj.getStyle().equals("Full Rim")) {
    		price+=300;

    	}
    	else if(framesObj.getStyle().equals("Half Rim")) {
    		price+=250;

    	}
    	System.out.println("The final price of the speck for customer "+customerDetailsObj.getName() +" having customer ID-"+customerDetailsObj.getCustID()+" is:"+price);
    }


}

class PowerLenseNum{
	private String type;
    private double leftEyeNum;
    private double rightEyeNum;
    private String feature;
    
	public PowerLenseNum(String type, double leftEyeNum, double rightEyeNum, String feature) {
		super();
		this.type = type;
		this.leftEyeNum = leftEyeNum;
		this.rightEyeNum = rightEyeNum;
		this.feature = feature;
	}
	
	public double getLeftEyeNum() {
		return leftEyeNum;
	}
	public void setLeftEyeNum(double leftEyeNum) {
		this.leftEyeNum = leftEyeNum;
	}
	public double getRightEyeNum() {
		return rightEyeNum;
	}
	public void setRightEyeNum(double rightEyeNum) {
		this.rightEyeNum = rightEyeNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String style) {
		this.feature = style;
	}
    
    
}
class Frames{
	private String material;
	private String colour;
	private double weight;
	private String style;
	
	public Frames(String material, String colour, double weight, String style) {
		super();
		this.material = material;
		this.colour = colour;
		this.weight = weight;
		this.style = style;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
