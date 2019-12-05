package Task3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Course {
	Scanner cin = new Scanner(System.in);
	
	private String name;
	private Date startDate;
	private Date endDate;
	private ArrayList<Module> modules = new ArrayList<>();
	
	public Course() {
		//1.Enter name
		System.out.print("Input course name:");
		this.name = cin.nextLine(); 
		
		//2.Enter dates information
		this.startDate = enterDate("Input start date(dd-MM-yyyy):");
		this.endDate = enterDate("Input end date(dd-MM-yyyy):");
		cin.nextLine();
		//3.Entering module information
		boolean flag=true;
		do {
			System.out.print("Do you want do add new module(y/n)?");
			String answer = cin.nextLine();
			if (answer.charAt(0) == 'y') {
				Module newModule = new Module();
				modules.add(newModule);
			}
			else flag=false;
		}
		while(flag);
		
	}
	
	//Support method handling date input from user
	private Date enterDate(String name) {
		System.out.println(name);

		String date = cin.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date2=null;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse(date);
		} catch (ParseException e) {
		 
		    e.printStackTrace();
		    return null;
		}
		return date2;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getName() {
		return name;
	}

	public Date getEndDate() {
		return endDate;
	}
	public void getModules() {
		for (Module oneModule:modules) {
			System.out.println(oneModule.toString());
		}
	}
}
