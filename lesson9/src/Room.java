public class Room {

    private int students;
    private int places;

    private Room room;

    public Room() {
    }

    /*
    public Room(int stud, int pl) {
        students = stud;
        places = pl;
    }
    */

    public static Room createRoom(int stud, int pl) {
        Room room = new Room();
        room.students = stud;
        room.places = pl;
        return room;
    }

    public void addStudent() {
        if (places > students) {
            students++;
        } else {
            handleNoSeats();
        }
    }

    private void handleNoSeats() {
        System.out.println("No places left");
    }
}
