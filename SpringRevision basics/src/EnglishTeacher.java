
public class EnglishTeacher implements Teacher {
	
	Holiday holiday;
	
	EnglishTeacher(){}
	EnglishTeacher(Holiday holiday){
		this.holiday = holiday;
	}
	
	
	

	@Override
	public String Subject() {
		// TODO Auto-generated method stub
		System.out.println("My subject is English");


		return "My is English";
	}

	@Override
	public String IsOnHoliday() {
		// TODO Auto-generated method stub
		return holiday.giveHolidayDetails(this);
	}

}
