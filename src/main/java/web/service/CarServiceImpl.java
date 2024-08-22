package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carCount(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 2024, 100));
        list.add(new Car("Porsh", 2023, 10_000));
        list.add(new Car("Toyota", 2010, 50_000));
        list.add(new Car("Kia", 2013, 250_000));
        list.add(new Car("Lada", 2000, 400_000));

        if (count > 5) {
            return list;
        } else {
            return list.stream().limit(count).collect(Collectors.toList());
        }
    }

}
