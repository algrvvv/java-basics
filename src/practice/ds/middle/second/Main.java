package practice.ds.middle.second;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.addPhone("John", "987654321");
        pb.addPhone("Bob", "123456789");
        pb.addPhone("Jack", "321987645");

        pb.printPhoneBook();

        String foundedPhoneByName = pb.getPhone("Bob");
        System.out.println(foundedPhoneByName);

        pb.removePhone("Bob");

        String notFoundedPhoneByName = pb.getPhone("Bob");
        System.out.println(notFoundedPhoneByName);

        pb.printPhoneBook();
    }
}
