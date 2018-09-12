class Operations
{
public static void main(String args[])
{
 
Calculator calc=new Calculator();

calc.Calcinputone=Integer.parseInt(args[0]);
calc.Calcinputtwo=Integer.parseInt(args[1]);
System.out.println(" "+calc.addition(calc.Calcinputone,calc.Calcinputtwo)+" "+calc.subtraction(calc.Calcinputone,calc.Calcinputtwo)+ " "+calc.multiplication(calc.Calcinputone,calc.Calcinputtwo)+" "+calc.division(calc.Calcinputone,calc.Calcinputtwo));
System.out.println(calc.addition(calc.Calcinputone,calc.Calcinputtwo));

System.out.println(calc.subtraction(calc.Calcinputone,calc.Calcinputtwo));

System.out.println(calc.multiplication(calc.Calcinputone,calc.Calcinputtwo));

System.out.println(calc.division(calc.Calcinputone,calc.Calcinputtwo));


}
}



