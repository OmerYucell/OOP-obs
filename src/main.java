public class main {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("Mahmut Hoca","235325458","THR");
    Teacher t2 = new Teacher("Hasan","25525","FZK");
    Teacher t3 = new Teacher("Hüseyin","0005","BİO");

        Course tarih = new Course("Tarih","101","THR");
        tarih.AddTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.AddTeacher(t2);
        Course biyo = new Course("Biyoloji","103","BİO");
        biyo.AddTeacher(t3);

    Student s1 = new Student("Omer","18","4",tarih,fizik,biyo);
    s1.addBullExamNote(70,70,70,70,70,70);

    s1.isPass();






    }
}
