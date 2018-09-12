public class MyMainApplication
{
public static void main(String args[])
{
Employee emp=new Employee(); 
emp.getLogin();
emp.empName=args[1];
emp.empSalary=Integer.parseInt(args[0]);
System.out.println("SALARY IS "+emp.empSalary+"  "+"Name is "+emp.empName);
System.out.println("Welcome");
}
}