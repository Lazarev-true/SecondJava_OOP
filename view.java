public class view {

    public static void personView(Persona root){
        System.out.println( root.GetName() + " " + root.GetGender() + " " + root.GetAge() );
        for (var a: root.getListName()) {
            System.out.println(a.GetName() + " " + a.GetGender() + " " + a.GetAge());
        }
    }

    public static void bookView(Persona root){
        System.out.println("имя библиотеки - " + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }

    public static void animalView(Persona root){
        System.out.println("животное: " + root.Pets.animal);
        for (var a: root.Pets.list) {
            System.out.println(a.bNickname + " " + a.bBreed+ " " + a.bAge);
        }
    }
}