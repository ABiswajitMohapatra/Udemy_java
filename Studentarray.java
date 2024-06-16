public class Studentarray {
    public static void main(String[] args) {
        Student s[]=new Student[3];
        s[0]= new Student("John", 25,89.4f,90.1f);
        s[1]= new Student("Johncena", 26,81.9f,99.1f);
        s[2]= new Student("Johngvhb", 27,86.5f,92.1f);
        for(Student item:s){
            System.out.println(item);
        }

    }
}
class Student{
    private String name;
    private int subid;
    private float maxmarks;
    private float marksobt;
    public Student(String name,int subid,float maxmarks,float marksobt){
        this.name=name;
        this.subid=subid;
        this.maxmarks=maxmarks;
        this.marksobt=marksobt;
    }
    public String getName(){
        return name;
    }
    public int  getSubId(){
        return subid;
    }
    public float getMaxmarks(){
        return maxmarks;
    }
    public float getMarksobt(){
        return marksobt;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSubid(int subid){
        this.subid=subid;
    }
    public void setMaxmarks(float maxmarks){
        this.maxmarks=maxmarks;
    }
    public void setMarksobt(float marksobt){
        this.marksobt=marksobt;
    }
    public String Display(){
        return "\nname"+name+",Subject id:"+subid+"\nmaximum marks : "+maxmarks +"\nobtained marks : "+marksobt;
    }
}