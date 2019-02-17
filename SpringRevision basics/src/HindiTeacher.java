
public class HindiTeacher implements Teacher {

	Holiday holiday;

	HindiTeacher() {
	}

	HindiTeacher(Holiday holiday) {
		this.holiday = holiday;
	}

	@Override
	public String Subject() {
		// TODO Auto-generated method stub
		System.out.println("My subject is Hindi");
		return "My subject is Hindi";
		
	}

	@Override
	public String IsOnHoliday() {
		return holiday.giveHolidayDetails(this);
	}

}
