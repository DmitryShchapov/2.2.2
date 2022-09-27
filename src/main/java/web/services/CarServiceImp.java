package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> resultCars(int count) {
        return carDao.resultCars(count);
    }
}
