package Concepts.ObjectComparision.DeepComparision;

public class CustomObjectDeepComparision {

    public static void main(String[] args){

        Student st1 = new Student(10, "Anoop");
        Student st2 = new Student(10, "Singh");
        Student st3 = st1;

        System.out.println(System.identityHashCode(st1));

        System.out.println(System.identityHashCode(st2));

        System.out.println(System.identityHashCode(st3));

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));





    }


}

class Student{

    int id;
    String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }




    public int getId() {
        return id;
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

    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student)obj;
        return (this.getId() == student.getId());
}


}
