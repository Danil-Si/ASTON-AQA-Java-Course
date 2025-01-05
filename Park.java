public class Park {
    private String parkName;
    private Attraction[] attractions;

    public Park(String parkName, int attractionCount) {
        this.parkName = parkName;
        this.attractions = new Attraction[attractionCount];
    }

    // Метод добавления аттракциона
    public void addAttraction(int index, String name, String workingHours, double cost) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, cost);
        }
    }

    // Вывод информации о парке и аттракционах
    public void printParkInfo() {
        System.out.println("Парк: " + parkName);
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }
    }
}
