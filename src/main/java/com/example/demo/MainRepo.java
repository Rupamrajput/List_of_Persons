package com.example.demo;

import java.util.List;

public interface MainRepo {
    /**
     * Deletes a visitor if known.
     *
     * @param person The visitor to delete.
     */
    void delete(Person person);

    /**
     * Finds all visitors.
     *
     * @return A {@link List} of {@link Person}s.
     */
    List<Person> findAll();

    /**
     * Saves a visitor if not already known.
     *
     * @param person The visitor to save.
     */
    void save(Person person);
}
