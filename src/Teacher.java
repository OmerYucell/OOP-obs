public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno,String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }



    void print(){
        System.out.println("Öğretmen İsmi :" + this.name);
        System.out.println("Tel no :" + this.mpno);
        System.out.println("Baranşı :" + this.branch);
    }
}
