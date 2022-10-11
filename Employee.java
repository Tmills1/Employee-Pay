class Employee{

private int id;
private double payRate;
private double hours;
private String fname,lname;


public static DecimalFormat td = new DecimalFormat("0.00");
   public static Scanner scan = new Scanner(System.in);
   public static void main (String args[]) throws FileNotFoundException
 {    File infile=new File("Employeetext.txt");
      Scanner in= new Scanner(infile);
      String [] fname=new String[5];
      String [] lname=new String[5];
      int [] hours=new int[5];
      double [] payrate= new double[5];
      int count=0;
      while(in.hasNext())
      {
      fname[count]=in.next();
      lname[count]=in.next();
      hours[count]=in.nextInt();
      payrate[count]=in.nextDouble();
      count++;
      }

public class Employee{
public int getId(){return id;}
public double getPayRate(){return payRate;}
public double getHours() {return hours;}
public String getFname(){return fname;}
public String getLname(){return lname;}

public void setPayRate(double payRate){this.payRate=payRate;}
public void setHours(double hours) {this.hours = hours;}
public void setFname(String fname){ this.fname = fname;}
public void setLname(String lname){this.lname = lname;}

public Employee(int id,double payRate,double hours,String fname,String lname){
this.id = id; this.payRate = payRate; this.hours = hours;
this.fname = fname; this.lname = lname;
}

public double getTotalPay(){
return hours * payRate;
}

public String toString(){
return "Employee Name : " + getFname() + " " + getLname()
+ ", Total Work Hours : " + getHours() + ", "
+ "PayRate : " + getPayRate() + ", "
+ "Total Gross Pay : " + getTotalPay();
}
}
class PayRoll{

private ArrayList<Employee> employees;

public PayRoll(){
employees = new ArrayList<Employee>();
}

public void Add(Employee em){
employees.add(em);
}

public Employee Search(int Id){
for(Employee em : employees){
if(em.getId() == Id)return em;
}
return null;
}

public Employee Remove(int Id){
Employee em = null;
for(Employee e : employees){
if(e.getId() == Id){
em = e;
}
}
if(em!=null)employees.remove(em);
return em;
}

public void Update(int Id,Employee updatedEmployee){
for(Employee e : employees){
if(e.getId() == Id){
e = updatedEmployee;return ;
}
}
}


public ArrayList<Employee> allAbove40(){
ArrayList<Employee> ems = new ArrayList<Employee>();
for(Employee em : employees){
if(em.getHours() >= 40){
ems.add(em);
}
}
return ems;
}

public void totalGrossPay(){
for(Employee em : employees){
System.out.println(em);
}
}

public double totalPayOutWeek(){
double total = 0;
for(Employee em : employees){
total += em.getTotalPay()*7;
}
return total;
}
}
public class Main {
 
public static void main(String[] args) {
PayRoll payRoll = new PayRoll();

payRoll.Add(new Employee(
1,10.0,20.0,"Wayne","Bruce"
));
payRoll.Add(new Employee(
2,30.0,45.0,"Wonder","Boy"
));
payRoll.Add(new Employee(
3,50.0,47.0,"John","Cena"
));

System.out.println("Employees above 40hrs : ");
ArrayList<Employee> ems = payRoll.allAbove40();
for(Employee em : ems){
System.out.println(em);
}

System
