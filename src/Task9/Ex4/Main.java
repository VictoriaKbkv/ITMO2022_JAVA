package Task9.Ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 3;
        int min = 0;
        int max = 10000;
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        List<User> userList= new ArrayList<>();
        Map<User, Integer> map = new HashMap<>();

        for (int i = 0; i<10; i++){
            for (int j=0; j<targetStringLength; j++){
                int letterCode = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
                builder.append((char)letterCode);
            }
            User newUser = new User(builder.toString());
            userList.add(newUser);
            map.put(newUser, min + (int)(random.nextFloat() * (max - min + 1)));
            builder.setLength(0);
        }

        for(Map.Entry<User, Integer> pair: map.entrySet()) {
            System.out.print(pair.getKey().getName() + " ");
            System.out.println(pair.getValue());
        }

        System.out.println();
        System.out.println("Enter user name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Integer targetIndex = null;
        for (int i =0; i<userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) {
                targetIndex = i;
            }
        }
        if (targetIndex != null) {
            System.out.println("Score: " + map.get(userList.get(targetIndex)));
        } else {
            System.out.println("No user with name " + name);
        }


    }
}
