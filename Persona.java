import java.util.ArrayList;

public class Persona extends Human {
    public Library PersLibr;
    public Pet Pets;

    public Persona(String Name, String Gender, int Age, String persLibr, String pet) {
        SetGender(Gender);
        SetName(Name);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
        this.Pets = new Pet(pet);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void pBook(){
    }
}