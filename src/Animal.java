/**
 * Created by Administrator on 2016/7/6.
 */
public class Animal implements Talking{
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("I am a " + getName() +" ~");

    }

}
