package JavaPrograms;
/** Write a Java programme using the following steps.
*4.1 Declare two instance and two static variables.
 *4.2 Declare one instance method.
 *4.3 Declare one static method.
 *4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 *4.5 Declare the Main method.
 *4.6 Call both instance and static methods into the Main method and run the programme
*/
public class JavaProgramme4 {

 int a = 30;
 int b = 40;
 static int c = 10;
 static int d = 20;

 public static void main(String[] args){
  JavaProgramme4 obj = new JavaProgramme4();
  obj.instance();
  declare();
 }
 public void instance(){
     System.out.println(a);
     System.out.println(b);
     JavaProgramme4 obj1 = new JavaProgramme4();
     System.out.println(obj1.c);
     JavaProgramme4 obj2 = new JavaProgramme4();
     System.out.println(obj2.d);
 }
 public static void declare(){
  JavaProgramme4 obj3 = new JavaProgramme4();
  System.out.println(obj3.a);
  JavaProgramme4 obj4 = new JavaProgramme4();
  System.out.println(obj3.b);
  System.out.println(c);
  System.out.println(d);

 }

}
