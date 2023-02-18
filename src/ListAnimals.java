public class ListAnimals {
    private Animal[] animals;
    private int count;

    public ListAnimals(int maxArray){
        animals = new Animal[maxArray];
        count = 0;
    }

    public boolean addAnimal(Animal a) {
        if (count > animals.length) {
            System.out.println("List is already full");
            return false;
        }
        String temp1 = ((Pet)a).getName();
        String temp2 = null;
        for (int i = 0; i < count; i++) {
            temp2 = ((Pet)animals[i]).getName();
            if(temp1.equals(temp2)){
                System.out.println("Name must be unique");
                System.out.println("");
                return false;
            }
        }
        animals[count] = a;
        count++;
        return true;

    }

    public Animal searchByName(String name){
        for(int i = 0; i<count; i++){
            if(animals[i] instanceof Pet){
                if(((Pet) animals[i]).getName().equals(name)){
                    return animals[i];
                }
            }
        }
        return null;
    }

    public Animal deleteAnimal(String name){
        for(int i = 0; i <=count; i++) {
            if (searchByName(name) != null) {
                Animal deleted = searchByName(name);
                animals[i] = animals[i+1];
                animals[count-1]=null;
                count--;
                return deleted;
            }
        }
        return null;
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(((Pet)animals[i]).getName() + " is in the list and is a " + animals[i].getClass().getSimpleName() + ".");
        }
    }
}
