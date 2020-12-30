package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("002", "Paul", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("003", "Phil", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("004", "Guillaume", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("005", "Francis", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("006", "George", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("007", "Louis", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("008", "Mateo", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("009", "April", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("010", "Louise", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("011", "Elodie", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("012", "Helene", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("013", "Fanny", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("014", "Laura", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("015", "Gertrude", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("016", "Chloé", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("017", "April", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("018", "Marie", "https://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new User("019", "Henri", "https://i.pravatar.cc/150?u=a042581f4e29026704e"),
            new User("020", "Rémi", "https://i.pravatar.cc/150?u=a042581f4e29026704e")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://i.pravatar.cc/150?u=a042581f4e29026704f"),
            new User("022", "Geoffrey", "https://i.pravatar.cc/150?u=a042581f4e29026704a"),
            new User("023", "Simon", "https://i.pravatar.cc/150?u=a042581f4e29026704a"),
            new User("024", "André", "https://i.pravatar.cc/150?u=a042581f4e29026704a"),
            new User("025", "Leopold", "https://i.pravatar.cc/150?u=a042581f4e29026704a")
    );
}
