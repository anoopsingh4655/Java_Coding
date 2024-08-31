package Concepts.ObjectComparision.ShollowComparision;

public class CustomObjectShollowComparision {

    public static void main(String[] args){

        Employees emp1 = new Employees(10, "Anooop");
        Employees emp2 = new Employees(10, "Anoop");
        Employees emp3 = emp1;

        System.out.println(emp1 == emp2);
        System.out.println(emp1 == emp3);

        

    }

}

 class Employees{
    int id;
    String name;


    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }





}
