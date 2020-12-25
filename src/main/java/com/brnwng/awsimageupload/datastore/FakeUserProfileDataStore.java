package com.brnwng.awsimageupload.datastore;

import com.brnwng.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("39289a84-88d0-48ce-a41d-604f9213f38a"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("6359bf3a-71ef-4658-9ad7-19cfbdb74668"), "brnwng",null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
