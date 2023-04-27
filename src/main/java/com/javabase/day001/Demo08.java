package com.javabase.day001;

public class Demo08 {
    public static void main(String[] args) {
        SmallStudent smallStudent= new SmallStudent ();
        BmStudent bmStudent = new BmStudent (11,"张");
        PriStudent priStudent = new PriStudent (12,"李");
        bmStudent.setId_Number (888);
        smallStudent.id =666;
        smallStudent.age= 12;
        System.out.println (bmStudent.getId_Number ());
        System.out.println (priStudent.getId_Number ());
        System.out.println (smallStudent.study());
    }

}
class AllStudent{
    int id;
    String name;
    public String  study(){
        return id+name+"\n";
    }
}
class SmallStudent extends AllStudent{
    int age;


}
class PriStudent extends  BmStudent {
    PriStudent(int id_number, String name_string) {
        super (id_number, name_string);
    }
}

class BmStudent{
    private int id_Number;
    private String name_String;

    public int getId_Number() {
        return id_Number;
    }

    public void setId_Number(int id_Number) {
        this.id_Number = id_Number;
    }

    public String getName_String() {
        return name_String;
    }

    public void setName_String(String name_String) {
        this.name_String = name_String;
    }

    BmStudent(int id_number, String name_string) {
        id_Number = id_number;
        name_String = name_string;
    }

}


