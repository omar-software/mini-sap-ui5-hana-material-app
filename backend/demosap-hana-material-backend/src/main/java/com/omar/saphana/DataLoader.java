package com.omar.saphana;

import com.omar.saphana.entity.Material;
import com.omar.saphana.repository.MaterialRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MaterialRepository materialRepository;

    public DataLoader(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Override
    public void run(String... args) {

        // Nur Beispieldaten erstellen, wenn die Tabelle leer ist
        if (materialRepository.count() == 0) {

            Material material1 = new Material(
                    "MAT-1001",
                    "Laptop Lenovo ThinkPad",
                    "STK",
                    3,
                    3
            );

            Material material2 = new Material(
                    "MAT-1002",
                    "Monitor Samsung",
                    "STK",
                    8,
                    2
            );

            materialRepository.save(material1);
            materialRepository.save(material2);
        }
    }
}
