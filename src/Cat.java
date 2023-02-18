public class Cat extends Animal implements Pet{
    String Catname;
    public Cat(){
        super(4);
    }
    public Cat(String Catname){
        super(4);
        this.Catname=Catname;
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public String getName() {
        return this.Catname;
    }

    @Override
    public void setName(String name) {
        this.Catname=name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing.");
    }
}
