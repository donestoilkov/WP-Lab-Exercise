package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Balloon;

import java.util.List;
import java.util.Optional;

public interface BalloonService {
    List<Balloon> listAll();

    List<Balloon> searchByNameOrDescription(String text);

    void deleteById(Long id);

    Balloon save(String name, String description, Long manufacturerId, Long balloonID);

    Optional<Balloon> findById(Long id);

    List<Balloon> filteredByManufacturerNameOrCountry(String manufacturerName,String manufacturerCountry);
}
