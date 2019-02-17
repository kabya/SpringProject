
public class GetHoliday implements Holiday {

	@Override
	public String giveHolidayDetails(Teacher teacher) {

		String result = "";

		if (teacher instanceof HindiTeacher) {

			System.out.println("its a Hindi Teacher");
			result = "not on holiday";
		}

		else if (teacher instanceof EnglishTeacher) {

			System.out.println("its a English Teacher");
			result = "on sick leave";
		}
		return result;
	}

}
