package javareview;

public class Student {
    //---- access specifier / access modifier ----
    // ---- ตัวระบบการเข้าถึงตัวแปรและเมทอด มี 4 ระดับ
    // private, public , package (default), protected
    //---- field, attribute, instance variable----

    // ------ 1. field, attribute, instance variable -----

   private  int id;
   private String name;
   private double midtermScore;
   private double finalScore;

    // ------ 2. constructor -----
    // ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id,String name) {
        this.id = id;
        this.name = name;


    }


    //---- method (คล้ายฟังก์ชั่น) -----

    double getTotalScore(){
        double total = midtermScore + finalScore;
        return total ;

    }

    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;

    }

    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;

    }

    public void  setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }

    public void setName(String name){
        this.name = name;
    }

public String toString(){
        return id + "---" +name;

}

}
