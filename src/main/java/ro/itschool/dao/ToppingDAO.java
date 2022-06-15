package ro.itschool.dao;

import ro.itschool.entity.Pancake;
import ro.itschool.entity.Topping;

import java.util.List;

public interface ToppingDAO {


    void createTopping(Topping topping);

    Topping createToppingAndReturnIt(Topping topping);

    List<Topping> getAllTopping();

    Topping getToppingById(int id) throws Exception;

    Topping updateToppingById(Topping pancake);

    void deleteTopping(int id);

}


