package ro.itschool.dao;

import ro.itschool.entity.Brownie;

import java.util.List;

public interface BrownieDAO {

    void createBrownie(Brownie brownie);

    Brownie createBrownieAndReturnIt(Brownie brownie);

    List<Brownie> getAllBrownies();

    Brownie getBrownieById(int id) throws Exception;

    Brownie updateBrownieById(Brownie brownie);

    void deleteBrownie(int id);
}
