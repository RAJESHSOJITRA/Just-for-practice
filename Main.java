class Student{
    String name;
    int age;
    

    //Polymorphism  same function used 
    //same fuction one class
    
    public void printinfo(String name){

        System.out.println(name);

    }
    public void printinfo(int age){
    System.out.println(age); 
    }

    public void printinfo(String name,int age){
        System.out.println(name+" "+age);
    }
    



    } 

public class Main{
    public static void main(String args[])
    {
       
        Student s1=new Student ();
        s1.name="rajesh sojitra";
        s1.age =21;

        s1.printinfo(s1.name , s1.age);
        }

}




//class  and  objects


//     public void write(){
//         System.out.println("this is pen used for pen1  write somethig");
//     }
//     public void info(){
//         System.out.println(this.name);
//         System.out.println(this.type);
//         System.out.println(this.color);
        
// }
//     }
//     class   Student{
//         String name;
//         int age;
    
//      public void printinfo()   {
//         System.out.println(this.name);
//         System.out.println(this.age);

//         }

//       Student(String name,int age)  {
//         this.name=name;
//         this.age=age;

        

        //object or perameterised constructor

        // Student (){
        //     System.out.println("this is consutructor");
        // }