package com.boutique.data;

import com.boutique.enums.Role;
import com.boutique.model.User;
import com.boutique.util.DataStore;
import com.boutique.util.IdGenerator;
import com.boutique.util.PasswordUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    private UserDAO userDAO;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().reset();
        userDAO = new UserDAO();
    }

    @Test
    void save_addsUserToStore() {
        User user = new User(IdGenerator.nextUserId(), "testuser",
                PasswordUtil.hash("pass1234"), "Test User", Role.STAFF);
        userDAO.save(user);
        Optional<User> found = userDAO.findByUsername("testuser");
        assertTrue(found.isPresent());
    }

    @Test
    void findByUsername_existingUser_returnsUser() {
        Optional<User> found = userDAO.findByUsername("admin");
        assertTrue(found.isPresent());
        assertEquals("admin", found.get().getUsername());
    }

    @Test
    void findByUsername_nonExistentUser_returnsEmpty() {
        Optional<User> found = userDAO.findByUsername("nobody");
        assertTrue(found.isEmpty());
    }

    @Test
    void findByUsername_caseInsensitive_returnsUser() {
        Optional<User> found = userDAO.findByUsername("ADMIN");
        assertTrue(found.isPresent());
    }

    @Test
    void findById_existingUser_returnsUser() {
        Optional<User> admin = userDAO.findByUsername("admin");
        String id = admin.get().getUserId();
        Optional<User> found = userDAO.findById(id);
        assertTrue(found.isPresent());
    }

    @Test
    void findById_nonExistentId_returnsEmpty() {
        Optional<User> found = userDAO.findById("USR-9999");
        assertTrue(found.isEmpty());
    }

    @Test
    void getAll_returnsDefensiveCopy() {
        List<User> list1 = userDAO.getAll();
        List<User> list2 = userDAO.getAll();
        assertNotSame(list1, list2);
    }

    @Test
    void update_changesUserFields() {
        Optional<User> admin = userDAO.findByUsername("admin");
        User updated = admin.get();
        updated.setFullName("Updated Name");
        userDAO.update(updated);
        Optional<User> found = userDAO.findByUsername("admin");
        assertEquals("Updated Name", found.get().getFullName());
    }
}