public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Андрей", "муж.", 33, "№1","собака");
        Persona son = new Persona("Дмитрий", "муж.", 12, "№2","кошка");
        Persona daughter = new Persona("Анна", "жен.", 7, "№3","попугай");

        papa.PersLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        son.PersLibr.AddBook("Горький", "На дне", "RU");
        daughter.PersLibr.AddBook("Носов", "Незнайка на луне", "RU");

        papa.Pets.AddAnimal("Рекс", "бигль", 8);
        son.Pets.AddAnimal("Муся", "сибирская", 4);
        daughter.Pets.AddAnimal("Кеша", "ара", 2);
     
        System.out.println("*".repeat(25));
        view.personView(papa);
        view.bookView(papa);
        view.animalView(papa);
        System.out.println("*".repeat(25));
        view.personView(son);
        view.bookView(son);
        view.animalView(son);
        System.out.println("*".repeat(25));
        view.personView(daughter);
        view.bookView(daughter);
        view.animalView(daughter);
    }
}