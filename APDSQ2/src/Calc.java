import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
	public void calc(){
		Scanner input = new Scanner(System.in);
		ArrayList <People> Job = new ArrayList<People>();
		People a = new People();
		System.out.println("Qual o nome do Funcionário?");
		a.setName(input.nextLine());
		System.out.println("Qual empresa que ele trabalha?");
		a.setCompany(input.nextLine());
		System.out.println("Qual o dia de Admissão?");
		a.setDay1(input.nextInt());
		System.out.println("Qual o mês de Admissão?");
		a.setMonth1(input.nextInt());
		System.out.println("Qual o ano de Admissão?");
		a.setYear1(input.nextInt());
		System.out.println("Qual o dia de Demissão?");
		a.setDay2(input.nextInt());
		System.out.println("Qual o mês de Demissão?");
		a.setMonth2(input.nextInt());
		System.out.println("Qual o ano de Demissão?");
		a.setYear2(input.nextInt());
		Job.add(a);
		for (int i = 0; i < Job.size(); i++ ) {
			LocalDate DateA = LocalDate.of(Job.get(i).Year1, Job.get(i).Month1, Job.get(i).Day1);
			LocalDate DateB = LocalDate.of(Job.get(i).Year2, Job.get(i).Month2, Job.get(i).Day2);
			Period JobTime = Period.between(DateA, DateB);
			int Year, Month, Day;
			Year = JobTime.getYears();
			Month = JobTime.getMonths();
			Day = JobTime.getDays();
			
			System.out.println(Job.get(i).getName() + " Trabalhou na empresa " + Job.get(i).getCompany() + " por " + Year + " anos, " + Month + " meses e " + Day + " dias \n");
		}
	}
}
