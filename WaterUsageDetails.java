import java.util.Scanner;
public class WaterUsageDetails {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number of family members:");
int familyMembers = scanner.nextInt();

System.out.print("Enter Water consumed:");
double waterConsumed  = scanner.nextDouble();

System.out.print("Enter House number :");
int houseNumber = scanner.nextInt();

System.out.print("Enter Water usage status:");
char usageStatus = scanner.next().charAt(0);

System.out.println("Household Details");
System.out.println("Family Members:" + familyMembers);
System.out.println("Water Consumed:" + waterConsumed +"Liters");
System.out.println("House Number" + houseNumber);
System.out.println("Usage Status: " + usageStatus);
}
}



