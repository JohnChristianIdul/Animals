public class Fish extends Animal implements Pet{
    String Fishname;
    public Fish(){
        super(0);
    }
    public Fish(String fishname){
        super(0);
        this.Fishname=fishname;
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating.");
    }

    @Override
    public String getName() {
        return Fishname;
    }

    @Override
    public void setName(String name) {
        this.Fishname=name;
    }

    @Override
    public void play() {
        System.out.println("The fish is playing");
    }
}
